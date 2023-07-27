package com.maxx;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.maxx.model.User;

import jakarta.validation.Valid;


@Controller
public class MainController {
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndViewForm = new ModelAndView("userFormView");
		User user = new User();
		modelAndViewForm.addObject("user",user);
		return modelAndViewForm;
	}
	
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@ModelAttribute @Valid User user, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("displayUserInfo");
		modelAndView.addObject("user",user);
		if(result.hasErrors())
		{
			ModelAndView repopulateModelAndViewForm = new ModelAndView("userFormView");
			
			repopulateModelAndViewForm.addObject("user",user);
			
			System.out.println("Has Errors!!!");
			return repopulateModelAndViewForm;
		}
		return modelAndView;
	}
}
