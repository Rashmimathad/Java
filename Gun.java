class Gun{
	int gunId;
	String gunName;
	String gunType;
	int gunRange;
	double gunPrice;
	double caliber;
	
	Gun(){
		this(1,"AK-47");
		System.out.println("Gun default constructor invoked");
		
	}
	
	Gun(int gunId,String gunName){
		this("Assault Rifle",400,15000.00);
		System.out.println("Gun constructor with(int,String) parameters invoked");
		this.gunId=gunId;
		this.gunName=gunName;
	}
	
	Gun(String gunType,int gunRange,double gunPrice){
		this("M4A1","Assault Rifle",500);
		System.out.println("Gun constructor with(String,int,double) parameters invoked");
		this.gunType=gunType;
		this.gunRange=gunRange;
		this.gunPrice=gunPrice;
	}
	
	Gun(String gunName,String gunType,int gunRange){
		this(650,25000.00,9.0);
		System.out.println("Gun constructor with(String,String,int) parameters invoked");
		this.gunName=gunName;
		this.gunType=gunType;
		this.gunRange=gunRange;
	}
	
	Gun(int gunRange,double gunPrice,double caliber){
		this(5,"Remington 700","Sniper Rifle",800,25000.00,5.56);
		System.out.println("Gun constructor with(int,double,double) parameters invoked");
		this.gunRange=gunRange;
		this.gunPrice=gunPrice;
		this.caliber=caliber;
	}
	
	Gun(int gunId,String gunName,String gunType,int gunRange,double gunPrice,double caliber){
		this(500,7.92);
		System.out.println("Gun constructor with all parameters invoked");
		this.gunId=gunId;
		this.gunName=gunName;
		this.gunType=gunType;
		this.gunRange=gunRange;
		this.gunPrice=gunPrice;
		this.caliber=caliber;
	}
	
	Gun(int gunRange,double caliber){
		System.out.println("Gun constructor with(int,double) parameters invoked");
		this.gunRange=gunRange;
		this.caliber=caliber;
	}
	
	public void fetchGunInfo(){
		System.out.println("Gun Details : ");
		System.out.println("id of gun is : "+gunId);
		System.out.println("name of gun is : "+gunName);
		System.out.println("type of gun is : "+gunType);
		System.out.println("range of gun is : "+gunRange+" Meters");
		System.out.println("price of gun is : "+gunPrice);
		System.out.println("caliber of the gun is : "+caliber+" mm");
	}
}