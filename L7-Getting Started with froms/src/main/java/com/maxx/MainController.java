package com.maxx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "hello";
	}
	
	@GetMapping("displayname")
	public ModelAndView displayName(@RequestParam("firstName") String firstName) {
		ModelAndView modelAndView = new ModelAndView("displayName");
		List<String> names = new ArrayList<>();
		names.add("Maxx");
		names.add("Aayu");
		names.add("Mahendra");
		names.add("Ayushi");
		
		Date date = new Date();
		modelAndView.addObject("date", date);
		modelAndView.addObject("name",firstName);
		modelAndView.addObject("team",names);
		return modelAndView;
	}
}
