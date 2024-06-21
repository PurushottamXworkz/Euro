package com.xworkz.stringindex;

public class stringindex {
	public static void main(String args[]) 
    { 
        try { 
            String a = "This is like Hello World! "; 
            char c = a.charAt(29);
            System.out.println(c); 
        } 
        catch(StringIndexOutOfBoundsException e) { 
            System.out.println(e.getMessage()); 
        } 
    } 

}
