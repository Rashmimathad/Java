class MagicPinRunner{
	public static void main(String[] magicpin){
	
		String orderName="Mushroom Penne Pasta";
		double orderPrice=MagicPin.getOrderPrice(orderName);
		System.out.println("The price of "+orderName+" is : "+orderPrice);
		System.out.println();
		orderName="Macroni";
		orderPrice=MagicPin.getOrderPrice(orderName);
		System.out.println("The price of "+orderName+" is : "+orderPrice);
		System.out.println();
		orderName="Ice Latte";
		int quantity=2;
		orderPrice=MagicPin.getOrderPrice(orderName,quantity);
		System.out.println("The price of "+orderName+" with quantity "+quantity+" is : "+orderPrice);
	}
}