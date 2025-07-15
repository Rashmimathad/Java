class EatSureRunner{

	public static void main(String[] eat){
	
		String orderName="Palak Paneer";
		double orderPrice=EatSure.getOrderPrice(orderName);
		System.out.println("Price of "+orderName+" is : "+orderPrice);
		
		orderName="Chapathi";
		int quantity=2;
		orderPrice=EatSure.getOrderPrice(orderName,quantity);
		System.out.println("Price of "+orderName+" with quantity "+quantity+" is : "+orderPrice);
		
		orderName="Mushroom Kadai";
		orderPrice=EatSure.getOrderPrice(orderName);
		System.out.println("Price of "+orderName+" is : "+orderPrice);
		
		orderName="Rajma Masala";
		orderPrice=EatSure.getOrderPrice(orderName);
		System.out.println("Price of "+orderName+" is : "+orderPrice);
	
	}
}