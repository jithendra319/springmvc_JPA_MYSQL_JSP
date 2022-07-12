package com.crud1.controller;

import com.crud1.student;
import com.crud1.Repo.Studentrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Homecontroller {
	@Autowired
	Studentrepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/insert")
	public String insert(student s1) {
		repo.save(s1);
		return "home.jsp";
	}
	
}
