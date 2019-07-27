package com.iktpreobuka.proba.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table (name ="Student")
public class StudentEntity extends UserEntity{



	@JsonIgnore
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	private List<SubjectEntity> subjects = new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "grading")
	private GradingEntity grading;

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentEntity(Integer userId, String name, String lastName, String username, String password, String email,
			RoleEntity role) {
		super(userId, name, lastName, username, password, email, role);
		// TODO Auto-generated constructor stub
	}

	public StudentEntity(Integer studentId, List<SubjectEntity> subjects,
			 GradingEntity grading) {
		super();
		this.subjects = subjects;
		this.grading = grading;
	}

	public GradingEntity getGrading() {
		return grading;
	}

	public void setGrading(GradingEntity grading) {
		this.grading = grading;
	}

	public List<SubjectEntity> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<SubjectEntity> subjects) {
		this.subjects = subjects;
	}

}
