package com.privalia.dao;

import static com.privalia.utils.FileUtil.createFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.privalia.model.StudentWithLombok;
import com.privalia.utils.FileUtil;

public class StudentWithLombokDao implements IDao<StudentWithLombok>{

	static final Logger logger = Logger.getLogger(StudentWithLombokDao.class);
	static Properties prop = null;
	static InputStream input = null;

	static {
		prop = new Properties();
		try {
			input = StudentWithLombokDao.class.getResourceAsStream("/config.properties");
			prop.load(input);
		}catch(IOException e) {
			
		}
	}
		
	@Override 
	public StudentWithLombok add(StudentWithLombok student) throws IOException {
		String fileName = prop.getProperty("filename");
		createFile(fileName);
		
		try(FileWriter fileWriter = new FileWriter(fileName,true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
					bufferedWriter.write(student.toString());
					bufferedWriter.write(System.lineSeparator());
					bufferedWriter.flush();
					bufferedWriter.close();
		}catch(IOException e) {
			logger.error(e.getMessage());
			throw e;
		}
			return getLastStudentByID(student.getIdStudent());
	}
	
	private StudentWithLombok getLastStudentByID(int id) throws IOException{
		BufferedReader bufferedReader = null;
		StudentWithLombok student = new StudentWithLombok();
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

