class Swiggy{

	public static double getFoodPrice(String foodName){
	
		double foodPrice=0.00;
		
		if(foodName=="Chilli Guava Boba")
			foodPrice=109.00;
		else if(foodName=="Butter Chicken")
			foodPrice=158.00;
		else if(foodName=="Dal Fry")
			foodPrice=74.00;
		else if(foodName=="Egg Burji")
			foodPrice=74.00;
		else if(foodName=="Chilly Chicken")
			foodPrice=144.00;
		else if(foodName=="Tandoori Chicken")
			foodPrice=155.00;
		else if(foodName=="Chilly Prawns")
			foodPrice=308.00;
		else if(foodName=="Seer Fish Tawa Fry")
			foodPrice=430.00;
		else if(foodName=="Jeera Rice")
			foodPrice=138.00;
		else if(foodName=="Coin Parota")
			foodPrice=32.00;
		else if(foodName=="Rumali Roti")
			foodPrice=34.00;
		else if(foodName=="Butter Naan")
			foodPrice=47.00;
		else if(foodName=="Kulcha")
			foodPrice=37.00;
		else if(foodName=="Dal Thadaka")
			foodPrice=84.00;
		else if(foodName=="Mint Chutney")
			foodPrice=21.00;
		else if(foodName=="Mix Fruit Bowl")
			foodPrice=120.00;
		else if(foodName=="Spicy Zinger Burger")
			foodPrice=219.00;
		else if(foodName=="Chicken Popcorn")
			foodPrice=115.00;
		else if(foodName=="Chicken Wings")
			foodPrice=179.00;
		else if(foodName=="Mexican Fiesta")
			foodPrice=319.00;
		else if(foodName=="Masala Chai")
			foodPrice=89.00;
		else if(foodName=="Hot Chocolate")
			foodPrice=119.00;
		else if(foodName=="Wheat Taco")
			foodPrice=99.00;
		else if(foodName=="Cinnamon Twist")
			foodPrice=49.00;
		else if(foodName=="Mexican Burito Rice")
			foodPrice=315.00;
		else if(foodName=="Churros")
			foodPrice=125.00;
		else if(foodName=="Honey Butter Waffle")
			foodPrice=99.00;
		else if(foodName=="Lemon Iced Tea")
			foodPrice=99.00;
		else if(foodName=="Belgian Milk Waffle")
			foodPrice=195.00;
		else if(foodName=="Pav Bhaji")
			foodPrice=199.00;
		else 
			System.out.println(foodName+" not found!!");
	
		return foodPrice;
	
	}

}