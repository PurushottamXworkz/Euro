package com.xworkz.wipro.bridge;

import com.xworkz.wipro.things.Applications;
import com.xworkz.wipro.things.Service;

public class Wipro implements Applications,Service{

	@Override
	public void nameOfTeam() {
		// TODO Auto-generated method stub
		System.out.println("This is name of team from Wipro class");
	}

	@Override
	public String excecutive() {
		// TODO Auto-generated method stub
		String name="Darshan";
		System.out.println("Name of Excecutive : "+name);
		return name;
	}

	@Override
	public long contact() {
		// TODO Auto-generated method stub
		long contact=8762772285l;
		System.out.println("Contact : "+contact);
		return contact;
	}

	@Override
	public boolean calling() {
		// TODO Auto-generated method stub
		boolean call=false;
		System.out.println("This is calling :"+call);
		return call;
	}

	@Override
	public int emplyees() {
		// TODO Auto-generated method stub
		int noOfEmp=100;
		System.out.println("The number of employes :"+noOfEmp);
		return noOfEmp;
	}

	@Override
	public short unit() {
		// TODO Auto-generated method stub
		short units=20;
		System.out.println("The number of units:"+units);
		return units;
	}

	@Override
	public float amount() {
		// TODO Auto-generated method stub
		float cost=199.99f;
		System.out.println("The cost is :"+cost);
		return cost;
	}

	@Override
	public char sequence() {
		// TODO Auto-generated method stub
		char series='A';
		System.out.println("The sequence :"+series);
		return series;
	}

	@Override
	public byte noOfCalls() {
		// TODO Auto-generated method stub
		byte numOfcalls=20;
		System.out.println("the number of calls :"+numOfcalls);
		return numOfcalls;
	}

	@Override
	public void training() {
		// TODO Auto-generated method stub
		System.out.println("this is Training from class wipro");
	}

	@Override
	public String nameOfDrive() {
		// TODO Auto-generated method stub
		String drive="OFF-Campus";
		System.out.println("This is name of Drive:"+drive);
		return drive;
	}

	@Override
	public long POC() {
		// TODO Auto-generated method stub
		long phoneNo=8762448857l;
		System.out.println("This is phone from wipro:"+phoneNo);
		return phoneNo;
	}

	@Override
	public boolean isStarted() {
		// TODO Auto-generated method stub
		boolean start=true;
		System.out.println("This is Started:"+start);
		return start;
	}

	@Override
	public int noOfEmplyees() {
		// TODO Auto-generated method stub
		int employees=100;
		System.out.println("This is employess from wipro:"+employees);
		return employees;
	}

	@Override
	public short storage() {
		// TODO Auto-generated method stub
		short store=12;
		System.out.println("This is storage :"+store);
		return store;
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		float price=987;
		System.out.println("This is cost from wipro :"+price);
		return price;
	}

	@Override
	public char edition() {
		// TODO Auto-generated method stub
		char edit='b';
		System.out.println("This is edition :"+edit);
		return edit;
	}

	@Override
	public byte limit() {
		// TODO Auto-generated method stub
		byte limits=10;
		System.out.println("This is limit:"+limits);
		return limits;
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		double mrp=199.87645d;
		System.out.println("This is price:"+mrp);
		return mrp;
	}
}
