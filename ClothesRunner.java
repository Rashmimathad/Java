class ClothesRunner{
	public static void main(String[] clothes){
	
		System.out.println("main started");
		String fabricType=Clothes.getFabricType();
		System.out.println("The fabric type of the clothe is : "+fabricType);
		double price=Clothes.getPrice();
		System.out.println("The price of the cloth is : "+price+" rs");
		int noOfPiecesInStore=Clothes.getNoOfPiecesInStore();
		System.out.println("No of pieces in the store is : "+noOfPiecesInStore);
		String clotheType=Clothes.getClotheType();
		System.out.println("The type of the cloth is : "+clotheType);
		boolean isfadable=	Clothes.getIsFadable();
		System.out.println("Is the cloth fadable? "+isfadable);
		boolean isWeaven=Clothes.getIsWeaven();
		System.out.println("Is the cloth weaven? "+isWeaven);
		System.out.println("main ended");
	}

}