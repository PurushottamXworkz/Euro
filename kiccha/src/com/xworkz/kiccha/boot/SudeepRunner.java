package com.xworkz.kiccha.boot;

import com.xworkz.kiccha.things.Sudeep;

public class SudeepRunner {
	public static void main(String args[]) {
		Object obj = new Object();
		System.out.println("------------------------------------------------------------");
		Sudeep sudeep = new Sudeep(46, 5, 11, 6.3f, 8088204455l, true, 52, 78);
		Sudeep sudee = new Sudeep("Kannada", "Shimogga", "Kiccha Sudeepa", "Nandi Award", "Priya", "My Autograph",
				"Kiccha");
		sudeep.setAddress("Bengalore");
		sudeep.setAge(50);
		sudeep.setComeBackMovie("Just mat matalli");
		sudeep.setContact(8762772285l);
		sudeep.setHeight(6.2f);
		sudeep.setlanguageOfMovie("Telgu");
		sudeep.setNameOfActor("Badasha");
		sudeep.setNameOfAward("Film-fare");
		sudeep.setNameofMovie("Vishnuvardhana");
		sudeep.setNoOfAwards(20);
		sudeep.setNoOfMovies(100);
		sudeep.setPerformingLanguages(5);
		sudeep.setpresentlyActive(false);
		sudeep.setWeight(70);
		sudeep.setWifeName("Padmini");
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
