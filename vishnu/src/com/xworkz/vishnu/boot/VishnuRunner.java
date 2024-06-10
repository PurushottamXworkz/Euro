package com.xworkz.vishnu.boot;

import com.xworkz.vishnu.things.Vishnu;

public class VishnuRunner {
	public static void main(String args[]) {
		Object obj=new Object();
		Vishnu vishnu=new Vishnu();
		System.out.println("------------------------------------------------------------");
		Vishnu vishnu1=new Vishnu(1000,1000,10,"Dwapara",2,"Pralhada","VasuDev");
		Vishnu vishnu2=new Vishnu("Devaki",12,"Avalakki","Flute","Shri Krishna","Rukmini","Mathura","Kamsa");	
		vishnu1.setHands(8);
		vishnu1.setNoAvatars(2);
		vishnu1.setEyes(2);
		vishnu1.setYuga("Tretayuga");
		vishnu1.setNoOfGaurds(2);
		vishnu1.setNameOfDevotee("Meera bhai");
		vishnu1.setNameOfFather("Dasharatha");
		vishnu1.setNameOfMother("Soumitra");
		vishnu1.setNoOfFriends(10);
		vishnu1.setFavFood("Mosaranna");
		vishnu1.setInstrument("Veena");
		vishnu1.setNameofAvtar("Vamana");
		vishnu1.setNameOfWife("Laksmi");
		vishnu1.setLocation("Vaikunta");
		vishnu1.setNameOfUncle("Kashyapa");
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