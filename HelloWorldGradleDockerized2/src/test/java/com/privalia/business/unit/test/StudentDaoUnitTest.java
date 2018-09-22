package com.privalia.business.unit.test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.privalia.dao.IDao;
import com.privalia.model.Student;

public class StudentDaoUnitTest {
	@Mock
	IDao iDao;
	
	@Before
	public void setUp() throws Exception{
		MockitoAnnotations.initMocks(this);
	}
		
	@Test
	public void testAdd(){
		try {
			when(iDao.add(new Student(1,"abc","def",1))).thenReturn(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
