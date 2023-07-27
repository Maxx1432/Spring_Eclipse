package com.maxx.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.maxx.spring.DAO.AppDAOImpl;
import com.maxx.spring.config.AppConfig;
import com.maxx.spring.model.Users;

import jakarta.validation.Valid;

@Controller
public class AppController {

	@RequestMapping("/")
	public ModelAndView homepage() {
		ModelAndView model = new ModelAndView("index");
		List<Users> userss = new ArrayList<Users>();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);
		userss = DAO.listUserss();
		model.addObject("userss", userss);
		System.out.println(userss);
		return model;
	}

	@RequestMapping("/addUser")
	public String addUser(Model model, @Valid Users userss, BindingResult result) {
		if (result.hasErrors()) {
			model.addAttribute("userss", userss);
			return "addUser";
		} else {
			if (userss.getName() != null && userss.getEmail() != null) {
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
				AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);
				DAO.addUsers(userss);
				return "forward:/";
			} else {
				System.out.println("Loading form");
				return "addUser";
			}

		}
	}
	
}
