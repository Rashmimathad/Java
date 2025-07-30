class Coins{
	int coinId;
	String currencyName;
	String countryOfOrigin;
	String coinMaterial;
	int yearOfMinting;
	double coinWeight;
	
	Coins(){
		System.out.println();
		System.out.println("Coins constructor without parameters loaded");
	}
	
	Coins(int coinId,String currencyName){
		System.out.println();
		System.out.println("Coins constructor with(int,String) parameters loaded");
		this.coinId=coinId;
		this.currencyName=currencyName;
	}
	
	Coins(String countryOfOrigin,String coinMaterial,int yearOfMinting){
		System.out.println();
		System.out.println("Coins constructor with(String,String,int) parameters loaded");
		this.countryOfOrigin=countryOfOrigin;
		this.coinMaterial=coinMaterial;
		this.yearOfMinting=yearOfMinting;
	}
	
	Coins(String currencyName,double coinWeight){
		System.out.println();
		System.out.println("Coins constructor with(String,double) parameters loaded");
		this.currencyName=currencyName;
		this.coinWeight=coinWeight;
	}
	
	Coins(int coinId,String currencyName,String countryOfOrigin,String coinMaterial,int yearOfMinting,double coinWeight){
		System.out.println();
		System.out.println("Coins constructor with parameters loaded");
		this.coinId=coinId;
		this.currencyName=currencyName;
		this.countryOfOrigin=countryOfOrigin;
		this.coinMaterial=coinMaterial;
		this.yearOfMinting=yearOfMinting;
		this.coinWeight=coinWeight;
	}
	
	public void getCoinsInfo(){
		System.out.println("Coin Details : ");
		System.out.println("id of coin is : "+coinId);
		System.out.println("name of the currency coin is : "+currencyName);
		System.out.println("country origin of coin is : "+countryOfOrigin);
		System.out.println("material of the coin is : "+coinMaterial);
		System.out.println("year of minting of coin is  : "+yearOfMinting);
		System.out.println("weight of the coin is : "+coinWeight+" g");
	}
}