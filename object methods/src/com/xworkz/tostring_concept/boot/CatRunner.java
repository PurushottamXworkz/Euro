  package com.xworkz.tostring_concept.boot;

import com.xworkz.tostring_concept.childclasses.Panthera;
import com.xworkz.tostring_concept.childclasses.Puma;
import com.xworkz.tostring_concept.childclasses.Tiger;
import com.xworkz.tostring_concept.things.Cat;

public class CatRunner {
		public static void main(String args[]) {
			Cat cat=new Cat();
			Cat cat1= new Tiger();
			Cat cat2= new Panthera();
			Puma puma =new Puma();
			
			System.out.println(cat1 instanceof Tiger);
			System.out.println(cat2 instanceof Panthera);
			System.out.println(puma instanceof Puma);
			System.out.println(cat instanceof Tiger);
			System.out.println(cat instanceof Panthera);
			
			cat.cat();
			((Panthera)cat2).panthera();
			((Panthera)cat2).details("Panthera",325);
			System.out.println("The represntaion of String Object :"+((Panthera)cat2).toString());
						
		}
}
