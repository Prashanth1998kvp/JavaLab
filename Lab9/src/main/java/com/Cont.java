package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Cont {
	@RequestMapping("/")
	public String Index() {
		return "Index";
	}
	
	@RequestMapping("/Display")
	public String Display(@RequestParam String custid, @RequestParam String custname, @RequestParam String custprice, Model m) {
		if(custname.length()>4) {
			m.addAttribute("err","wrong name");
			return "Err";
		}
		else {
			m.addAttribute("custid",custid);
			m.addAttribute("custname",custname);
			m.addAttribute("custprice",custprice);
			return "Display";
		}
	}

}
