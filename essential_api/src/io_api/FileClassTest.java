package io_api;

import java.io.File;
import java.io.IOException;

public class FileClassTest {

	public static void main(String[] args) {
		File text= new File("src/io_api/text");
		File text6= new File("src/io_api/text/text6.txt");
		File folder= new File("src/io_api/new");
		
		if(folder.exists()) {
			Boolean result = folder.delete();
			System.out.println("folder deleted");
		}else {
			System.out.println("fail to delete");
		}
		
//		if(!folder2.exists()) {
//			Boolean result = folder2.mkdirs();
//			System.out.println("Folder created");
//		}
//		else {
//			System.out.println("Folder cannot created");
//		}
		
//		if(text6.exists()) {
//			Boolean result = text6.delete();
//			System.out.println("Is File Deleted : " + result );
//		}else {
//			System.out.println(text6.getName() + " File is not found");
//		}
//		
//		System.out.println("Total Space  : " +text.getTotalSpace()/ Math.pow(1024, 3)+ " : GB" );
//		System.out.println("Free  Space  : " +text.getFreeSpace()+ " : bytes" );
//		System.out.println("Usable Space  : " +text.getUsableSpace()+ " : bytes" );
		
//		if(!text6.exists()) {
//			try {
//				Boolean result = text6.createNewFile();
//				System.out.println("created File ? " + result);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				System.out.println("file is already exist");
//			}
//		}
//		File[] files = text.listFiles();
//		for(final File file: files) {
//			System.out.println(file.getAbsolutePath());
//		}
		
//		String[] fileNames = text.list();
//		for(final String fileName: fileNames) {
//			System.out.println(fileName);
//		}
		
//		System.out.println(text.getName()+" can be read ? " + text.canRead());
//		System.out.println(text.getName()+" can be execute ? " + text.canExecute());
//		System.out.println(text.getName()+" can be write ? " + text.canWrite());
//		
//		System.out.println(text.getName()+" is absolute ? " + text.isAbsolute());
//		System.out.println(text.getName()+" is Directory ? " + text.isDirectory());
//		System.out.println(text.getName()+" is Hidden ? " + text.isHidden());
//		System.out.println(text.getName()+" is File  ? " + text.isFile());
	
		
		if(text.exists()) {
			System.out.println(text.getName()+" : yes it exist");
			System.out.println(text.getAbsolutePath());
			try {
				System.out.println(text.getCanonicalPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println(text.getName()+ " : does not exist ");
		}
	}

}
