package com.orangexxx.home.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orangexxx.home.beans.HomeImage;
import com.orangexxx.home.service.ServiceFactory;

@RestController
public class HomeImageController {	

		@RequestMapping("/homeImage")
		public List<HomeImage> homeInfo(@RequestParam(value="page", defaultValue="0") int page,
				@RequestParam(value="pageSize", defaultValue="30") int pageSize,
				@RequestParam(value="homeID", defaultValue="") String homeID) {
					
			Map<String, String> params = new HashMap<String, String>();
			params.put(HomeImage.HOME_IMAGE_HOME_ID, homeID);
			return ServiceFactory.getHomeImageSerivce().queryObjectByColumn(params, page, pageSize);
		}
}
