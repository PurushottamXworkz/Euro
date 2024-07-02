package com.xworkz.paintings.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.paintings.dto.Paintdto;

public class PaintRunner {
	public static void main(String[] args) {
		Paintdto paintdto=new Paintdto("Ravivarma", 100, "Mathura");
		Paintdto paintdto1=new Paintdto("lenardo", 200, "London");
		Paintdto paintdto2=new Paintdto("Da vinchi", 500, "Greece");
		Paintdto paintdto3=new Paintdto("raghav", 500, "Bangalore");
		
		Collection<Paintdto> collection = new ArrayList<Paintdto>();
		collection.add(paintdto);
		collection.add(paintdto1);
		collection.add(paintdto2);
		collection.add(paintdto3);
		
		for (Paintdto paintdto4 : collection) {
			System.out.println(paintdto4.getPainterName());
		}
		System.out.println(collection.size());
		
		collection.remove(paintdto1);
		for (Paintdto paintdto4 : collection) {
			System.out.println(paintdto4.getPainterName());
		}
		System.out.println(collection.size());
	}
}
