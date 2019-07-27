package com.iktpreobuka.proba.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table (name ="Teacher")
public class TeacherEntity extends UserEntity{

	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "subject")
	private SubjectEntity subject;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "grading")
	private GradingEntity grading;

	public TeacherEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeacherEntity(Integer userId, String name, String lastName, String username, String password, String email,
			RoleEntity role) {
		super(userId, name, lastName, username, password, email, role);
		// TODO Auto-generated constructor stub
	}

	public TeacherEntity(Integer teachId, String name, String lastName, List<UserEntity> users, SubjectEntity subject,
			GradingEntity grading) {
		super();
	
		this.subject = subject;
		this.grading = grading;
	}

	public GradingEntity getGrading() {
		return grading;
	}

	public void setGrading(GradingEntity grading) {
		this.grading = grading;
	}



	public SubjectEntity getSubject() {
		return subject;
	}

	public void setSubject(SubjectEntity subject) {
		this.subject = subject;
	}
	
}
