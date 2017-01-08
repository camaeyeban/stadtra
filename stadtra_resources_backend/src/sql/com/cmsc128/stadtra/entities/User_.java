package com.cmsc128.stadtra.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-28T17:16:15.061+0800")
@StaticMetamodel(User.class)
public class User_ extends AbstractEntity_ {
	public static volatile SingularAttribute<User, String> loginId;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, String> fName;
	public static volatile SingularAttribute<User, String> mName;
	public static volatile SingularAttribute<User, String> lName;
	public static volatile SingularAttribute<User, String> role;
}
