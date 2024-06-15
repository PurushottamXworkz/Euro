package com.xworkz.government.boot;

import com.xworkz.government.childClasses.AndraPradesh;
import com.xworkz.government.childClasses.Karnataka;
import com.xworkz.government.childClasses.Kerala;

public class GovernmentRunner {
	public static void main(String[] args) {
		AndraPradesh ap = new AndraPradesh();
		Karnataka ka=new Karnataka();
		Kerala kl=new Kerala();
		
		ap.andra();
		ap.govern();
		ka.karnatak();
		ka.govern();
		kl.kerala();
		kl.govern();
		
	}
}
