package com.maxx.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.maxx.spring.DAO.AppDAOImpl;
import com.maxx.spring.model.Users;

@Controller
public class AppController {
	
	@RequestMapping("/")
	public ModelAndView homepage() {
		ModelAndView model = new ModelAndView("index");
		List<Users> userss = new ArrayList<Users>();
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("/com/maxx/spring/DAO/Spring-AppDAOConfig.xml");
		AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);
		userss = DAO.listUserss();
		System.out.println(userss);
		return model;
	}
}
