package org.arithmatic;

import java.io.IOException;

public class TryMoreCatch {
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		try {
	System.out.println(5/0);
			}
		catch(NullPointerException w){
			System.out.println("This is NullPointerException");
			w.printStackTrace();
		}
		catch(IndexOutOfBoundsException w){
			System.out.println("This is IndexOutOfBoundsException");
			w.printStackTrace();
		}
		
		catch(NumberFormatException w){
			System.out.println("This is NumberFormatException");
			w.printStackTrace();
		}
		catch(ArithmeticException w){
			System.out.println("This is ArithmeticException");
			w.printStackTrace();
		}
		
		finally {
			System.out.println("Connection closed");
		}
		System.out.println(6);
		
	}
	

}
