class Cable{
	public static void main(String args[]){
		int cableId=123;
		String cableName="VGaurd";
		float cableThick=2.14f;
		
		if(cableId==123 && cableName=="VGaurd"){
			System.out.println("The cable id is not correct");
		}
		else{
			System.out.println("The cable id and cable name is not known");    
		}
		if(cableId==123 && cableName!="VGaurd" && cableThick==2.14f){
			System.out.println("The condition is in If statement");
		}
		else{
			System.out.println("The condition is in Else Statement");
		}
	}
}