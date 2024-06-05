package com.xworkz.hanuman.boot;

import com.xworkz.hanuman.things.Hanuman;

public class HanumanRunner {
	public static void main(String args[]) {
		Object obj=new Object();
		Hanuman hanu=new Hanuman();
		System.out.println("------------------------------------------------------------");
		Hanuman hanu1=new Hanuman(100,100,10,"tretayuga",2,"Rajeev","Kesari");
		Hanuman hanu2=new Hanuman("Anjana",12,"Phala","Gadha","Shri Hanumaan","None","Anjanaadri","None");	
//		Vishnu.setHands(8);
//		Vishnu.setNoAvatars(2);
//		Vishnu.setEyes(2);
//		Vishnu.setYuga("Tretayuga");
//		Vishnu.setNoOfGaurds(2);
//		Vishnu.setNameOfDevotee("Meera bhai");
//		Vishnu.setNameOfFather("Dasharatha");
//		Vishnu.setNameOfMother("Soumitra");
//		Vishnu.setNoOfFriends(10);
//		Vishnu.setFavFood("Jack Fruit");
//		Vishnu.setInstrument("Veena");
//		Vishnu.setNameofAvtar("Rayaru");
//		Vishnu.setNameOfWife("None");
//		Vishnu.setLocation("Pritvi");
//		Vishnu.setNameOfUncle("jambavanta");
		System.out.println("-----------------------------------------------------------");
		System.out.println(hanu1 instanceof Hanuman);
		System.out.println(hanu2 instanceof Hanuman);
		System.out.println(hanu instanceof Hanuman);
		System.out.println("-----------------------------------------------------------");
		System.out.println(hanu1.toString());
		System.out.println(hanu2.toString());
		System.out.println("-----------------------------------------------------------");
		System.out.println((hanu1).equals(hanu1));
		System.out.println((hanu2).equals(hanu2));
		System.out.println("-----------------------------------------------------------");
		System.out.println(hanu1.hashCode());
		System.out.println(hanu2.hashCode());
		System.out.println("------------------------------------------------------------");
		System.out.println(hanu1.equals(hanu2));
		System.out.println(obj.equals(hanu));
	}
}
