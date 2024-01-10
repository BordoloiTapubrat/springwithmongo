package com.anime.book.favtoons.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anime.book.favtoons.services.DBFetch;

@RestController
public class GetAllCharacters {
	
	@Autowired
	private DBFetch dbFetchall;
	
	@RequestMapping("/all")
	public String getAll()
	{
		return dbFetchall.queryDBFetchAll();
	}
	
	@RequestMapping("/select/{id}")
	public String getOne(@PathVariable String id)
	{
		return dbFetchall.queryDBFetchOne(id);
	}

}
