package oddoreven;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number value : ");
		int number =sc.nextInt();
		
		if(number%2==0) {
			System.out.println("The number is Even");
		}else {
			System.out.println("The number is Odd");
		}
	}
}
