class Water{
	int waterId;
	String sourceOfWater;
	String stateOfWater;
	String waterColor;
	double pH;
	String hardness;
	
	Water(){
		this(1,"River");
		System.out.println("Water default constructor invoked");
	}
	
	
	Water(int waterId,String sourceOfWater){
		this("Tap","Liquid","Clear");
		System.out.println("Water constructor with(int,String) parameters invoked");
		this.waterId=waterId;
		this.sourceOfWater=sourceOfWater;
	}
	
	Water(String sourceOfWater,String stateOfWater,String waterColor){
		this("Liquid","Mostly Hard");
		System.out.println("Water constructor with(String,String,String) parameters invoked");
		this.sourceOfWater=sourceOfWater;
		this.stateOfWater=stateOfWater;
		this.waterColor=waterColor;
	}
	
	Water(String stateOfWater,String hardness){
		this(5,"Rain","Liquid","Clear",5.6,"Soft");
		System.out.println("Water constructor with(String,String) parameters invoked");
		this.stateOfWater=stateOfWater;
		this.hardness=hardness;
	}
	
	Water(int waterId,String sourceOfWater,String stateOfWater,String waterColor,double pH,String hardness){
		this("Sea",8.0,"Very hard");
		System.out.println("Water constructor with all parameters invoked");
		this.waterId=waterId;
		this.sourceOfWater=sourceOfWater;
		this.stateOfWater=stateOfWater;
		this.waterColor=waterColor;
		this.pH=pH;
		this.hardness=hardness;
	}
	
	Water(String sourceOfWater,double pH,String hardness){
		this(3,"River","Moderately hard");
		System.out.println("Water constructor with(String,double,String) parameters invoked");
		this.sourceOfWater=sourceOfWater;
		this.pH=pH;
		this.hardness=hardness;
	}
	
	Water(int waterId,String sourceOfWater,String waterColor){
		System.out.println("Water constructor with(int,String,String) parameters invoked");
		this.waterId=waterId;
		this.sourceOfWater=sourceOfWater;
		this.waterColor=waterColor;
	}
	
	public void getWaterDetails(){
		System.out.println("Water details : ");
		System.out.println("Id of water is : "+waterId);
		System.out.println("source of water is : "+sourceOfWater);
		System.out.println("state of water is : "+stateOfWater);
		System.out.println("color of water is : "+waterColor);
		System.out.println("pH of water is : "+pH);
		System.out.println("hardness of water is : "+hardness);
		
	}
}