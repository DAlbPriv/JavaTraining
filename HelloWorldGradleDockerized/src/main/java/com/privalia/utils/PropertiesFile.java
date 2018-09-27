package com.privalia.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	static FileInputStream propertiesFile = null;
	static Properties prop = null;
	static String filename = null;

	public PropertiesFile(String pathToPropertiesFile){
	}

	public String getFilename() {
		return this.filename;
	}

}
