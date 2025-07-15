class SwiggyRunner{

	public static void main(String[] swiggy){
	
		String foodName="Chicken Wings";
		int quantity=3;
		double foodPrice=Swiggy.getFoodPrice(foodName);
		System.out.println("Price of "+foodName+" witn quantity "+quantity+" is : "+foodPrice); 
		
		foodName="Paneer Biryani";
		foodPrice=Swiggy.getFoodPrice(foodName,quantity);
		System.out.println("Price of "+foodName+" is : "+foodPrice); 
		
		foodName="Chocolate Fudge";
		foodPrice=Swiggy.getFoodPrice(foodName);
		System.out.println("Price of "+foodName+" is : "+foodPrice); 
		
		foodName="Jeera Rice";
		quantity=2;
		foodPrice=Swiggy.getFoodPrice(foodName,quantity);
		System.out.println("Price of "+foodName+" with quantity "+quantity+" is : "+foodPrice);
	}

}