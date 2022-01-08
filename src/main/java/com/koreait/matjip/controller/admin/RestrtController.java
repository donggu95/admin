package com.koreait.matjip.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.koreait.matjip.domain.Restrt;
import com.koreait.matjip.model.restrt.RestrtService;


//관리자의 맛집과 관련된 요청을 처리하는 하위 컨트롤러
@Controller
public class RestrtController{
		
	@Autowired
	private RestrtService restrtService;
	
	
	//맛집 목록 요청
	@GetMapping("/matjip/list")
	public String getList(Model model) {
		
		return "admin/matjip/list";
	}
	
	//맛집 등록 폼 요청
	@GetMapping("/restrt/registform")
	public String registForm() {
		
		return "admin/restrt/registform";
	}
	
	@RequestMapping(value="/restrt/regist", method=RequestMethod.POST)
	public String regist(Restrt restrt) {
		
		//db 넣기
		restrtService.regist(restrt); //restrt 테이블
		
		
		return "redirect:/admin/restrt/listRestrt";
	}
	
}













