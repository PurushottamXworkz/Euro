class Goods{
	public static void main(String args[]){
		int price = 100;
		float cost =price;
		System.out.println("This is implicit casting "+cost);
		
		int noOfGoods = 10;
		long value = (long)noOfGoods;
		System.out.println("This is implicit casting "+value);
		
		int valueOfChar=78;
		char charValue = (char)valueOfChar;
		System.out.println("This is implicit casting "+charValue);
	}
}