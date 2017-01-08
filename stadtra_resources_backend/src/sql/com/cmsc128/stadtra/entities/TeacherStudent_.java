package com.cmsc128.stadtra.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-28T17:16:15.061+0800")
@StaticMetamodel(TeacherStudent.class)
public class TeacherStudent_ extends AbstractEntity_ {
	public static volatile SingularAttribute<TeacherStudent, Long> studentId;
	public static volatile SingularAttribute<TeacherStudent, String> studentNo;
	public static volatile SingularAttribute<TeacherStudent, Long> teacherId;
	public static volatile SingularAttribute<TeacherStudent, String> employeeNo;
	public static volatile SingularAttribute<TeacherStudent, Date> dateApproved;
	public static volatile SingularAttribute<TeacherStudent, Boolean> isStillEffective;
}
