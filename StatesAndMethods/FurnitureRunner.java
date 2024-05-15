class FurnitureRunner{
	public static void main(String args[]){
		Timber timber=new Timber();
		Furniture furniture = new Furniture("Sofa","Ramnagar",8745987451l);
		timber.detailsOfFurniture("A1 furniture",89745.999f,furniture);
	}
}