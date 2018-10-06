package com.resty.Restful;

public class HelloWorldBean {

	private String name;

	HelloWorldBean(String name)
	{
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
