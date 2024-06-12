package com.xworkz.news.bridge;

import com.xworkz.news.things.Crime;
import com.xworkz.news.things.Politics;

public class News implements Crime ,Politics{

	@Override
	public String judicery() {
		// TODO Auto-generated method stub
		String name="Crime";
		System.out.println("This is name:"+name);
		return name;
	}

	@Override
	public int employees() {
		// TODO Auto-generated method stub
		int employee=12;
		System.out.println("This is employee:"+employee);
		return employee;
	}

	@Override
	public boolean isPolitical() {
		// TODO Auto-generated method stub
		boolean political=true;
		System.out.println("This is political:"+political);
		return political;
	}

	@Override
	public long contact() {
		// TODO Auto-generated method stub
		long phone=854125745l;
		System.out.println("This is phone :"+phone);
		return phone;
	}

	@Override
	public float payment() {
		// TODO Auto-generated method stub
		float pay=85000l;
		System.out.println("This is phone :"+pay);
		return pay;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		String hesaru="Darshan";
		System.out.println("This is phone :"+hesaru);
		return hesaru;
	}

	@Override
	public int staff() {
		// TODO Auto-generated method stub
		int noOfstaff=100;
		System.out.println("This is number of staff :"+noOfstaff);
		return noOfstaff;
	}

	@Override
	public boolean isNewsTrue() {
		// TODO Auto-generated method stub
		boolean news=true;
		System.out.println("This is news :"+news);
		return news;
	}

	@Override
	public long pollingNumber() {
		// TODO Auto-generated method stub
		long polling=9852741541l;
		System.out.println("This is polling :"+polling);
		return 0;
	}

	@Override
	public short timing() {
		// TODO Auto-generated method stub
		short time=8;
		System.out.println("This is timing :"+time);
		return time;
	}
}
