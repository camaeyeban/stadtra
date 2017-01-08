package com.cmsc128.stadtra.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-28T17:16:15.046+0800")
@StaticMetamodel(Student.class)
public class Student_ extends AbstractEntity_ {
	public static volatile SingularAttribute<Student, String> studentNo;
	public static volatile SingularAttribute<Student, String> fName;
	public static volatile SingularAttribute<Student, String> mName;
	public static volatile SingularAttribute<Student, String> lName;
	public static volatile SingularAttribute<Student, Date> birthDate;
	public static volatile SingularAttribute<Student, String> sex;
	public static volatile SingularAttribute<Student, String> email;
	public static volatile SingularAttribute<Student, String> classification;
}
