package com.xworkz.stringindex;

import java.util.Scanner;

public class ioexception {
	 public static void main(String[] args) 
	    { 
	  
	       
	        Scanner scan = new Scanner("Hello World!");
	        System.out.println("" + scan.nextLine()); 
	        System.out.println("Exception Output: "
	                           + scan.ioException()); 
	  
	        scan.close(); 
	    } 
}
