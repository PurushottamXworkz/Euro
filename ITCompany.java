class ITCompany{
	public static void main(String args[]){
		int[] noOfITCompanies={21,2,3,4,5,5,44,32,112,134};
		byte[] emplyeesOfITCompany={112,14,12,50,47,15,99,74};
		short[] locationsOfITCompany={1,10,3,4,4,5,8,2};
		long[] dataOfITcompanies={1112,323,4,435,56566,8764,2324,1435435,978645};
		
		for(int i=0;i<noOfITCompanies.length;i++){
			System.out.println("number Of ITCompanies : "+noOfITCompanies[i]);
		}
		
		for(int i=0;i<emplyeesOfITCompany.length;i++){
			System.out.println("Emplyees Of ITCompany: "+emplyeesOfITCompany[i]);
		}
		
		for(int i=0;i<locationsOfITCompany.length;i++){
			System.out.println("locations Of ITCompany: "+locationsOfITCompany[i]);
		}
		
		for(int i=0;i<dataOfITcompanies.length;i++){
			System.out.println("Data Of ITcompanies: "+dataOfITcompanies[i]);
		}
		
	}
}