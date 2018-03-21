package com.therealdanvega.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/posts")
@RestController
public class PostController {

	@Secured("ROLE_GUEST")
	@RequestMapping("/list")
	public String list(){
		return "list posts...";
	}

	@Secured("ROLE_USER")
	@RequestMapping("/drafts")
	public String viewDrafts(){
		return "views drafts...";
	}
	
	@Secured("ROLE_ADMIN")
	@RequestMapping("/add")
	public String addPost(){
		return "add posts...";
	}
	
	
}
