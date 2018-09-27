package com.privalia.reflection;

import java.util.ArrayList;

public class EjemploReflection {

	public static void main(String[] args) {
		if(createObject("java.util.ArrayList") instanceof ArrayList) {
			@SuppressWarnings("unchecked")
			ArrayList<String> r = (ArrayList<String>) createObject("java.util.ArrayList");
			r.add("pepe");
			System.out.println(r.toString());
		}
	}

	
	static Object createObject(String className) {
		Object object = null;
		try {
			Class<?> classDefinition = Class.forName(className);
			object = classDefinition.newInstance();
		}catch (InstantiationException e) {
			
		}catch(IllegalAccessException e)
		{
		}catch (ClassNotFoundException e) {
			
		}
		return object;
	}
	
}
