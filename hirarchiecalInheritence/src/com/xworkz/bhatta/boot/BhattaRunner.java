package com.xworkz.bhatta.boot;

import com.xworkz.bhatta.childClasses.Akki;
import com.xworkz.bhatta.childClasses.Avalakki;
import com.xworkz.bhatta.childClasses.Churumari;

public class BhattaRunner {
	public static void main(String args[]) {
		Akki akki = new Akki();
		akki.akkiClass();
		
		Avalakki avalakki= new Avalakki();
		avalakki.avalakkiClass();
		
		Churumari chummari= new Churumari();
		chummari.churumariClass();
		
		System.out.println();
		
		akki.parentClass();
		chummari.parentClass();
		avalakki.parentClass();
	}
}
