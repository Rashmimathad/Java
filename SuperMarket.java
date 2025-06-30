class SuperMarket{
	public static void main(String supermarket[]){
		String iceCreams[]={"Choclate Chocochip","Pista","Strawberry","Kesar badam","Butterscotch","Black Current","Vanilla","Missisippe Mud","Rasberry","Casata"};
		String perfumes[]={"Bella Vita","Fogg","Park Avenue","Denver","MCaffine","Beardo","Wild Stone","Yardley","Engage","Carlton london"};
		String groceries[]={"Toor dal","Sugar","Salt","Jaggery","Rice","Idli Rava","Sambar Powder","Sunflower oil","Ghee","Puffed Rice"};
		String cosmetics[]={"Body Lotion","Sunscreen","lip balm","lipstick","Powder","Eyeliner","Kajal","Sheet mask","moisturizer","face scrub"};
		System.out.println();
		System.out.println("The ice creams in the super market are : ");
		//System.out.println(iceCreams[0]+","+iceCreams[1]+","+iceCreams[2]+","+iceCreams[3]+","+iceCreams[4]+","+iceCreams[5]+","+iceCreams[6]+","+iceCreams[7]+","+iceCreams[8]+","+iceCreams[9]);
		for(String iceCream : iceCreams){
			System.out.println(iceCream);
		}
		System.out.println();
		System.out.println("The perfumes in the super market are : ");
		//System.out.println(perfumes[0]+","+perfumes[1]+","+perfumes[2]+","+perfumes[3]+","+perfumes[4]+","+perfumes[5]+","+perfumes[6]+","+perfumes[7]+","+perfumes[8]+","+perfumes[9]);
		for(String perfume : perfumes){
			System.out.println(perfume);
		}
		System.out.println();
		System.out.println("The groceries in the super market are : ");
		//System.out.println(groceries[0]+","+groceries[1]+","+groceries[2]+","+groceries[3]+","+groceries[4]+","+groceries[5]+","+groceries[6]+","+groceries[7]+","+groceries[8]+","+groceries[9]);
		for(String grocery : groceries){
			System.out.println(grocery);
		}
		System.out.println();
		System.out.println("The cosmetics in the super market are : ");
		//System.out.println(cosmetics[0]+","+cosmetics[1]+","+cosmetics[2]+","+cosmetics[3]+","+cosmetics[4]+","+cosmetics[5]+","+cosmetics[6]+","+cosmetics[7]+","+cosmetics[8]+","+cosmetics[9]);
		for(String cosmetic : cosmetics){
			System.out.println(cosmetic);
		}
	}
}