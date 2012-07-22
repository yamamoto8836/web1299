package jp.sample;

public class Employee {
	
	private static final int limitAge = 60; //��N
	
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getLimit() {
		return limitAge - age;
	}
}
