package com.privalia.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import com.privalia.model.Student;
import com.privalia.utils.FileUtil;
import com.privalia.utils.PropertiesFile;

public class StudentDao implements IDao<Student>{

	static Properties prop = null;
	static FileInputStream input = null;

	@Override 
	public Student add(Student student) throws IOException {
		String fileName = prop.getProperty("filename");
		FileUtil.createFile(fileName);
		
		try(FileWriter fileWriter = new FileWriter(fileName,true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
			bufferedWriter.write(student.toString());
			bufferedWriter.write(System.lineSeparator());
		}catch(IOException e) {
		}
		
			return getLastStudentByID(student.getIdStudent());
	}
	
	private Student getLastStudentByID(int id) throws IOException{
		BufferedReader bufferedReader = null;
		Student student = new Student();
		try {
			bufferedReader = new BufferedReader(new FileReader(prop.getProperty("filename")));
			String linea;
			
			while((linea = bufferedReader.readLine()) != null) {
				
				String[] datos = linea.split(",",4);
				if (datos[0].equals(String.valueOf(id))){
					student.setIdStudent(id);
					student.setName(datos[1]);
					student.setSurname(datos[2]);
					student.setAge(Integer.parseInt(datos[3]));
					break;
				}
			}
		}catch(IOException e){
			System.out.println("Error");
			throw e;
		} finally {
			if (bufferedReader != null)
				bufferedReader.close();
		}
		return student;
	
	}
	
}

