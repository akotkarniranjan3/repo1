package com.resty.Restful;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	static ArrayList<User> al = new ArrayList<>();
	
	static {
		
		al.add(new User(5 , "nir" , new Date()));
		al.add(new User(6 , "abc" , new Date()));
		al.add(new User(7 , "qwe" , new Date()));
		}	
	
	public void save(User u)
	{
		al.add(u);
	}
	
	public ArrayList<User> showall()
	{
		return al;
	}
	
	
}
