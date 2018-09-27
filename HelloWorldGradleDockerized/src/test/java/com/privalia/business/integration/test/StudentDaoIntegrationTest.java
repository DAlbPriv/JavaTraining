package com.privalia.business.integration.test;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.privalia.business.Calculator;
import com.privalia.business.ICalculator;
import com.privalia.dao.StudentWithLombokDao;
import com.privalia.model.Student;
import com.privalia.model.StudentWithLombok;
import com.privalia.utils.FileUtil;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lombok.extern.log4j.Log4j;

@Log4j
public class StudentDaoIntegrationTest {
	static Properties prop = null;
	static InputStream input = null;
	
	@BeforeClass
	public static void setup(){
		prop = new Properties();
		try {
			input = StudentWithLombokDao.class.getResourceAsStream("/config.properties");
			//input = new FileInputStream("src/test/resources/config.properties");
			prop.load(input);
		}catch (IOException e) {
			log.error(e.getMessage());
			throw new ExceptionInInitializerError(e);
		}
	}


	@AfterClass
	public static void tearDown() throws IOException {
		File f = FileUtil.getFile();
		if (f.exists()){
			f.delete();
		}
		log.info("StudentWithLombokIntegrationTest Finished");
	}

	@Test
	public void testAdd() throws IOException{
		log.info("StudentintegrationTest testAdd Started");
		StudentWithLombok studentSend = new StudentWithLombok(1, "Guisseppe", "Verdi" , 43);
		log.info(studentSend.toString());
		StudentWithLombokDao studentWithLombokDao = new StudentWithLombokDao();
		log.info("StudentWithLombokDao created");
		StudentWithLombok studentFind = studentWithLombokDao.add(studentSend);
		log.info(studentFind.toString());

		assertTrue(studentFind.equals(studentSend));
		log.info("StudentintegrationTest testAdd Finished");
	}
}
