class Zepto{

	public static double getItemPrice(String itemName){
	
		double itemPrice=0.00;
		
		if(itemName=="Bingo Chips")
			itemPrice=20.00;
		else if(itemName=="Haldiram's Moong Dal")
			itemPrice=60.00;
		else if(itemName=="Aloo Bhujiya")
			itemPrice=55.00;
		else if(itemName=="Coriander Leaves")
			itemPrice=6.00;
		else if(itemName=="Fresh Onion")
			itemPrice=27.00;
		else if(itemName=="Mushroom Button")
			itemPrice=73.00;
		else if(itemName=="Avocado")
			itemPrice=55.00;
		else if(itemName=="Watermelon")
			itemPrice=87.00;
		else if(itemName=="Lettuce")
			itemPrice=16.00;
		else if(itemName=="Tender Coconut")
			itemPrice=59.00;
		else if(itemName=="Rosemary")
			itemPrice=17.00;
		else if(itemName=="Cold Pressed Sesame Oil")
			itemPrice=465.00;
		else if(itemName=="Aashirvaad Atta")
			itemPrice=515.00;
		else if(itemName=="Besan")
			itemPrice=58.00;
		else if(itemName=="Suji Rava")
			itemPrice=84.00;
		else if(itemName=="Idli Rava")
			itemPrice=65.00;
		else if(itemName=="Oats Flour")
			itemPrice=239.00;
		else if(itemName=="Toor dal")
			itemPrice=73.00;
		else if(itemName=="Urad Dal")
			itemPrice=397.00;
		else if(itemName=="Sona Masuri Rice")
			itemPrice=389.00;
		else if(itemName=="Basmati Rice")
			itemPrice=1076.00;
		else if(itemName=="Dairy Milk Silk")
			itemPrice=199.00;
		else if(itemName=="Milky Bar")
			itemPrice=32.00;
		else if(itemName=="Kitkat")
			itemPrice=149.00;
		else if(itemName=="Tomato")
			itemPrice=13.00;
		else if(itemName=="Carrot")
			itemPrice=23.00;
		else if(itemName=="Cauliflower")
			itemPrice=33.00;
		else if(itemName=="Beetroot")
			itemPrice=24.00;
		else if(itemName=="Sweet Corn")
			itemPrice=45.00;
		else if(itemName=="Green Peas")
			itemPrice=77.00;
		else	
			System.out.println(itemName+" is not found!!");
		
		return itemPrice;
	
	}
}