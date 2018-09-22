package com.privalia.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.privalia.model.Student;

public class StudentDao implements IDao<Student>{
	
	static Properties prop = null;
	static FileInputStream input = null;
	static char CSV_SEPARATOR = ',';
	
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
		String filename = prop.getProperty("filename");
		StringBuilder studentContent = formatStudentAsCSV(model);
		FileOutputStream filewriter = new FileOutputStream(filename,true);
		filewriter.write(studentContent.toString().getBytes());
		filewriter.flush();
		filewriter.close();
		return null;
	}

	private StringBuilder formatStudentAsCSV(Student model){
		return new StringBuilder()
		.append(model.getIdStudent())
		.append(CSV_SEPARATOR)
		.append(model.getName())
		.append(CSV_SEPARATOR)
		.append(model.getAge())
		.append(CSV_SEPARATOR)
		.append(model.getSurname());
	}

}
