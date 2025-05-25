package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ResourcesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\exceptiontest\\text.txt");
		Scanner fileScanner = null;
		try {
			fileScanner =  new Scanner(file);
			while(fileScanner.hasNextLine()) {
				System.out.println(fileScanner.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block is work");
			if(fileScanner != null) {
				fileScanner.close();
			}
			
		}
	}

}
