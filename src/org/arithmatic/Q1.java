package org.arithmatic;

public class Q1 {
	
	 
         public static void main(String[] args)
           {
        	   System.out.println("1");
               
         try
         {
             int sum = 9 / 0;
               System.out.println("2");
         }
         catch(ArithmeticException e)
         {
               System.out.printf("3");
         }
          catch(Exception e)
         {
               System.out.printf("4");
         }
         finally
         {
            System.out.printf("5");
         }
            }
	

}
