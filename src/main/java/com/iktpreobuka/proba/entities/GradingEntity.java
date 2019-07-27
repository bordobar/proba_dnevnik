package com.iktpreobuka.proba.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name="Grading")
public class GradingEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer gradingId;
	
	@Column (name = "teacher")
	@JsonIgnore
	@OneToMany(mappedBy = "grading", fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	private List<TeacherEntity> teacher = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "grading", fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	private List<StudentEntity> student = new ArrayList<>();

	@JsonIgnore
	@OneToMany(mappedBy = "grading", fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	private List<GradeEntity> grade = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "grading", fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	private List<SubjectEntity> subject = new ArrayList<>();
	
	public GradingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GradingEntity(Integer gradingId, List<TeacherEntity> teacher, List<StudentEntity> student,
			List<GradeEntity> grade, List<SubjectEntity> subject) {
		super();
		this.gradingId = gradingId;
		this.teacher = teacher;
		this.student = student;
		this.grade = grade;
		this.subject = subject;
	}

	public Integer getGradingId() {
		return gradingId;
	}

	public void setGradingId(Integer gradingId) {
		this.gradingId = gradingId;
	}

	public List<TeacherEntity> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<TeacherEntity> teacher) {
		this.teacher = teacher;
	}

	public List<StudentEntity> getStudent() {
		return student;
	}

	public void setStudent(List<StudentEntity> student) {
		this.student = student;
	}

	public List<GradeEntity> getGrade() {
		return grade;
	}

	public void setGrade(List<GradeEntity> grade) {
		this.grade = grade;
	}

	public List<SubjectEntity> getSubject() {
		return subject;
	}

	public void setSubject(List<SubjectEntity> subject) {
		this.subject = subject;
	}

	
	
	
	
	
	

}
