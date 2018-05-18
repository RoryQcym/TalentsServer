package com.fbc.TalentsServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fbc.TalentsServer.service.UserService;

@RestController
public class Hello {
		@Autowired
	    private UserService userService;
		
	    @RequestMapping("/hello")
	    public String index() {
	        return "Hello World";
	    }
	    @RequestMapping("/insert")
	    public String insert(String name,String password,String phone) {
	    	userService.insert(name, password, phone);
	        return "Hello World";
	    }
	
}
