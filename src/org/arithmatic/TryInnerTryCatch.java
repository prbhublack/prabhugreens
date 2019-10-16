package org.arithmatic;

import java.io.IOException;

public class TryInnerTryCatch {
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		try {
	System.out.println(5/0);
	try {
		String a= null;
		char s = a.charAt(8);
		System.out.println(s);
	}
	catch(NullPointerException e) {
		System.out.println("This is not valid format");
		
	}
			}
		catch(Exception w){
			System.out.println("This is sss");
			
		}
		
		
		finally {
			System.out.println("Connection closed");
		}
		System.out.println(6);
		
	}
	

}
