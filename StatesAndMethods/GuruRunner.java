class GuruRunner{
	public static void main(String args[]){
		Student student=new Student();
		Guru guru=new Guru("Sadguru","Chennai",8541527451l);
		student.studentDetails("Paresh","Chennai",guru);
		System.out.println("-------------------------------------");
		student.studentDetails("Pranav","Pune",guru);
		System.out.println("-------------------------------------");
		student.studentDetails("Ramesh","Benaglore",guru);
	}
}