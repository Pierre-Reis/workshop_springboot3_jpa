package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.educandoweb.course.entities.User;

@Controller
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> finAll(){
	
		User user = new User(1L, "Pierre Eitel", "pierreeitel@hotmail.com","(15) 99849 - 9780", "oioi123");
	
		return ResponseEntity.ok().body(user);
	}
}
