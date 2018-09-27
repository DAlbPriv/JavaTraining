
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;


@Log4j
public class FileUtil{
	final static Logger logger = Logger.getLogger(FileUtil.class);
	private static File file = null;

	private FileUtil(){

	}

	public static synchronized boolean createFile(String fileName) throws IOException{
		boolean isFileCreated = false;
		file = new File(fileName);
		if (file.exists()){
		} else {
			try{
				isFileCreated = file.createNewFile();
			}catch(IOException e){
			}
		}
		log.
		return isFileCreated;
	}

	public static File getFile(){
		return file;
	}

}




	
