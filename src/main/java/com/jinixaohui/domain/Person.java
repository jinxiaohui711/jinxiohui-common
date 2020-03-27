package com.jinixaohui.domain;

import java.util.Date;

public class Person {

	private String name;
	private Integer age;
	private String about;
	private Date created;
	public Person() {
	}
	public Person(String name, Integer age, String about, Date created) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.created = created;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "姓名:" + name + "  年龄:" + age + "  介绍:" + about + "  创建时间:" + created;
	}
	
}
