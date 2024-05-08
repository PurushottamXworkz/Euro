class Calender{
	public Calender(){
		System.out.println("This is no arguement constructor");
	}
	public Calender(int price){
		System.out.println("The price of calender is "+price);
	}
	public Calender(int price,String nameOfCalender){
		//System.out.println("The price of calender is "+price);
		System.out.println("And the name of calender is "+nameOfCalender);
	}
	public Calender(int price,String nameOfCalender,long contactForCalender){
		//System.out.println("The price of calender is "+price);
		//System.out.println("And the name of calender is "+nameOfCalender);
		System.out.println("Contact for calender "+contactForCalender);
	}
	public Calender(int price,String nameOfCalender,long contactForCalender,double mrpOfCalender){
		System.out.println("MRP of calender "+mrpOfCalender);
	}
	public Calender(int price,String nameOfCalender,long contactForCalender,double mrpOfCalender,char typeOfCalender){
		System.out.println("Type of calender "+typeOfCalender);
	}
	public Calender(int price,String nameOfCalender,long contactForCalender,double mrpOfCalender,char typeOfCalender,boolean calenderAvailable){
		System.out.println("Calender is available : "+calenderAvailable);
	}
	public Calender(int price,String nameOfCalender,long contactForCalender,double mrpOfCalender,char typeOfCalender,boolean calenderAvailable,String sizeOfCalender){
		System.out.println("Size of calender is "+sizeOfCalender);
	}
	public Calender(int price,String nameOfCalender,long contactForCalender,double mrpOfCalender,char typeOfCalender,boolean calenderAvailable,String sizeOfCalender,int noOfHolidays){
		System.out.println("The number of holidays in calender "+noOfHolidays);
	}
	public Calender(int price,String nameOfCalender,long contactForCalender,double mrpOfCalender,char typeOfCalender,boolean calenderAvailable,String sizeOfCalender,int noOfHolidays,String address){
		System.out.println("The address of calender "+address);
	}
}