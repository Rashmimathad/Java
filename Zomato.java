class Zomato{

	public static double getFoodPrice(String foodName){
	
		double foodPrice=0.00;
		
		if(foodName=="Andhra Chicken Kabab")
			foodPrice=335.00;
		else if(foodName=="Veggie Supreme Burger")
			foodPrice=169.00;
		else if(foodName=="Ghee Masala Dosa")
			foodPrice=165.00;
		else if(foodName=="Thatte Idli")
			foodPrice=60.00;
		else if(foodName=="Paddu")
			foodPrice=120.00;
		else if(foodName=="Pudina Rice")
			foodPrice=154.00;
		else if(foodName=="Poori Saagu")
			foodPrice=149.00;
		else if(foodName=="Dahi Vada")
			foodPrice=110.00;
		else if(foodName=="Chilli Bajji")
			foodPrice=85.00;
		else if(foodName=="Gulab Jamun")
			foodPrice=99.00;
		else if(foodName=="Paneer Pakoda")
			foodPrice=169.00;
		else if(foodName=="Sweet Lassi")
			foodPrice=65.00;
		else if(foodName=="Chocolate Truffle Cake")
			foodPrice=796.61;
		else if(foodName=="Choco Hazlenut Cake")
			foodPrice=1567.80;
		else if(foodName=="Spaghetti Aglio Olio")
			foodPrice=371.43;
		else if(foodName=="Cheese Cake Pastry")
			foodPrice=211.86;
		else if(foodName=="Peri Peri Fries")
			foodPrice=266.67;
		else if(foodName=="Red Velvet Cup Cake")
			foodPrice=101.69;
		else if(foodName=="Mango Macarons")
			foodPrice=72.67;
		else if(foodName=="Mango misu")
			foodPrice=296.61;
		else if(foodName=="Jumbo Shawarma")
			foodPrice=239.00;
		else if(foodName=="Chicken Nuggets")
			foodPrice=189.00;
		else if(foodName=="Potato Poppers")
			foodPrice=169.00;
		else if(foodName=="Blueberry Poppins")
			foodPrice=109.50;
		else if(foodName=="Paneer Tikka Sandwich")
			foodPrice=157.14;
		else if(foodName=="Hummus And Pita Platter")
			foodPrice=290.47;
		else if(foodName=="Hot Cappucino")
			foodPrice=209.00;
		else if(foodName=="Cheesy Paneer Roll")
			foodPrice=159.00;
		else if(foodName=="Millet Dal Khichdi")
			foodPrice=199.00;
		else if(foodName=="Pongal")
			foodPrice=110.00;
		else System.out.println(foodName+" is not available..");
			
		return foodPrice;
	}

}