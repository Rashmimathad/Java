class MagicPin{

	public static double getOrderPrice(String orderName){
	
		double orderPrice=0.00;
		
		if(orderName=="Veg Thali"){
			orderPrice=107.00;
			return orderPrice;
		}
		else if(orderName=="Veg Extravaganza Pizza"){
			orderPrice=349.00;
			return orderPrice;
		}
		else if(orderName=="Garlic Bread"){
			orderPrice=149.00;
			return orderPrice;
		}
		else if(orderName=="Chicken Donne Biryani"){
			orderPrice=153.00;
			return orderPrice;
		}
		else if(orderName=="Lemonade Juice"){
			orderPrice=38.00;
			return orderPrice;
		}
		else if(orderName=="Mini Samosa"){
			orderPrice=95.00;
			return orderPrice;
		}
		else if(orderName=="Almond Fudge Brownie"){
			orderPrice=391.00;
			return orderPrice;
		}
		else if(orderName=="Rainbow Ice Cream Sundae"){
			orderPrice=119.00;
			return orderPrice;
		}
		else if(orderName=="Death By Chocolate"){
			orderPrice=154.00;
			return orderPrice;
		}
		else if(orderName=="Oreo Brownie Ice Cream Shake"){
			orderPrice=279.00;
			return orderPrice;
		}
		else if(orderName=="Blue Curacao Mojito"){
			orderPrice=129.00;
			return orderPrice;
		}
		else if(orderName=="Aloo Dum Biryani"){
			orderPrice=275.00;
			return orderPrice;
		}
		else if(orderName=="Veg Spring Rolls"){
			orderPrice=99.00;
			return orderPrice;
		}
		else if(orderName=="Veg Steamed Momos"){
			orderPrice=159.00;
			return orderPrice;
		}
		else if(orderName=="Mushroom Penne Pasta"){
			orderPrice=254.00;
			return orderPrice;
		}
		else if(orderName=="Onion Rings"){
			orderPrice=169.00;
			return orderPrice;
		}
		else if(orderName=="Chicken Pepper Dry"){
			orderPrice=153.00;
			return orderPrice;
		}
		else if(orderName=="Veg Noodles"){
			orderPrice=136.00;
			return orderPrice;
		}
		else if(orderName=="Choco Lava Cake"){
			orderPrice=92.00;
			return orderPrice;
		}
		else if(orderName=="Butterscotch Mousse"){
			orderPrice=104.00;
			return orderPrice;
		}
		else if(orderName=="Veg Loaded Nachos"){
			orderPrice=179.00;
			return orderPrice;
		}
		else if(orderName=="Aloo Paratha"){
			orderPrice=105.00;
			return orderPrice;
		}
		else if(orderName=="Methi Paratha"){
			orderPrice=78.00;
			return orderPrice;
		}
		else if(orderName=="Poha"){
			orderPrice=106.00;
			return orderPrice;
		}
		else if(orderName=="Soya Chaap Shawarma"){
			orderPrice=132.00;
			return orderPrice;
		}
		else if(orderName=="Garlic Soya Chaap"){
			orderPrice=329.00;
			return orderPrice;
		}
		else if(orderName=="Ice Latte"){
			orderPrice=99.00;
			return orderPrice;
		}
		else if(orderName=="Papdi Chaat"){
			orderPrice=220.00;
			return orderPrice;
		}
		else if(orderName=="Veg Manchow Soup"){
			orderPrice=117.00;
			return orderPrice;
		}
		else if(orderName=="Sev Puri"){
			orderPrice=58.00;
			return orderPrice;
		}
		else
			System.out.println(orderName+" is not available");
	
		return orderPrice;
	}
	
		public static double getOrderPrice(String orderName,int orderQuantity){
	
		double orderPrice=0.00;
		
		if(orderName=="Veg Thali"){
			orderPrice=107.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Veg Extravaganza Pizza"){
			orderPrice=349.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Garlic Bread"){
			orderPrice=149.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Chicken Donne Biryani"){
			orderPrice=153.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Lemonade Juice"){
			orderPrice=38.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Mini Samosa"){
			orderPrice=95.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Almond Fudge Brownie"){
			orderPrice=391.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Rainbow Ice Cream Sundae"){
			orderPrice=119.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Death By Chocolate"){
			orderPrice=154.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Oreo Brownie Ice Cream Shake"){
			orderPrice=279.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Blue Curacao Mojito"){
			orderPrice=129.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Aloo Dum Biryani"){
			orderPrice=275.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Veg Spring Rolls"){
			orderPrice=99.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Veg Steamed Momos"){
			orderPrice=159.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Mushroom Penne Pasta"){
			orderPrice=254.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Onion Rings"){
			orderPrice=169.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Chicken Pepper Dry"){
			orderPrice=153.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Veg Noodles"){
			orderPrice=136.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Choco Lava Cake"){
			orderPrice=92.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Butterscotch Mousse"){
			orderPrice=104.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Veg Loaded Nachos"){
			orderPrice=179.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Aloo Paratha"){
			orderPrice=105.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Methi Paratha"){
			orderPrice=78.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Poha"){
			orderPrice=106.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Soya Chaap Shawarma"){
			orderPrice=132.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Garlic Soya Chaap"){
			orderPrice=329.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Ice Latte"){
			orderPrice=99.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Papdi Chaat"){
			orderPrice=220.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Veg Manchow Soup"){
			orderPrice=117.00*orderQuantity;
			return orderPrice;
		}
		else if(orderName=="Sev Puri"){
			orderPrice=58.00*orderQuantity;
			return orderPrice;
		}
		else
			System.out.println(orderName+" is not available");
	
		return orderPrice;
	}
	
}