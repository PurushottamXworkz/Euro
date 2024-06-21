package com.xworkz.stringindex;

public class numberformat {
	public static void main(String args[]) 
    { 
        try { 
            int num = Integer.parseInt ("Rajkumar") ; 
            System.out.println(num); 
        } catch(NumberFormatException e) { 
            System.out.println(e.getMessage()); 
        } 
    } 

}
