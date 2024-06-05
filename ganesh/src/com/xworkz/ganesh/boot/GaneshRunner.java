package com.xworkz.ganesh.boot;

import com.xworkz.ganesh.things.Ganesh;

public class GaneshRunner {
	public static void main(String args[]) {
		Object obj=new Object();
		Ganesh gani=new Ganesh();
		System.out.println("------------------------------------------------------------");
		Ganesh ganesh1=new Ganesh(100,100,10,"tretayuga",2,"Rajeev","Kesari");
		Ganesh ganesh2=new Ganesh("Anjana",12,"Phala","Gadha","Shri Ganesh","None","Anjanaadri","None");	
		ganesh1.setHands(8);
		ganesh1.setNoAvatars(2);
		ganesh1.setEyes(2);
		ganesh1.setYuga("Tretayuga");
		ganesh1.setNoOfGaurds(2);
		ganesh1.setNameOfDevotee("Meera bhai");
		ganesh1.setNameOfFather("Dasharatha");
		ganesh1.setNameOfMother("Soumitra");
		ganesh1.setNoOfFriends(10);
		ganesh1.setFavFood("Jack Fruit");
		ganesh1.setInstrument("Veena");
		ganesh1.setNameofAvtar("Rayaru");
		ganesh1.setNameOfWife("None");
		ganesh1.setLocation("Pritvi");
		ganesh1.setNameOfUncle("jambavanta");
		System.out.println("-----------------------------------------------------------");
		System.out.println(ganesh1 instanceof Ganesh);
		System.out.println(ganesh2 instanceof Ganesh);
		System.out.println(gani instanceof Ganesh);
		System.out.println("-----------------------------------------------------------");
		System.out.println(ganesh1.toString());
		System.out.println(ganesh2.toString());
		System.out.println("-----------------------------------------------------------");
		System.out.println((ganesh1).equals(ganesh1));
		System.out.println((ganesh2).equals(ganesh2));
		System.out.println("-----------------------------------------------------------");
		System.out.println(ganesh1.hashCode());
		System.out.println(ganesh1.hashCode());
		System.out.println("------------------------------------------------------------");
		System.out.println(ganesh1.equals(ganesh2));
		System.out.println(obj.equals(gani));
	}

}
