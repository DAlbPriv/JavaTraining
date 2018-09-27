package com.privalia.collections;

import com.privalia.collections.Student;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

@SuppressWarnings({"uncheked", "unused"})
	public static void main(String[] args){

		Address address = new Address();
		List<Teacher> teacherList = new ArrayList<Teacher>();

		Teacher teacher1 = new Teacher();
		teacher1.setIdTeacher(1);
		teacher1.setName("Pepe");
		teacherList.add(teacher1);

		Teacher teacher2 = new Teacher();
		teacher2.setIdTeacher(2);
		teacher2.setName("Alberto");
		teacherList.add(teacher2);

		Student student = new Student(address);
		student.setName("Pepe");
		student.setSurname("Soto");
		student.setIdStudent(1);
		student.setAge(24);
		student.setTeacher(teacherList);

		@SuppressWarnings("rawtypes")
		List studentsList = new ArrayList();
		int counter = 4;

		//Ejemplo de Boxing
		studentsList.add(student);

		//Ejemplo de Autoboxing
		studentsList.add(counter);

		
		/**
		 * Esto con streams filter que permite hacer where en una lista
		 */
		//Ejemplo de Unboxing
		Student newStudent = (Student) studentsList.get(0);
		String name = ((Student) studentsList.get(0)).getName();

		//Lista genérica
		List<Student> genericStudentList = new ArrayList<Student>();
		genericStudentList.add(student);
		
		Student newStudent2 = genericStudentList.get(0);
		
		Optional<Student> optimalStudent = genericStudentList.stream().filter(p -> p.getName().
				equals("mm")).findFirst();
		
		Student seachedStudent = optimalStudent.get();
		
		Product product = new Product();
		product.setIdProduct(1);
		product.setName("tejanos");
		
		Map<Long, Product> productList = new HashMap<Long,Product>();
		productList.put(1L, product);
		
		Category category = new Category();
		category.setIdCategory(1);
		category.setName("ropa");
		category.setProductList(productList);
		
		
		
		
		
		
	}
}
