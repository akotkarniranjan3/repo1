package com.template.run;



import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data@ToString @AllArgsConstructor @NoArgsConstructor
public class Cook {
    
	
	@Id
	@GeneratedValue

	public int id;

	public  String name;
	
	public  String mobile;

	public  ArrayList<String> recipes=new ArrayList<>();

	public  int salary;
	
	
	
}
