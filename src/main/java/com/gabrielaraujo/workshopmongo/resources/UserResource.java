package com.gabrielaraujo.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielaraujo.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User gabriel = new User("1", "Gabriel Araujo", "matadoxx@gmail.com");
		User israel = new User("2", "Israel Araujo", "isra_uni@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(gabriel, israel));
		return ResponseEntity.ok().body(list);
	}
	
}
