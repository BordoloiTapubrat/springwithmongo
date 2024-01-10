package com.anime.book.favtoons.services;

import org.springframework.stereotype.Service;

@Service
public class DBFetch {
	
	public String queryDBFetchAll()
	{
		return "Avengers";
	}

	public String queryDBFetchOne(String id)
	{
		return "Hulk "+id;
	}

}
