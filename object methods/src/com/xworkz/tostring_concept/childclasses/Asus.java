package com.xworkz.tostring_concept.childclasses;

import com.xworkz.tostring_concept.things.Mobiles;

public class Asus extends Mobiles{
		public int price;
		public String model;
		public void asus(){
			System.out.println("This is Asus class child of Mobiles");
		}
		public void asusDetails(int price,String model) {
			this.price=price;
			this.model=model;
		}
		@Override
		public String toString() {
			return "Asus:[Price:"+price+", Model:"+model+"]"; 
		}
		
}
