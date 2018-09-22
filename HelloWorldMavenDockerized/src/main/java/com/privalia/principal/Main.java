package com.privalia.principal;

import java.io.IOException;

import com.privalia.dao.IDao;
import com.privalia.dao.StudentDao;
import com.privalia.model.Student;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		IDao student = new StudentDao();
		Student firstStudent = new Student();
		firstStudent.setAge(28);
		firstStudent.setName("Jose Antonio");
		firstStudent.setIdStudent(1);
		firstStudent.setSurname("Pozi");
		try {
			student.add(firstStudent);
		} catch (IOException e) {
			e.printStackTrace();
		}
		StringBuilder stringBuilder = new StringBuilder("El resultado de la suma es ");
	}

}
