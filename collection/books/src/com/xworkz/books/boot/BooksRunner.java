package com.xworkz.books.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.xworkz.books.dto.BooksDto;

public class BooksRunner {
	public static void main(String[] args) {
		BooksDto booksDto4 = new BooksDto("Mahapalayana", "K.P.Poorna", 100000);
		BooksDto booksDto2 = new BooksDto("Pappilon", "K.P.Poorna", 2000);
		BooksDto booksDto3 = new BooksDto("Chidanbara", "K.P.Poorna", 5000);
		BooksDto booksDto1 = new BooksDto("Malegalalli madumagalu", "Kuvempu", 2000);
		BooksDto booksDto5 = new BooksDto("Meghalaya", "Ravi", 5000); 
		
		ArrayList<BooksDto> dtos=new ArrayList<BooksDto>();
		dtos.add(booksDto1);
		dtos.add(booksDto2);
		dtos.add(booksDto3);
		dtos.add(booksDto4);
		dtos.add(booksDto5);
		
		Comparator<BooksDto> comparator = new Comparator<BooksDto>() {

			@Override
			public int compare(BooksDto o1, BooksDto o2) {
				return o1.getBookName().compareTo(o2.getBookName());
			}
		};
		
		Collections.sort(dtos,comparator);
		
		for (BooksDto booksDto : dtos) {
			System.out.println("Sorting on no of books : "+booksDto);
		}
		
	}
}
