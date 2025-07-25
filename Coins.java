class Coins{
	int coindId;
	String currencyName;
	String countryOfOrigin;
	String coinMaterial;
	int yearOfMinting;
	double coinWeight;
	
	public void getCoinsInfo(){
		System.out.println();
		System.out.println(" Coin Details : ");
		System.out.println("id of coin is : "+coindId);
		System.out.println("name of the currency coin is : "+currencyName);
		System.out.println("country origin of coin is : "+countryOfOrigin);
		System.out.println("material of the coin is : "+coinMaterial);
		System.out.println("year of minting of coin is  : "+yearOfMinting);
		System.out.println("weight of the coin is : "+coinWeight+" g");
	}
}