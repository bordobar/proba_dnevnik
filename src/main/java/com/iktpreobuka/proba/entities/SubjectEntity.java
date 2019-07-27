package com.iktpreobuka.proba.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.iktpreobuka.proba.enumerations.Term;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table (name ="Subject")
public class SubjectEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer subjectId;
	private String name;
	private Integer weekFund;
	private Term term;
	
	@JsonIgnore
	@OneToMany(mappedBy = "subject", fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	private List<TeacherEntity> teachers = new ArrayList<>();

	@JsonIgnore
	@OneToMany(mappedBy = "subject", fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	private List<GradeEntity> grades = new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "student")
	private StudentEntity student;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "grading")
	private GradingEntity grading;
	
	public SubjectEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubjectEntity(Integer subjectId, String name, Integer weekFund, Term term, List<TeacherEntity> teachers,
			List<GradeEntity> grades, StudentEntity student, GradingEntity grading) {
		super();
		this.subjectId = subjectId;
		this.name = name;
		this.weekFund = weekFund;
		this.term = term;
		this.teachers = teachers;
		this.grades = grades;
		this.student = student;
		this.grading = grading;
	}


	public List<GradeEntity> getGrades() {
		return grades;
	}

	public void setGrades(List<GradeEntity> grades) {
		this.grades = grades;
	}

	public StudentEntity getStudent() {
		return student;
	}

	public void setStudent(StudentEntity student) {
		this.student = student;
	}

	public GradingEntity getGrading() {
		return grading;
	}

	public void setGrading(GradingEntity grading) {
		this.grading = grading;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWeekFund() {
		return weekFund;
	}

	public void setWeekFund(Integer weekFund) {
		this.weekFund = weekFund;
	}

	public Term getTerm() {
		return term;
	}

	public void setTerm(Term term) {
		this.term = term;
	}

	public List<TeacherEntity> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<TeacherEntity> teachers) {
		this.teachers = teachers;
	}
	
	

}
