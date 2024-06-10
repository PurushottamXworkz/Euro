package com.xworkz.computer.boot;

import com.xworkz.computer.childclasses.*;

public class ComputerRunner {
	public static void main(String args[]) {
		Hplaptop hp=new Hplaptop();
		Asuslaptop asus=new Asuslaptop();
		hp.motherBoard();
		hp.keyBoard();
		hp.storage();
		System.out.println(hp.model);
		asus.motherBoard();
		asus.keyBoard();
		asus.seriesOfLaptop();
	}
}
