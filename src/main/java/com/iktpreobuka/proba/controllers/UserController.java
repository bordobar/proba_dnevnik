package com.iktpreobuka.proba.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.proba.entities.RoleEntity;
import com.iktpreobuka.proba.entities.UserEntity;

@RestController
public class UserController {
	public List<UserEntity> getDummyDB() {
		List<UserEntity> list = new ArrayList<>();

		RoleEntity adm = new RoleEntity();
		adm.setId(1);
		adm.setName("admin");
		RoleEntity stud = new RoleEntity();
		stud.setId(2);
		stud.setName("student");
		RoleEntity prof = new RoleEntity();
		prof.setId(3);
		prof.setName("teacher");
		RoleEntity rod = new RoleEntity();
		rod.setId(4);
		rod.setName("parent");
		
		UserEntity u1 = new UserEntity();
		u1.setName("jova");
		u1.setLastName("jovic");
		u1.setUsername("voja");
		u1.setPassword("123");
		u1.setEmail("jova@jova.com");
		u1.setRole(adm);
		
		UserEntity u2 = new UserEntity();
		u2.setName("jona");
		u2.setLastName("jon");
		u2.setUsername("von");
		u2.setPassword("123");
		u2.setEmail("jon@jon.com");
		u2.setRole(prof);
		
		UserEntity u3 = new UserEntity();
		u3.setName("java");
		u3.setLastName("javic");
		u3.setUsername("java");
		u3.setPassword("123");
		u3.setEmail("java@java.com");
		u3.setRole(stud);
		
		list.add(u1);
		list.add(u2);
		list.add(u3);
		
		return list;
		
		
		
		}
	@RequestMapping(path = "/users", method = RequestMethod.GET)
	public ResponseEntity<?> listUsers() {
		return new ResponseEntity<List<UserEntity>>(getDummyDB(), HttpStatus.OK);
	}
}
