package com.xworkz.government.boot;

import com.xworkz.government.childClasses.Agriculture;
import com.xworkz.government.childClasses.SocialWelfare;
import com.xworkz.government.childClasses.WaterBoard;

public class GovernmentRunner {
	public static void main(String args[]) {
		SocialWelfare social=new SocialWelfare();
		social.departmentOfSocialWelfare();
		social.government();
		
		Agriculture agri=new Agriculture();
		agri.departmentOfAgriculture();
		agri.government();
		
		WaterBoard water= new WaterBoard();
		water.departmentOfWaterBoard();
		water.government();
	}
}
