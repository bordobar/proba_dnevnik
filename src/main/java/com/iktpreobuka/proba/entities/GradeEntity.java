package com.iktpreobuka.proba.entities;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.iktpreobuka.proba.enumerations.Term;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table (name="Grade")
public class GradeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer gradeId;
	private Integer verbalGrade;
	private Integer examGrade;
	private Integer finalGrade;
	private Term term;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "subject")
	private SubjectEntity subject;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "student")
	private StudentEntity student;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "grading")
	private GradingEntity grading;
	
	public GradeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public GradeEntity(Integer gradeId, Integer verbalGrade, Integer examGrade, Integer finalGrade, Term term,
			SubjectEntity subject, StudentEntity student, GradingEntity grading) {
		super();
		this.gradeId = gradeId;
		this.verbalGrade = verbalGrade;
		this.examGrade = examGrade;
		this.finalGrade = finalGrade;
		this.term = term;
		this.subject = subject;
		this.student = student;
		this.grading = grading;
	}



	public GradingEntity getGrading() {
		return grading;
	}



	public void setGrading(GradingEntity grading) {
		this.grading = grading;
	}



	public Integer getGradeId() {
		return gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public Integer getVerbalGrade() {
		return verbalGrade;
	}

	public void setVerbalGrade(Integer verbalGrade) {
		this.verbalGrade = verbalGrade;
	}

	public Integer getExamGrade() {
		return examGrade;
	}

	public void setExamGrade(Integer examGrade) {
		this.examGrade = examGrade;
	}

	public Integer getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(Integer finalGrade) {
		this.finalGrade = finalGrade;
	}

	public Term getTerm() {
		return term;
	}

	public void setTerm(Term term) {
		this.term = term;
	}

	public SubjectEntity getSubject() {
		return subject;
	}

	public void setSubject(SubjectEntity subject) {
		this.subject = subject;
	}

	public StudentEntity getStudent() {
		return student;
	}

	public void setStudent(StudentEntity student) {
		this.student = student;
	}
	
	
}
