class  EatSure{

	public static double getOrderPrice(String orderName){
	
		double orderPrice=0.00;
		
		if(orderName=="Paneer Tikka Rice Bowl")
			orderPrice=329.00;
		else if(orderName=="Rajma Chawal Dabba")
			orderPrice=129.0;
		else if(orderName=="Chicken Kheema and Roti Dabba")
			orderPrice=169.00;
		else if(orderName=="Chapathi")
			orderPrice=69.00;
		else if(orderName=="Laccha Paratha")
			orderPrice=169.00;
		else if(orderName=="Chicken Tikka Masala")
			orderPrice=299.00;
		else if(orderName=="Palak Paneer")
			orderPrice=299.00;
		else if(orderName=="Chatpata Chole")
			orderPrice=179.00;
		else if(orderName=="Dahi Kebab")
			orderPrice=149.00;
		else if(orderName=="Mutton Biryani")
			orderPrice=739.00; 
		else if(orderName=="Potato Wedges")
			orderPrice=129.00;
		else if(orderName=="Strawberry Jar")
			orderPrice=109.00;
		else if(orderName=="Butter Chicken Lasagna")
			orderPrice=189.00;
		else if(orderName=="Chicken Meatballs")
			orderPrice=139.00;
		else if(orderName=="Biscoff Cheesecake Slice")
			orderPrice=199.00;
		else if(orderName=="Egg Curry")
			orderPrice=305.00;
		else if(orderName=="Red Velvet Pastry")
			orderPrice=249.00;
		else if(orderName=="Veg Aloo Pattice")
			orderPrice=149.00;
		else if(orderName=="Rajgira Halwa")
			orderPrice=79.00;
		else if(orderName=="Paneer Lababdar")
			orderPrice=279.00;
		else if(orderName=="Pindi Chole")
			orderPrice=179.00;
		else if(orderName=="Dal Makhani")
			orderPrice=179.00;
		else if(orderName=="Rajma Masala")
			orderPrice=159.00;
		else if(orderName=="Chicken Kheema")
			orderPrice=219.00;
		else if(orderName=="Murgh Tikka Masala")
			orderPrice=299.00;
		else if(orderName=="Potato Chilli Shots")
			orderPrice=109.00;
		else if(orderName=="Seekh Kebab")
			orderPrice=215.00;
		else if(orderName=="Teekha Sausages")
			orderPrice=139.00;
		else if(orderName=="Beetroort and Peanut kebab")
			orderPrice=139.00;
		else if(orderName=="Kulfi")
			orderPrice=99.00;
		else
			System.out.println(orderName+" is not available...");
			
		return orderPrice;
	
	}
}