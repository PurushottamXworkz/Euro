package factorial;

import java.util.Scanner;

public class Factorial {
	
	static int fact(int number) {
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String args[]) {
		System.out.println("Enter number value");
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		int answer= fact(number);
		System.out.println("The answer of factorial is :"+answer);	
	}
}
