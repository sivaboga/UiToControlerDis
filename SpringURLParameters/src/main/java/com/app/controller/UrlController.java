package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UrlController {
	@RequestMapping("/show")
	//this code is show the page
	public String showPage( 
		@RequestParam(value="ename",required=false,defaultValue="SIVA")String en,
		@RequestParam(value="eid",required=false,defaultValue="99")Integer id,
		@RequestParam(value="esal",required=false)Double sal,Model map)
		{
		System.out.println("ENAME is=="+en+",Id is:"+id);
		map.addAttribute("eid", id);
		map.addAttribute("ename",en);
		map.addAttribute("esal", sal);
		return "Home";
	}
}
