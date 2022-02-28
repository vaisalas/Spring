package com.example.rabbit.domain;

public class Rabbit {
	
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private Integer weight;
	
	

	public Rabbit() {
		super();
	}

	public Rabbit(Integer id, String name, Integer age, Integer weight) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	
}
