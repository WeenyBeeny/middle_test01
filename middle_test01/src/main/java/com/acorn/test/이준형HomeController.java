package com.acorn.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class 이준형HomeController {

	@RequestMapping("/")
	public String test01() {
		
		return "test01";
	}
	
	@RequestMapping("/test02")
	public String test02() { 
		return "test02";
	}
	
	@RequestMapping("/test03")
	public String test03(HttpServletRequest request) {
		request.setAttribute("ZoomRefund", "줌 환불이 빠르긴 하군");
		return "test03";
	}
	
}
