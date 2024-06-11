package com.xworkz.sagani.bridge;

import com.xworkz.sagani.things.Firtilizer;
import com.xworkz.sagani.things.Medicine;
import com.xworkz.sagani.things.Paint;
import com.xworkz.sagani.things.Perfumes;
import com.xworkz.sagani.things.Vibhooti;

public class Sagani extends Perfumes implements Firtilizer ,Medicine, Paint, Vibhooti{
	
	@Override
	public void MRP() {
		// TODO Auto-generated method stub
		System.out.println("The MRP of Paint");
	}

	@Override
	public void nameOfPaint() {
		// TODO Auto-generated method stub
		System.out.println("The name of paint");
		
	}

	@Override
	public void nameOfCompany() {
		// TODO Auto-generated method stub
		System.out.println("the name of paint company");
	}

	@Override
	public void nameOfOwner() {
		// TODO Auto-generated method stub
		System.out.println("The name of owner");
	}

	@Override
	public void quantity() {
		// TODO Auto-generated method stub
		System.out.println("The quantity");
	}

	@Override
	public void nameOfMedicine() {
		// TODO Auto-generated method stub
		System.out.println("The name of medicine");
	}

	@Override
	public void medicalUse() {
		// TODO Auto-generated method stub
		System.out.println("the medical use");
	}

	@Override
	public void quantityUse() {
		// TODO Auto-generated method stub
		System.out.println("The quantity use");
	}

	@Override
	public void amount() {
		// TODO Auto-generated method stub
		System.out.println("The amount");
	}

	@Override
	public void distributer() {
		// TODO Auto-generated method stub
		System.out.println("The distributer");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("The price");
	}

	@Override
	public void potassium() {
		// TODO Auto-generated method stub
		System.out.println("The potassium");
	}

	@Override
	public void typeOfSoil() {
		// TODO Auto-generated method stub
		System.out.println("Type of soil");
	}

	@Override
	public void distributtion() {
		// TODO Auto-generated method stub
		System.out.println("the distribution");
	}

	@Override
	public void center() {
		// TODO Auto-generated method stub
		System.out.println("The center");
	}

	@Override
	public void noOfVibhooti() {
		// TODO Auto-generated method stub
		System.out.println("The number of vibhooti");
	}

	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("The cost");
	}

	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println("location");
	}

	@Override
	public void productionPerDay() {
		// TODO Auto-generated method stub
		System.out.println("production perday");
	}

	@Override
	public void nameOfproduct() {
		// TODO Auto-generated method stub
		System.out.println("The name of product");
	}
}
