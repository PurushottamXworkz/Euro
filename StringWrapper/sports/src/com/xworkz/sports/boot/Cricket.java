package com.xworkz.sports.boot;

public class Cricket {
	
	public static void main(String[] args) {
		
		String str="12345";
		
	 	Boolean b = Boolean.parseBoolean(str);
	 	System.out.println("Boolean : "+b);
	 	
	 	Integer i=Integer.parseInt(str);
	 	System.out.println("Integer :"+i);
	 	
	 	char c='A';
	 	Character ch=Character.valueOf(c);
	 	System.out.println("Character :"+ch);
	 	
	 	float f=27;
	 	Float fl=Float.valueOf(f);
	 	System.out.println("Float :"+fl);
	 	
	 	long ph=785421542l;
	 	Long lg=Long.valueOf(ph);
	 	System.out.println("long :"+lg);
	 	
	 	
	 	double d=78457584215455.245545d;
	 	Double dl=Double.parseDouble(str);
	 	System.out.println("Double :"+dl);
	 	
	 	short s=24;
	 	Short sh=Short.valueOf(s);
	 	System.out.println("Short :"+sh);
	 	
	 	
	}

}
