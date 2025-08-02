class Pichkari{
	int pichkariId;
	String materialType;
	char size;
	int waterCapacity;
	boolean isFilled;
	String typeOfPichkari;
	
	Pichkari(){
		this(150,true,"Pump");
		System.out.println("Pichkari   default constructor  invoked");
	}
	
	Pichkari(int pichkariId,String materialType){
		this('M',150);
		System.out.println("Pichkari  constructor with(int,String) parameters invoked");
		this.pichkariId=pichkariId;
		this.materialType=materialType;
	}
	
	Pichkari(char size,int waterCapacity){
		this();
		System.out.println("Pichkari constructor with(char,int) parameters invoked");
		this.size=size;
		this.waterCapacity=waterCapacity;
		
	}
	
	Pichkari(int waterCapacity,boolean isFilled,String typeOfPichkari){
		this("Plastic",'L',500);
		System.out.println("Pichkari constructor with(int,boolean) parameters invoked");
		this.waterCapacity=waterCapacity;
		this.isFilled=isFilled;
		this.typeOfPichkari=typeOfPichkari;
	}
	
	Pichkari(String materialType,char size,int waterCapacity){
		this("Trigger",false);
		System.out.println("Pichkari constructor with(String,char,int) parameters invoked");
		this.materialType=materialType;
		this.size=size;
		this.waterCapacity=waterCapacity;
	}
	
	Pichkari(String typeOfPichkari,boolean isFilled){
		this(5,"Plastic",'S',100,true,"Pump");
		System.out.println("Pichkari constructor with(String,boolean) parameters invoked");
		this.typeOfPichkari=typeOfPichkari;
		this.isFilled=isFilled;
	}
	
	Pichkari(int pichkariId,String materialType,char size,int waterCapacity,boolean isFilled,String typeOfPichkari){
		System.out.println("Pichkari constructor with all parameters invoked");
		this.pichkariId=pichkariId;
		this.materialType=materialType;
		this.size=size;
		this.waterCapacity=waterCapacity;
		this.isFilled=isFilled;
		this.typeOfPichkari=typeOfPichkari;
		
	}
	
	public void getPichkariDetails(){
		System.out.println("Pichkari Details are");
		System.out.println("Pichkari Id is : "+pichkariId);
		System.out.println("Pichkari material type is : "+materialType);
		System.out.println("Pichkari size is : "+size);
		System.out.println("Pichkari water capacity is : "+waterCapacity+" ml");
		System.out.println("Is Pichkari filled? "+isFilled);
		System.out.println("the type of pichkari is :"+typeOfPichkari);
	}
	
}