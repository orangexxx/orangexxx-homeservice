package com.orangexxx.home.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orangexxx.home.beans.HomeInfo;
import com.orangexxx.home.service.ServiceFactory;


@RestController
public class HomeInfoController {

	@RequestMapping("/homeInfo")
	public List<HomeInfo> homeInfo(@RequestParam(value="page", defaultValue="0") int page, 
			@RequestParam(value="pageSize", defaultValue="30") int pageSize,
			@RequestParam(value="title", defaultValue="") String title,
			@RequestParam(value="space", defaultValue="") String space,
			@RequestParam(value="style", defaultValue="") String style,
			@RequestParam(value="part", defaultValue="") String part,
			@RequestParam(value="shape", defaultValue="") String shape,
			@RequestParam(value="stuff", defaultValue="") String stuff,
			@RequestParam(value="designer", defaultValue="") String designer,
			@RequestParam(value="budget", defaultValue="") String budget,
			@RequestParam(value="size", defaultValue="") String size,
			@RequestParam(value="feel", defaultValue="") String feel,
			@RequestParam(value="color", defaultValue="") String color) {
		
		Map<String, String> params = new HashMap<String,String>();
		params.put(HomeInfo.HOME_INFO_TITLE, title);
		params.put(HomeInfo.HOME_INFO_SPACE, space);
		params.put(HomeInfo.HOME_INFO_STYLE, style);
		params.put(HomeInfo.HOME_INFO_PART, part);
		params.put(HomeInfo.HOME_INFO_SHAPE, shape);
		params.put(HomeInfo.HOME_INFO_STUFF, stuff);
		params.put(HomeInfo.HOME_INFO_DESIGNER, designer);
		params.put(HomeInfo.HOME_INFO_BUDGET, budget);
		params.put(HomeInfo.HOME_INFO_SIZE, size);
		params.put(HomeInfo.HOME_INFO_FEEL, feel);
		params.put(HomeInfo.HOME_INFO_COLOR, color);
		return ServiceFactory.getHomeInfoService().queryObjectByColumn(params, page, pageSize);
	}
}
