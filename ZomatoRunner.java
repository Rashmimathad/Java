class ZomatoRunner{
	
	public static void main(String[] zomato){
	
		String foodName="Mango misu";
		double foodPrice=Zomato.getFoodPrice(foodName);
		System.out.println("Price of "+foodName+" is : "+foodPrice);
		System.out.println();
		 foodName="Lassi";
		 foodPrice=Zomato.getFoodPrice(foodName);
		System.out.println("Price of "+foodName+" is : "+foodPrice);
		System.out.println();
		 foodName="Paddu";
		 int quantity=2;
		 foodPrice=Zomato.getFoodPrice(foodName,quantity);
		System.out.println("Price of "+foodName+" with quantity "+quantity+" is : "+foodPrice);
	}
}