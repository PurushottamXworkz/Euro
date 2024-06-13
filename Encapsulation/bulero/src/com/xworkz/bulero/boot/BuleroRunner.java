package com.xworkz.bulero.boot;

import com.xworkz.bulero.things.BuleroThings;

public class BuleroRunner {
	public static void main(String args[]) {
		BuleroThings bulero=new BuleroThings();
		
		bulero.save("Bulero", "Shivu", "RR Nagar", "Btm layout", 7865443325l, 10, 725688282l, 10, 20, true);
		
	}
}
