package com.koreait.matjip.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.koreait.matjip.model.restrt.RestrtService;

@Controller
public class MainController {
	
	@Autowired
	private RestrtService restrtService;
	
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public ModelAndView getMain() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("matjip/index");
		
		return mav;
	}
	
}
