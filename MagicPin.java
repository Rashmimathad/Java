class MagicPin{

	public static double getOrderPrice(String orderName){
	
		double orderPrice=0.00;
		
		if(orderName=="Veg Thali")
			orderPrice=107.00;
		else if(orderName=="Veg Extravaganza Pizza")
			orderPrice=349.00;
		else if(orderName=="Garlic Bread")
			orderPrice=149.00;
		else if(orderName=="Chicken Donne Biryani")
			orderPrice=153.00;
		else if(orderName=="Lemonade Juice")
			orderPrice=38.00;
		else if(orderName=="Mini Samosa")
			orderPrice=95.00;
		else if(orderName=="Almond Fudge Brownie")
			orderPrice=391.00;
		else if(orderName=="Rainbow Ice Cream Sundae")
			orderPrice=119.00;
		else if(orderName=="Death By Chocolate")
			orderPrice=154.00;
		else if(orderName=="Oreo Brownie Ice Cream Shake")
			orderPrice=279.00;
		else if(orderName=="Blue Curacao Mojito")
			orderPrice=129.00;
		else if(orderName=="Aloo Dum Biryani")
			orderPrice=275.00;
		else if(orderName=="Veg Spring Rolls")
			orderPrice=99.00;
		else if(orderName=="Veg Steamed Momos")
			orderPrice=159.00;
		else if(orderName=="Mushroom Penne Pasta")
			orderPrice=254.00;
		else if(orderName=="Onion Rings")
			orderPrice=169.00;
		else if(orderName=="Chicken Pepper Dry")
			orderPrice=153.00;
		else if(orderName=="Veg Noodles")
			orderPrice=136.00;
		else if(orderName=="Choco Lava Cake")
			orderPrice=92.00;
		else if(orderName=="Butterscotch Mousse")
			orderPrice=104.00;
		else if(orderName=="Veg Loaded Nachos")
			orderPrice=179.00;
		else if(orderName=="Aloo Paratha")
			orderPrice=105.00;
		else if(orderName=="Methi Paratha")
			orderPrice=78.00;
		else if(orderName=="Poha")
			orderPrice=106.00;
		else if(orderName=="Soya Chaap Shawarma")
			orderPrice=132.00;
		else if(orderName=="Garlic Soya Chaap")
			orderPrice=329.00;
		else if(orderName=="Ice Latte")
			orderPrice=99.00;
		else if(orderName=="Papdi Chaat")
			orderPrice=220.00;
		else if(orderName=="Veg Manchow Soup")
			orderPrice=117.00;
		else if(orderName=="Sev Puri")
			orderPrice=58.00;
		else
			System.out.println(orderName+" is not available");
	
		return orderPrice;
	
	}
	
}