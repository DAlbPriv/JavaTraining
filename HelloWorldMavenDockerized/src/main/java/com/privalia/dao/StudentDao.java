package com.privalia.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.privalia.model.Student;

public class StudentDao implements IDao<Student>{
	
	static Properties prop = null;
	static FileInputStream input = null;

	static{
		prop = new Properties();
		try{
			input = new FileInputStream("src/main/resources/config.properties");
			prop.load(input);
		} catch(IOException e){
			throw new ExceptionInInitializerError(e);
		}
		
	}

	@Override
	public Student add(Student model) throws IOException {
		return null;
	}

	

}
