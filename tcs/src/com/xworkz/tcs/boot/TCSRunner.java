package com.xworkz.tcs.boot;

import com.xworkz.tcs.bridge.TCS;

public class TCSRunner {
	public static void main() {
		TCS tcs=new TCS();
		tcs.attach();
		tcs.attempts();
		tcs.connection();
		tcs.contact();
		tcs.invest();
		tcs.layers();
		tcs.noOfWires();
		tcs.security();
		tcs.sequence();
		tcs.value();
		tcs.values();
		tcs.vpnNetwork();		
	}
}
