class Hotel{
	/*static String gobi="Gobi Manchuria";
	static String paneer="Chilli Paneer";
	static String chilliGobi="Chilli Gobi";
	static String mushroomDry="Mushroom Pepper Dry";
	static String babyCorn="Baby Corn Manchuria";
	static String  butterNaan="Butter Naan";
	static String rumaliRoti="Rumali Roti";
	static String kulcha="Kulcha";
	static String paneerButterMasala="Paneer Butter Masala";
	static String kadaiMushroom="Kadai Mushroom";
	static String vegKurma="Veg Kurma";
	static String gheeRice="Ghee Rice";
	static String jeeraRice="Jeera Rice";
	static String paneerFriedRice="Paneer Fried Rice";
	static String mushroomFriedRice="Mushroom Fried Rice";
	static String vegBiryani="Veg Biryani";
	static String southIndianThali="South Indian Thali";
	static String northIndianThali="North Indian Thali";
	static String masalaPapad="Masala Papad";
	static String manchowSoup="Veg Manchow soup";
	static String vegNoodles="Veg Noodles";
	static String whiteSaucePaasta="White Sauce Paasta";
	static String frenchFries="French Fries";
	static String cheeseBurger="Veg Cheese Burger";*/
	public static void main(String hotel[]){
			System.out.println("main started");
			String gobi="Gobi Manchuria";
			String paneer="Chilli Paneer";
			String chilliGobi="Chilli Gobi";
			String mushroomDry="Mushroom Pepper Dry";
			String babyCorn="Baby Corn Manchuria";
			String  butterNaan="Butter Naan";
			String rumaliRoti="Rumali Roti";
			String kulcha="Kulcha";
			String paneerButterMasala="Paneer Butter Masala";
			String kadaiMushroom="Kadai Mushroom";
			String vegKurma="Veg Kurma";
			String gheeRice="Ghee Rice";
			String jeeraRice="Jeera Rice";
			String paneerFriedRice="Paneer Fried Rice";
			String mushroomFriedRice="Mushroom Fried Rice";
			String vegBiryani="Veg Biryani";
			String southIndianThali="South Indian Thali";
			String northIndianThali="North Indian Thali";
			String masalaPapad="Masala Papad";
			String manchowSoup="Veg Manchow soup";
			String vegNoodles="Veg Noodles";
			String whiteSaucePaasta="White Sauce Paasta";
			String frenchFries="French Fries";
			String cheeseBurger="Veg Cheese Burger";
			
		String menu[]={gobi,chilliGobi,paneer,mushroomDry,babyCorn,butterNaan,rumaliRoti,kulcha,paneerButterMasala,kadaiMushroom,vegKurma,gheeRice,jeeraRice,paneerFriedRice,mushroomFriedRice,vegBiryani,southIndianThali,northIndianThali,masalaPapad,manchowSoup,vegNoodles,whiteSaucePaasta,frenchFries,cheeseBurger};
		System.out.println("The menu list of the hostel are : ");
		//System.out.println(menu[0]+","+menu[1]+","+menu[2]+","+menu[3]+","+menu[4]+","+menu[5]+","+menu[6]+","+menu[7]+","+menu[8]+","+menu[9]+","+menu[10]+","+menu[11]+","+menu[12]+","+menu[13]+","+menu[14]+","+menu[15]+","+menu[16]+","+menu[17]+","+menu[18]+","+menu[19]+","+menu[20]+","+menu[21]+","+menu[22]+","+menu[23]+","+menu[24]);
		for(String menuName : menu){
			System.out.println(menuName);
		}	
		System.out.println("main ended");
	}
}