package io_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CharactorStreamIO {
	
	static String filePath = "src/io_api/text/textone.txt";
	
	static void writeFileWithPrintWriter() throws FileNotFoundException {
		System.out.println("Inside  write File With Print Writer");
		File file = new File("src/io_api/text/text3.txt");
		PrintWriter writer = new PrintWriter(file);
		
		
		writer.printf("%d . %s %f " , 1,"Mg Mg", 100.2 );
		writer.close();
		System.out.println("Writing completed");
	}
	
	static void writeFileWithBuffer() throws IOException{
		System.out.println("inside write file with buffer");
		File inputFile = new File("src/io_api/text/text3.txt");
		FileWriter fileWriter = new FileWriter(inputFile);
		
		BufferedWriter writer = new BufferedWriter(fileWriter);
		writer.append("This is line 1 \n");
		writer.append("This is line 2 \n");
		writer.append("This is line 3 \n");
		writer.append("This is line 4 \n");
		writer.append("This is line 5 \n");
		writer.append("This is line 6 \n");
		writer.append("This is line 7 ");
		
		writer.close();
		System.out.println("File is Written");
	}
	
	static void writeFileWithoutBuffer()  throws IOException{
		System.out.println("Inside Write File WithoutBUffer");
		File file = new File("src/io_api/text/text3.txt");
		FileWriter writer = new FileWriter(file);
		
		writer.write("A");
		writer.write("P");
		writer.write("P");
		writer.write("L");
		writer.write("E");
		
		writer.write(new char[] {' ','W','O','R','L','D'});
		System.out.println("Writing Complete");
		
		System.out.println("File is Written");
		writer.close();
		
		
	}
	
	static void readFileWithBuffer() throws IOException{
		System.out.println("Inside readFileWithBuffer");
		File inputFile = new File(filePath);
		System.out.println("File Bytes : " + inputFile.length());
		
		FileReader fileReader = new FileReader(inputFile);
		BufferedReader buffer= new BufferedReader(fileReader);
		
		String line = "";
		while((line = buffer.readLine() ) != null) {
			System.out.println(line);
		}
		buffer.close();
		System.out.println("File read finished");
	}
	
	

	
	static void readFileWithoutBuffer() throws IOException {
		System.out.println("Inside readFileWithoutBuffer");
		File inputFile = new File(filePath);
		System.out.println("File Bytes : " + inputFile.length());
		
		FileReader fileReader = new FileReader(inputFile);
		int readByte = 0;
		while((readByte = fileReader.read()) != -1 ) {
			System.out.print((char) readByte);
		}
		
		fileReader.close();
		System.out.println("File is Read");
	}
	
	static void readFileWithScanner() throws FileNotFoundException {
		System.out.println("Inside readFileWithScanner");
		File inputFile = new File(filePath);
		System.out.println("File Bytes : " + inputFile.length());
		
		Scanner scanner = new Scanner(inputFile);
		
		double total =0.0;
		while(scanner.hasNextDouble()) {
			 total += scanner.nextDouble();
			
		}
		
		System.out.println(total);
//		while(scanner.hasNextLine()) {
//			System.out.println(scanner.next());
//		}
		
		scanner.close();
		System.out.println("Finished Reading");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			writeFileWithoutBuffer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
