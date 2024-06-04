package com.xworkz.tostring_concept.childclasses;

import com.xworkz.tostring_concept.things.Cat;

public class Panthera extends Cat {
		public String name;
		public int weight;
		
		public void panthera() {
			System.out.println("This is pathera class");
		}
		
		public void details(String name,int weight) {
			this.name=name;
			this.weight=weight;
		}
		
		@Override
		public String toString() {
			System.out.println("This is String object representation");
			return "Panthera[Name :"+name+",Weight :"+weight+"]";
		}
}
