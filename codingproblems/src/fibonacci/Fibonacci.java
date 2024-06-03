package fibonacci;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		System.out.println("Enter value of number");
		Scanner sc =new Scanner(System.in);
		int number =sc.nextInt();
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=number;i++) {
			int nextNumber=a+b;
			System.out.print(+nextNumber+" ");
			a=b;
			b=nextNumber;
		}		
	}
}
