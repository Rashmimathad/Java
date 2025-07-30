class CoinsRunner{

	public static void main(String coin[]){
	System.out.println("main started");
	System.out.println();
	
		Coins firstCoin = new Coins(1,"Rupee");
		System.out.println("The id of the coin is : "+firstCoin.coinId);
		System.out.println("The id of the coin is : "+firstCoin.currencyName);
		System.out.println();
		
		Coins secondCoin = new Coins("US","Aluminum",2000);
		System.out.println("country origin of coin is : "+secondCoin.countryOfOrigin);
		System.out.println("material of the coin is : "+secondCoin.coinMaterial);
		System.out.println("year of minting of coin is  : "+secondCoin.yearOfMinting);
		System.out.println();
		
		Coins thirdCoin = new Coins("Yen",3.50);
		System.out.println("The id of the coin is : "+thirdCoin.currencyName);
		System.out.println("weight of the coin is : "+thirdCoin.coinWeight+" g");
		System.out.println();
		
		Coins fourthCoin = new Coins(4,"Loonie","Canada","Copper",2016,3.50);
		fourthCoin.getCoinsInfo();
		System.out.println();
		
		Coins fifthCoin = new Coins();
		fifthCoin.getCoinsInfo();
		System.out.println();
		System.out.println("main ended");
	}

}