package com.cmsc128.stadtra.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.toolkt.utils.json.DateDeserializer;
import com.toolkt.utils.json.DateSerializer;

@XStreamAlias("grades")
@Entity
@Table(name="t_grade")
public class Grade extends AbstractEntity {

	private String	course_id;
	private String	student_id;
	private String	status;
	private	String	grade;
	private	String	sem_taken;
	private	String	year;
	private Subject subject;
	
	public Grade(){}
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "course_id", referencedColumnName = "id", insertable = false, updatable = false)
	public Subject getSubject(){
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	@Column(name="student_id")
	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	@Column(name="status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	@Column(name="grade")
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Column(name="sem_taken")
	public String getSem_taken() {
		return sem_taken;
	}

	public void setSem_taken(String sem_taken) {
		this.sem_taken = sem_taken;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
}
