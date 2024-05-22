class ProductsOfGoogle extends Google{
	public void googleProducts(){
		System.out.println("This is child of Google");
	}
	public void productName(){
		System.out.println("The name of product is :"+super.nameOfProduct);
	}
	public void owner(){
		System.out.println("The manufacturer of the product is :"+super.manufacturer);
	}
	public void productsInNumber(){
		System.out.println("The number of products are :"+super.noOfproducts);
	}
}