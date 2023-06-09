package com.maxx;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.maxx.model.User;


@Controller
public class MainController {
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("userFormView");
		User user = new User();
		
		Map<String, String> genderMap = new HashMap<String, String>();
		genderMap.put("male", "Male");
		genderMap.put("female", "Female");
		
		Map<String, String> countryMap = new HashMap<String, String>();
		countryMap.put("India", "IND");
		countryMap.put("United State", "USA");
		countryMap.put("United Kingdom", "UK");
		
		modelAndView.addObject("countryMap", countryMap);
		modelAndView.addObject("genderMap",genderMap);
		modelAndView.addObject("user",user);
		return modelAndView;
	}
	
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(User user) {
		ModelAndView modelAndView = new ModelAndView("displayUserInfo");
		modelAndView.addObject("user",user);
		return modelAndView;
	}
}
