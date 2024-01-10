package com.anime.book.favtoons.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingPage {
	
	@RequestMapping("/")
	public String landingPage()
	{
		return "Welcome";
	}

}
