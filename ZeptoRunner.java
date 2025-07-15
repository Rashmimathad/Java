class ZeptoRunner{
	public static void main(String[] zep){
	
		String itemName="Carrot";
		double itemPrice=Zepto.getItemPrice(itemName);
		System.out.println("price of "+itemName+" is : "+itemPrice);
		System.out.println();
		itemName="Toor dal";
		int quantity=5;
		itemPrice=Zepto.getItemPrice(itemName,quantity);
		System.out.println("price of "+itemName+" with quantity "+quantity+" is : "+itemPrice);
		System.out.println();
		itemName="Carrot";
		itemPrice=Zepto.getItemPrice(itemName);
		System.out.println("price of "+itemName+" is : "+itemPrice);
	}
}