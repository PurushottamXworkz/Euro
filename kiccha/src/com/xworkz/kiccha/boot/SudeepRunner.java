package com.xworkz.kiccha.boot;

import com.xworkz.kiccha.things.Sudeep;

public class SudeepRunner {
	public static void main(String args[]) {
		Object obj = new Object();
		Sudeep vishnu = new Sudeep();
		System.out.println("------------------------------------------------------------");
		Sudeep sudeep = new Sudeep(46, 5, 11, 6.3f, 8088204455l, true, 52, 78);
		Sudeep sudee = new Sudeep("Kannada", "Shimogga", "Kiccha Sudeepa", "Nandi Award", "Priya", "My Autograph",
				"Kiccha");
		Sudeep.setAddress("Bengalore");
		Sudeep.setAge(50);
		Sudeep.setComeBackMovie("Just mat matalli");
		Sudeep.setContact(8762772285l);
		Sudeep.setHeight(6.2f);
		Sudeep.setlanguageOfMovie("Telgu");
		Sudeep.setNameOfActor("Badasha");
		Sudeep.setNameOfAward("Film-fare");
		Sudeep.setNameofMovie("Vishnuvardhana");
		Sudeep.setNoOfAwards(20);
		Sudeep.setNoOfMovies(100);
		Sudeep.setPerformingLanguages(5);
		Sudeep.setpresentlyActive(false);
		Sudeep.setWeight(70);
		Sudeep.setWifeName("Padmini");
		System.out.println("-----------------------------------------------------------");
		System.out.println(sudeep instanceof Sudeep);
		System.out.println(sudee instanceof Sudeep);
		System.out.println(obj instanceof Sudeep);
		System.out.println("-----------------------------------------------------------");
		System.out.println(sudee.toString());
		System.out.println(sudeep.toString());
		System.out.println("-----------------------------------------------------------");
		System.out.println((sudee).equals(sudee));
		System.out.println((sudeep).equals(sudeep));
		System.out.println("-----------------------------------------------------------");
		System.out.println(sudee.hashCode());
		System.out.println(sudeep.hashCode());
		System.out.println("------------------------------------------------------------");
		System.out.println(sudee.equals(sudeep));
		System.out.println(obj.equals(sudeep));
	}
}
