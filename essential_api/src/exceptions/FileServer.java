package exceptions;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class FileServer {
	
	private String[] files = new String[20];
	
	public FileServer() {
		files[0] = "typing.txt";
		files[1] = "doodoo.jpg";
		files[1] = "school.exe";
		files[1] = "focus.ppd";
		files[1] = "app.exe";
	}
	
	private boolean isExistFile(String file) {
		boolean exist =false;
		
		for(final String temp:files) {
			
			if(temp ==null) {
				  continue;
			}
			if(file.equals(temp)) {
				exist = true;
				break;
			}
		}
		return exist;
	}
	
	public boolean upload(boolean internetOk,String file,Integer index) throws InterruptedException,FileAlreadyExistsException {
			
		if(!internetOk) {
			throw  new InterruptedException("Internet Connection is interrupted");
		}
		
		if(isExistFile(file)) {
			throw  new FileAlreadyExistsException("File Already Exist in Server");
		}
		
		files[index]= file;
		
		return true;
	
	}
	
	public boolean download(String fileName) throws IllegalArgumentException , FileNotFoundException {
			
		if(fileName == null || fileName.isBlank()) {
			throw new IllegalArgumentException("Argument file name is invalid");
		}
		
		if(! isExistFile(fileName)) {
			throw new FileNotFoundException("File not found");
		}
		
		return true;
	}
	
	
	
	
}
