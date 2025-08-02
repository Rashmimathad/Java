class  Egg{

	int eggId;
	double pricePerEgg;
	int quantity;
	String typeOfEgg;
	boolean isFertilized;
	String sourceFarm;

	Egg(int eggId,double pricePerEgg){
		this();
		System.out.println("Egg constructor with(int,double) parameters invoked");
		this.eggId=eggId;
		this.pricePerEgg=pricePerEgg;
	}
	
	Egg(int quantity,String typeOfEgg,double pricePerEgg){
		this("Duck",false,"Green Valley Poultry Farm");
		System.out.println("Egg constructor with(int,String,double) parameters invoked");
		this.quantity=quantity;
		this.typeOfEgg=typeOfEgg;
		this.pricePerEgg=pricePerEgg;
	}
	
	Egg(String typeOfEgg,boolean isFertilized,String sourceFarm){
		this(5,6.00,7,"Hen",true,"Golden Egg Farms");
		System.out.println("Egg constructor with(String,boolean,String) parameters invoked");
		this.typeOfEgg=typeOfEgg;
		this.isFertilized=isFertilized;
		this.sourceFarm=sourceFarm;
	}
	
	Egg(){
		this(5,"Hen",5.00);
		System.out.println("Egg default constructor invoked");
	}
	
	Egg(int eggId,double pricePerEgg,int quantity,String typeOfEgg,boolean isFertilized,String sourceFarm){
		this(7.00,12,"Quail");
		System.out.println("Egg constructor with all parameters invoked");
		this.eggId=eggId;
		this.pricePerEgg=pricePerEgg;
		this.quantity=quantity;
		this.typeOfEgg=typeOfEgg;
		this.isFertilized=isFertilized;
		this.sourceFarm=sourceFarm;
	}
	
	Egg(double pricePerEgg,int quantity,String typeOfEgg){
		this("Hen","Country Hen Farm");
		System.out.println("Egg constructor with(doubleint,String) parameters invoked");
		this.pricePerEgg=pricePerEgg;
		this.quantity=quantity;
		this.typeOfEgg=typeOfEgg;
	}
	
	Egg(String typeOfEgg,String sourceFarm){
		System.out.println("Egg constructor with(String,String) parameters invoked");
		this.typeOfEgg=typeOfEgg;
		this.sourceFarm=sourceFarm;
	}
	
	public void fetchEggDetails(){
		System.out.println("Egg details: ");
		System.out.println("id of egg is : "+eggId);
		System.out.println("price per egg is : "+pricePerEgg);
		System.out.println("quantity of egg : "+quantity);
		System.out.println("type of egg is : "+typeOfEgg+" egg");
		System.out.println("Is Egg Fertilized? "+isFertilized);
		System.out.println("source farm of egg is : "+sourceFarm);
	}

}