package com.privalia.collections;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
	private int idStudent;
	private String name;
	private String surname;
	private int age;
	private Address address;
	private List<Teacher> teacher;
	
	
	public Student(Address address) {
		
	}
	
	public Student(Student student, Address address) {
		
	}
	
	public Student(int id, String name, String surname, int age, Address adress) {
		
	}
	
	public Student() {
	}

	public static Student getStudent() {
		return new Student();
	}
	
	
}
