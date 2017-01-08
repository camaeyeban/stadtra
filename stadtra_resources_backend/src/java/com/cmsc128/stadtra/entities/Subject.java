package com.cmsc128.stadtra.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.toolkt.utils.json.DateDeserializer;
import com.toolkt.utils.json.DateSerializer;

@XStreamAlias("subjects")
@Entity
@Table(name="t_subject")
public class Subject extends AbstractEntity {
	private String	course_num;
	private String	course_title;
	private String	units;
	private	String	sem_offered;
	
	public Subject(){}

	@Column(name="course_num")
	public String getCourse_num() {
		return course_num;
	}

	public void setCourse_num(String course_num) {
		this.course_num = course_num;
	}

	@Column(name="course_title")
	public String getCourse_title() {
		return course_title;
	}
	
	public void setCourse_title(String course_title) {
		this.course_title = course_title;
	}
	
	@Column(name="units")
	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}
	@Column(name="sem_offered")
	public String getSem_offered() {
		return sem_offered;
	}

	public void setSem_offered(String sem_offered) {
		this.sem_offered = sem_offered;
	}
	
	
}
