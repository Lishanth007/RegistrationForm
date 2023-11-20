package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;
import com.example.demo.repo.IndexReposition;

@Controller
public class IndexController {
	// Auto wiring- @Autowired
	// Definition - this feature is used to automatically inject the project
	// dependencies
	@Autowired
	private IndexReposition reposit;

	// Mapping for the root directory
	@GetMapping("/")
	public String index() {
		return "index";
	}

	// Mapping for the registration form
	@PostMapping("/register")
	public String regForm(@ModelAttribute User user, Model mode) {

		System.out.println(user.toString());

		// addAttribute(), It transfers the name/value to another file,
		// It takes two parameters(String attributeName,Object AttributeName)

		// mode.addAttribute("firstname", user.getFname());
		// mode.addAttribute("lastname", user.getLname());

		User inserted = reposit.save(user);
		System.out.println("Data stored into database");
		return "welcome";
	}

	@RequestMapping("/find")
	public String newFile() {
		return "course";
	}

	@RequestMapping("/findjava")
	public String javacourse() {
		return "javaCourse";
	}

}
