package io_api;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharactorEncodingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			showEncodingDetail("A");
			showEncodingDetail("u");
			showEncodingDetail("$");
			showEncodingDetail("9");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	static void showEncodingDetail(String charactor) throws UnsupportedEncodingException {
		System.out.println("Encoding detail of = "+ charactor);
		System.out.println("US-ASCII " + Arrays.toString(charactor.getBytes("US-ASCII")));
		System.out.println("ISO-8859-1 : "+ Arrays.toString(charactor.getBytes("ISO-8859-1")));
		System.out.println("UTF-8 : "+ Arrays.toString(charactor.getBytes("UTF-8")));
		System.out.println("UTF-16 : "+ Arrays.toString(charactor.getBytes("UTF-16")));
		System.out.println("UTF-16LE : "+ Arrays.toString(charactor.getBytes("UTF-16LE")));
		System.out.println("UTF-16BE : "+ Arrays.toString(charactor.getBytes("UTF-16BE")));
		System.out.println();
	}

}
