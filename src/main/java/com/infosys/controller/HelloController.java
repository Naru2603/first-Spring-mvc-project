package com.infosys.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController{

	@RequestMapping("/hello")
	public ModelAndView handleRequest(@RequestParam("name") String name, @RequestParam("address") String address) throws Exception {
		
		Map<String, String> map = new HashMap();
		map.put("name", name);
		map.put("address", address);
		
		return new ModelAndView("welcome", map);
	}

}
