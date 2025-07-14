class ZeptoRunner{
	public static void main(String[] zep){
	
		String itemName="Carrot";
		double itemPrice=Zepto.getItemPrice(itemName);
		System.out.println("price of "+itemName+" is : "+itemPrice);
	}
}