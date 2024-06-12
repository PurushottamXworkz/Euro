package com.xworkz.tcs.bridge;

import com.xworkz.tcs.things.Cyber;
import com.xworkz.tcs.things.Network;

public class TCS implements Cyber ,Network {

	@Override
	public int noOfWires() {
		// TODO Auto-generated method stub
		int number=100;
		System.out.println("This is number of wires:"+number);
		return number;
	}

	@Override
	public byte layers() {
		// TODO Auto-generated method stub
		byte layer=2;
		System.out.println("This is layer:"+layer);
		return layer;
	}

	@Override
	public double values() {
		// TODO Auto-generated method stub
		double value=54.2154d;
		System.out.println("This is values:"+value);
		return value;
	}

	@Override
	public boolean connection() {
		// TODO Auto-generated method stub
		boolean connect=false;
		System.out.println("This is connect:"+connect);
		return connect;
	}

	@Override
	public long contact() {
		// TODO Auto-generated method stub
		long phone=8745741242l;
		System.out.println("This is phone:"+phone);
		return phone;
	}

	@Override
	public int attempts() {
		// TODO Auto-generated method stub
		int attempt=20;
		System.out.println("This is attempts:"+attempt);
		return attempt;
	}

	@Override
	public byte security() {
		// TODO Auto-generated method stub
		byte secure=20;
		System.out.println("This is security:"+secure);
		return secure;
	}

	@Override
	public short sequence() {
		// TODO Auto-generated method stub
		short sequal=123;
		System.out.println("This is series:"+sequal);
		return sequal;
	}

	@Override
	public boolean vpnNetwork() {
		// TODO Auto-generated method stub
		boolean net=true;
		System.out.println("this is vpn Network:"+net);
		return net;
	}

}
