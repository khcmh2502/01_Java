package com.hw1.model.vo;

public class Employee extends Person{
	
	private int salary; // 급여
	private String dept; // 부서
	
	public Employee() {}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name; // 부모 Person에 작성된 필드 중 protected 접근제한자 name
		this.salary = salary;
		this.dept = dept;
	}
	
	@Override
	public String information() {
		// "이름 : 홍길동 / 나이 : 20 / 신장 : 180.0 / 몸무게 : 70.0 / 급여 : 2000000 / 부서 : 기획팀"
		return super.information() + String.format(" / 급여 : %d / 부서 : %s", salary, dept);
	}
	
	
	
	
	
	
	
}
