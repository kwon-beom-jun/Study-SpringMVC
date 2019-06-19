package com.kitri.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kitri.hello.model.service.HelloService;

// controller라고 알려줘야 찾아냄. Spring Elements에서 볼 수 있음
@Controller
public class HelloController {

	private HelloService helloservice;
	
	
	public void setHelloservice(HelloService helloservice) {
		this.helloservice = helloservice;
	}


	// 지정하는 이유는 들어왔을때 메소드를 찾기 위함
	@RequestMapping("/hello.kitri")
	public ModelAndView greeting() {
		ModelAndView mav = new ModelAndView(); // request에 담는거라 생각하면 됨. session이랑은 다름. 보낼때 디폴트로 forword로 넘어감.
		String msg = helloservice.hello("권범준");
		mav.addObject("msg", msg);
		mav.setViewName("result"); // 설정을 해둬서 result만 붙이면 result.jsp로 알아서 가짐
		return mav;
	}
	
}
