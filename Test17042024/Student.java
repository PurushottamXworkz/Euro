class Student{
	public static void main(String args[])
	{
		int Id=1;
		String nameOfStudent="Prashant";
		
		int Id2=2;
		String nameOfStudent1="Chetan";
		
		int Id3=3;
		String nameOfStudent2="Bharat";
		
		int Id4=4;
		String nameOfStudent3="Vishwa";
		
		int Id5=5;
		String nameOfStudent4="Deepak";
		
		switch(Id){
			case 1:
			System.out.println("Name of student id 1 is: "+nameOfStudent);
			break;
			
			case 2:
			System.out.println("Name of student Id 2 is: "+nameOfStudent1);
			break;
			
			
			case 3:
			System.out.println("Name of student Id 3 is: "+nameOfStudent2);
			break;
			
			case 4:
			System.out.println("Name of student Id 4 is: "+nameOfStudent3);
			break;
			
			case 5:
			System.out.println("Name of student Id 5 is: "+nameOfStudent4);
			break;
			
			default:
			System.out.println("Name of student is invalid ");
			break;
		}
	}
}