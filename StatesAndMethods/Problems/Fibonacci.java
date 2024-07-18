import java.util.Scanner;
class Fibonacci{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	int a=0;int b=1;
	System.out.println(a+" "+b);
	for(int i=2;i<=number;i++){
	int nextNumber = a+b;
	System.out.printf(nextNumber+" ");
	a = b;
	b = nextNumber;
	}
	}
}