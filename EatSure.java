class  EatSure{

	public static double getOrderPrice(String orderName){
	
		double orderPrice=0.00;
		
		if(orderName=="Paneer Tikka Rice Bowl"){
			orderPrice=329.00;
			return orderPrice;
		}
		else if(orderName=="Rajma Chawal Dabba"){
			orderPrice=129.0;
			return orderPrice;
		}
		else if(orderName=="Chicken Kheema and Roti Dabba"){
			orderPrice=169.00;
			return orderPrice;
		}
		else if(orderName=="Chapathi"){
			orderPrice=69.00;
			return orderPrice;
		}
		else if(orderName=="Laccha Paratha"){
			orderPrice=169.00;
			return orderPrice;
		}
		else if(orderName=="Chicken Tikka Masala"){
			orderPrice=299.00;
			return orderPrice;
		}
		else if(orderName=="Palak Paneer"){
			orderPrice=299.00;
			return orderPrice;
		}
		else if(orderName=="Chatpata Chole"){
			orderPrice=179.00;
			return orderPrice;
		}
		else if(orderName=="Dahi Kebab"){
			orderPrice=149.00;
			return orderPrice;
		}
		else if(orderName=="Mutton Biryani"){
			orderPrice=739.00; 
			return orderPrice;
		}
		else if(orderName=="Potato Wedges"){
			orderPrice=129.00;
			return orderPrice;
		}
		else if(orderName=="Strawberry Jar"){
			orderPrice=109.00;
			return orderPrice;
		}
		else if(orderName=="Butter Chicken Lasagna"){
			orderPrice=189.00;
			return orderPrice;
		}
		else if(orderName=="Chicken Meatballs"){
			orderPrice=139.00;
			return orderPrice;
		}
		else if(orderName=="Biscoff Cheesecake Slice"){
			orderPrice=199.00;
			return orderPrice;
		}
		else if(orderName=="Egg Curry"){
			orderPrice=305.00;
			return orderPrice;
		}
		else if(orderName=="Red Velvet Pastry"){
			orderPrice=249.00;
			return orderPrice;
		}
		else if(orderName=="Veg Aloo Pattice"){
			orderPrice=149.00;
			return orderPrice;
		}
		else if(orderName=="Rajgira Halwa"){
			orderPrice=79.00;
			return orderPrice;
		}
		else if(orderName=="Paneer Lababdar"){
			orderPrice=279.00;
			return orderPrice;
		}
		else if(orderName=="Pindi Chole"){
			orderPrice=179.00;
			return orderPrice;
		}
		else if(orderName=="Dal Makhani"){
			orderPrice=179.00;
			return orderPrice;
		}
		else if(orderName=="Rajma Masala"){
			orderPrice=159.00;
			return orderPrice;
		}
		else if(orderName=="Chicken Kheema"){
			orderPrice=219.00;
			return orderPrice;
		}
		else if(orderName=="Murgh Tikka Masala"){
			orderPrice=299.00;
			return orderPrice;
		}
		else if(orderName=="Potato Chilli Shots"){
			orderPrice=109.00;
			return orderPrice;
		}
		else if(orderName=="Seekh Kebab"){
			orderPrice=215.00;
			return orderPrice;
		}
		else if(orderName=="Teekha Sausages"){
			orderPrice=139.00;
			return orderPrice;
		}
		else if(orderName=="Beetroort and Peanut kebab"){
			orderPrice=139.00;
			return orderPrice;
		}
		else if(orderName=="Kulfi"){
			orderPrice=99.00;
			return orderPrice;
		}
		else
			System.out.println(orderName+" is not available...");
			
		return orderPrice;
	
	}
	
	public static double getOrderPrice(String orderName,int orderQuantity){
			
		double orderPrice=0.00;
		
		if(orderName=="Paneer Tikka Rice Bowl"){
			orderPrice=329.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Rajma Chawal Dabba"){
			orderPrice=129.0*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Chicken Kheema and Roti Dabba"){
			orderPrice=169.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Chapathi"){
			orderPrice=69.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Laccha Paratha"){
			orderPrice=169.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Chicken Tikka Masala"){
			orderPrice=299.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Palak Paneer"){
			orderPrice=299.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Chatpata Chole"){
			orderPrice=179.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Dahi Kebab"){
			orderPrice=149.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Mutton Biryani"){
			orderPrice=739.00*orderQuantity; 
			return orderPrice;
		}
		else if(orderName=="Potato Wedges"){
			orderPrice=129.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Strawberry Jar"){
			orderPrice=109.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Butter Chicken Lasagna"){
			orderPrice=189.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Chicken Meatballs"){
			orderPrice=139.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Biscoff Cheesecake Slice"){
			orderPrice=199.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Egg Curry"){
			orderPrice=305.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Red Velvet Pastry"){
			orderPrice=249.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Veg Aloo Pattice"){
			orderPrice=149.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Rajgira Halwa"){
			orderPrice=79.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Paneer Lababdar"){
			orderPrice=279.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Pindi Chole"){
			orderPrice=179.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Dal Makhani"){
			orderPrice=179.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Rajma Masala"){
			orderPrice=159.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Chicken Kheema"){
			orderPrice=219.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Murgh Tikka Masala"){
			orderPrice=299.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Potato Chilli Shots"){
			orderPrice=109.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Seekh Kebab"){
			orderPrice=215.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Teekha Sausages"){
			orderPrice=139.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Beetroort and Peanut kebab"){
			orderPrice=139.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Kulfi"){
			orderPrice=99.00*orderQuantity;
			return orderPrice;
		}
		else
			System.out.println(orderName+" is not available...");
			
		return orderPrice;
		
	}
}