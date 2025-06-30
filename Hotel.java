class Hotel{
	public static void main(String hotel[]){
		String menu[]={"Gobi Manchuria","Chilli Paneer","Chilli gobi","Mushroom Pepper Dry","Baby Corn Manchuria","Butter Naan","Rumali Roti","Kulcha","Paneer butter masala","Kadai Mushroom","Veg Kurma","Ghee Rice","Jeera Rice","Paneer fried rice","Mushroom fried rice","Veg Biryani","Paneer Biryani","South Indian Thali","North Indian Thali","Masala Papad","Veg Manchow shop","Veg Noodles","White Sauce Paasta","French Fries","Veg Cheese Burger"};
		System.out.println();
		System.out.println("The menu list of the hostel are : ");
		System.out.println();
		//System.out.println(menu[0]+","+menu[1]+","+menu[2]+","+menu[3]+","+menu[4]+","+menu[5]+","+menu[6]+","+menu[7]+","+menu[8]+","+menu[9]+","+menu[10]+","+menu[11]+","+menu[12]+","+menu[13]+","+menu[14]+","+menu[15]+","+menu[16]+","+menu[17]+","+menu[18]+","+menu[19]+","+menu[20]+","+menu[21]+","+menu[22]+","+menu[23]+","+menu[24]);
		for(String menuName : menu){
			System.out.println(menuName);
		}
	}
}