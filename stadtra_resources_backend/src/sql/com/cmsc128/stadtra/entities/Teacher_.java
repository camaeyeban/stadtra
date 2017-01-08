package com.cmsc128.stadtra.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-28T17:16:15.046+0800")
@StaticMetamodel(Teacher.class)
public class Teacher_ extends AbstractEntity_ {
	public static volatile SingularAttribute<Teacher, String> employeeNo;
	public static volatile SingularAttribute<Teacher, String> fName;
	public static volatile SingularAttribute<Teacher, String> mName;
	public static volatile SingularAttribute<Teacher, String> lName;
	public static volatile SingularAttribute<Teacher, Date> birthDate;
	public static volatile SingularAttribute<Teacher, String> sex;
	public static volatile SingularAttribute<Teacher, String> email;
	public static volatile SetAttribute<Teacher, TeacherStudent> students;
}
