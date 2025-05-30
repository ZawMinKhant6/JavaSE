package io_api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamIO {

	
	static String filePath = "src/io_api/origin/GTR.jpg";
	static String outPutPath = "src/io_api/destination/GTR_Copy.jpg";
	
	
	static void copyImageWithoutBuffer() throws IOException {
		System.out.println("Inside copyImageWithoutBuffer");
		File inputFile = new File(filePath);
		System.out.println("File length = " + inputFile.length());
		File outPutFile = new File(outPutPath);
		
		FileInputStream inputStream = new FileInputStream(inputFile);
		FileOutputStream outputStream = new FileOutputStream(outPutFile);
		int readByte=0;
		Long currentTime = System.currentTimeMillis();
		
		while((readByte = inputStream.read() ) != -1){
			outputStream.write(readByte);
		}
		Long ellapsedTime = System.currentTimeMillis() - currentTime;
		System.out.println("Ellapsed TIme : " + ellapsedTime);
		System.out.println("Image is compiled");
		inputStream.close();
		outputStream.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//copyImageWithoutBuffer();
			copyImageWithoutBuffer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
