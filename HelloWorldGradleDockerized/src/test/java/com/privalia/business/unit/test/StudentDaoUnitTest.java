package com.privalia.business.unit.test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.privalia.dao.IDao;
import com.privalia.dao.StudentDao;
import com.privalia.model.Student;
import com.privalia.model.StudentWithLombok;
import com.privalia.utils.FileUtil;

public class StudentDaoUnitTest {
	/*
	@BeforeClass
	public static void setup(){
		prop = new Properties();
		try {
			input = new FileInputStream("src/test/resources/config.properties");
			prop.load(input);
		}
	}


	@AfterClass
	public static void tearDown() throws IOException {
		File f = FileUtil.getFile();
		if (f.exists()){
			f.delete();
		}
	}

	@Test
	public void testAdd() throws IOException{
		StudentWithLombok studentSend = new StudentWithLombok(1, "Guisseppe", "verdi" , 43);
		StudentWithLombokDao studentWithLombok = new StudentWithLombok();
		Student studentFind = studentDao.add(studentDao);
		assertTrue(studentFind = studentWithLombok);
	}
	*/	
}
