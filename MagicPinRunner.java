class MagicPinRunner{
	public static void main(String[] magicpin){
	
		String orderName="Mushroom Penne Pasta";
		double orderPrice=MagicPin.getOrderPrice(orderName);
		System.out.println("The price of "+orderName+" is : "+orderPrice);
	}
}