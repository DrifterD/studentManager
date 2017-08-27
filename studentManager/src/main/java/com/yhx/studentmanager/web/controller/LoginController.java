package com.yhx.studentmanager.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(value="/")
	public ModelAndView LoginIndex(HttpServletRequest request,HttpServletResponse response){		
		ModelAndView mav=new ModelAndView("login");
		response.setCharacterEncoding("UTF-8");
		return mav;
	}
}
