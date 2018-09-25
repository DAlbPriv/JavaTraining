package com.privalia.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
		StringBuilder studentContent = formatStudentAsCSV(model);
		FileOutputStream filewriter = openWriteFile(true);
		filewriter.write(studentContent.toString().getBytes());
		PersistInDisk(filewriter);
		return null;
	}
	
	
	/**
	 * This method reads the sink filename and instantiate a FileOutputStream to write 
	 * in that file.
	 * 
	 * @author Daniel Albendín
	 * @param append It indicates if the action on the file will be either append or overwite. 
	 * 			true: append, false: overwrite
	 * @return FileOutputStream object ready to be used
	 */
	private FileOutputStream openWriteFile(boolean append) {
		FileOutputStream filewriter = null;
		String filename = prop.getProperty("filename");
		try {
			filewriter = new FileOutputStream(filename,true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filewriter;
	}
	

	private void PersistInDisk(FileOutputStream filewriter) {
		try {
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
