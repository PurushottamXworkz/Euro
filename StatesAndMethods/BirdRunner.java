class BirdRunner{
	public static void main(String args[]){
	   String [] bird=Bird.birdName();

	   for(String values:bird){
			System.out.println("The names of Birds : "+values);
		}

	   int [] ageOfTheBirds ={14,11,12,13,9,8};
	   int [] birdsAge=Bird.birdAge(ageOfTheBirds);
	
	   for(int agesOfbird:birdsAge){			
	      System.out.println("The age of Birds : "+agesOfbird);
	    }
	}
}