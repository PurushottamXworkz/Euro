package com.xworkz.vishnu.boot;

import com.xworkz.vishnu.things.Vishnu;

public class VishnuRunner {
	public static void main(String args[]) {
		Object obj=new Object();
		Vishnu vishnu=new Vishnu();
		System.out.println("------------------------------------------------------------");
		Vishnu vishnu1=new Vishnu(1000,1000,10,"Dwapara",2,"Pralhada","VasuDev");
		Vishnu vishnu2=new Vishnu("Devaki",12,"Avalakki","Flute","Shri Krishna","Rukmini","Mathura","Kamsa");	
//		Vishnu.setHands(8);
//		Vishnu.setNoAvatars(2);
//		Vishnu.setEyes(2);
//		Vishnu.setYuga("Tretayuga");
//		Vishnu.setNoOfGaurds(2);
//		Vishnu.setNameOfDevotee("Meera bhai");
//		Vishnu.setNameOfFather("Dasharatha");
//		Vishnu.setNameOfMother("Soumitra");
//		Vishnu.setNoOfFriends(10);
//		Vishnu.setFavFood("Mosaranna");
//		Vishnu.setInstrument("Veena");
//		Vishnu.setNameofAvtar("Vamana");
//		Vishnu.setNameOfWife("Laksmi");
//		Vishnu.setLocation("Vaikunta");
//		Vishnu.setNameOfUncle("Kashyapa");
		System.out.println("-----------------------------------------------------------");
		System.out.println(vishnu1 instanceof Vishnu);
		System.out.println(vishnu2 instanceof Vishnu);
		System.out.println(vishnu instanceof Vishnu);
		System.out.println("-----------------------------------------------------------");
		System.out.println(vishnu1.toString());
		System.out.println(vishnu2.toString());
		System.out.println("-----------------------------------------------------------");
		System.out.println((vishnu1).equals(vishnu1));
		System.out.println((vishnu2).equals(vishnu2));
		System.out.println("-----------------------------------------------------------");
		System.out.println(vishnu1.hashCode());
		System.out.println(vishnu2.hashCode());
		System.out.println("------------------------------------------------------------");
		System.out.println(vishnu1.equals(vishnu2));
		System.out.println(obj.equals(vishnu));
	}
}