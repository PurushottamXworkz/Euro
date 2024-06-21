package com.xworkz.stringindex;

public class classnotfound {
	public static void main(String[] args) { 
        try{ 
            Class.forName("Class1");   
        } 
        catch(ClassNotFoundException e){ 
            System.out.println(e); 
            System.out.println("Class Not Found..."); 
        } 
    } 

}
