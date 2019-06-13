package com.bawei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("list")
	public String goList() {
		//啥哈哈
		return "list";
	}
	
}
