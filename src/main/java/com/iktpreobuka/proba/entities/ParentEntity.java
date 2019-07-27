package com.iktpreobuka.proba.entities;




import javax.persistence.Entity;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table (name = "Parent")
public class ParentEntity extends UserEntity{

	public ParentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParentEntity(Integer userId, String name, String lastName, String username, String password, String email,
			RoleEntity role) {
		super(userId, name, lastName, username, password, email, role);
		// TODO Auto-generated constructor stub
	}



	
}
