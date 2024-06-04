package com.xworkz.tostring_concept.boot;

import com.xworkz.tostring_concept.childclasses.Asus;
import com.xworkz.tostring_concept.childclasses.Nokia;
import com.xworkz.tostring_concept.childclasses.RealMe;
import com.xworkz.tostring_concept.things.Mobiles;

public class MobilesRunner {
	public static void main(String args[]) {
		Mobiles mob=new Mobiles();
		Mobiles mobile1=new Asus();
		Mobiles mobile2=new RealMe();
		Nokia nokia= new Nokia();
		
		System.out.println(nokia instanceof Nokia);
		System.out.println(mob instanceof Asus);
		System.out.println(mobile1 instanceof Asus);
		System.out.println(mob instanceof RealMe);
		System.out.println(mobile2 instanceof RealMe);
		
		mobile1.mobile();
		((Asus)mobile1).asus();
		((Asus)mobile1).asusDetails(20000,"A1542");
		
		System.out.println("This is Object String returning value : "+((Asus)mobile1));
	}
}
