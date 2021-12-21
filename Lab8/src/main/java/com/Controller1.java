package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller1 {
	@RequestMapping("/")
	public String Index() {
		return "Index";
	}
	
	@RequestMapping("/Display")
	public String Display(@RequestParam String product_id,@RequestParam String product_name,@RequestParam String product_price, Model m) {
		m.addAttribute("product_id",product_id);
		m.addAttribute("product_name",product_name);
		m.addAttribute("product_price",product_price);
		return "Display";
	}
	
	

}
