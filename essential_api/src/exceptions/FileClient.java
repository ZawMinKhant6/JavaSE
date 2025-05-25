package exceptions;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class FileClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileServer fileServer = new FileServer();
		Scanner userInput = new Scanner(System.in);
	
		
		while(true) {
		
			System.out.println("1.upload 2.download");
			int operation = userInput.nextInt();
			System.out.println("Input File Name");
			String name = userInput.next();
		
			
			
			switch (operation) {
			case 1 -> {
				System.out.println("Connect Internet");
				boolean internet=userInput.nextBoolean();
				System.out.println("Enter Index");
				@SuppressWarnings("unused")
				int index = userInput.nextInt();
				
				try {
					if(fileServer.upload(internet, name, 1)) {
						System.out.println("File is Uploaded");
					}
					else {
						System.out.println("File upload is fail");
					}
					
				} catch (FileAlreadyExistsException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					continue;
				} 
				
			}
			case 2 -> {
				try {
					if(name != null &&  !name.isBlank()) {
							
						if(fileServer.download(name)) {
							System.out.println("File is Downloaded");
						}
						else {
							System.out.println("File is fail to download");
						}
					}
					else {
						System.out.println("file is invalid");
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					continue;
				}
				
			}
			
			
			
			
			default ->
			throw new IllegalArgumentException("Unexpected value: " + operation);
			}
			
			System.out.println("Continue ? yes/y No/n ");
			char decision = userInput.next().charAt(0);
			if(decision == 'n') {
			
				break;
			}
		}
		
		userInput.close();
		System.out.println("Programm is terminated");
	}

}
