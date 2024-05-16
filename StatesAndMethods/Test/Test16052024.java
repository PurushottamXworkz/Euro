16-05-2024


1.What is java explain with a flow diagram
Ans:-Java was developed by Games Gosling in 1992.
	-Later it was owned by Oracle. 
	-Java is Object oriented Language.
	-Java is Platform Independent.
	
	Architecture of Java 
	-JDK it is a tool kit used to build java application
	-JDK involves JRE and JVM
	-JRE-Java run time environment it involves JVM and other class files
	-JVM-Java viirtual machine it is virtual not present in reality. It is finding signature of main method to start execution of program.
	
	
2.What is WORA , platform independent and .class flow diagram
Ans:-WORA(Write once run anywhere)
	-WORA
		The source code once after compilation using javac it can be converted into byte code or .class file we can use this to run on any platform like Windows, Linux or MAC.
		Hence, it is called platform independent. 

3.Types of datatypes
Ans:-In java there are two types of datatypes present.
	1.Primitive datatypes and 2.Non-primitive datatypes.
	1.Primitive datatypes are as follows
		1.int
		2.byte
		3.short
		4.float
		5.double
		6.long
		7.boolean
		8.char
		
	2.Non-Primitive dataypes are as follows
		1.Array
		2.String
		3.Collections etc
		

4.Explain methods and constructors with example
Ans:-Methods are used to perform specific task.
	
	Exapmle:
	
	class Coconut{
	public Coconut(){
		System.out.println("This is no arguement constructor");
	}
	public static void detailsOfCoconut(){
	int priceOfCoconut=100;
	System.out.println("The price of coconut is :"+price);
	}
	}
	
	class CoconutRunner{
		public static void main(String args[]){
		coconut coconut=new Coconut(); //instance creation of constructor 
		coconut.detailsOfCoconut(); //Here we are calling method using reference name of constructor.
		}
	}

5.Explain polymorphism by using constructors
Ans:Polymorphism is nothing but same name of method but having different parameters.
	Example:
	
	class Raghav{
	public Raghav(int noOfMobiles){
	System.out.println("Number of mobiles Raghav having :"+noOfMobiles);
	}
	public Raghav(int noOfMobiles,int noOfBikes){
	System.out.println("Number of mobiles Raghav having :"+noOfMobiles);
	System.out.println("Number of bikes Raghav having :"+noOfBikes);
	}
	}
	
	public RaghavRunner{
		public static void main(String args[]){
			Raghav raghav=new Raghav(10);
			Raghav raghu=new Raghav(10,50);//here passing two arguement values
		}
	}
	
6.Explain switch case with example
Ans:Exapmle
	class Days{
	public static void main(String args[]){
	int n=5;
	switch(n){
	case 1:System.out.println("this is sunday");
		break;
	case 2:System.out.println("this is monday");
		break;
	case 3:System.out.println("Tthis is Tuesday");
		break;
	case 4:System.out.println("This is Wednesday");
		break;
	case 5:System.out.println("This is Thursday");
		break;	
	case 6:System.out.println("This is Friday");
		break;	
	case 7:System.out.println("This is saturday");
		break;	
	default:System.out.println("Invalid input");
		break;
	}
	}
	}

7.Explain 10 Keywords
Ans: 1.int-it stores integer values
	 2.float- it stores float values along with ending f
	 3.double-it stores double values ending with d
	 4.char- it stores char type values
	 5.boolean-it stores boolean values
	 6.break-used to exit from flow
	 7.default-used to execute default statement
	 8.if- used to check condition
	 9.static- used in declaration of values
	 10.void- its a return type it does not return any values
	 
8.Explain this chaining 
Ans: class Raghav{
	public Raghav(int noOfMobiles){
	System.out.println("Number of mobiles Raghav having :"+noOfMobiles);
	}
	public Raghav(int noOfMobiles,int noOfBikes){
	System.out.println("Number of mobiles Raghav having :"+noOfMobiles);
	System.out.println("Number of bikes Raghav having :"+noOfBikes);
	this.noOfBikes=noOfBikes;
	this.noOfMobiles=noOfMobiles;
	System.out.println("Number of bikes having :"+this.noOfBikes);
	System.out.println("Number of mobiles Raghav having :"+this.noOfMobiles
	}
	}
	
	public RaghavRunner{
		public static void main(String args[]){
		Raghav raghav=new Raghav(10);
		Raghav raghu=new Raghav(10,50); 
		}
	}