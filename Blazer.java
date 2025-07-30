class Blazer{

	int blazerId;
	String brandName;
	String size;
	String color;
	String materialType;
	int noOfButtons;
	String fitType;
	
	Blazer(){
		System.out.println();
		System.out.println("Blazer constructer without parameters loaded");
	}
	
	Blazer(	int blazerId,String brandName){
		System.out.println();
		System.out.println("Blazer constructer with(int,String) parameters loaded");
		this.blazerId=blazerId;
		this.brandName=brandName;
	}
	
	Blazer(String size,String color,String materialType){
		System.out.println();
		System.out.println("Blazer constructer with(String,String,String) parameters loaded");
		this.size=size;
		this.color=color;
		this.materialType=materialType;
	}
	
	Blazer(String brandName,int noOfButtons,String fitType){
		System.out.println();
		System.out.println("Blazer constructer with(String,int,String) parameters loaded");
		this.brandName=brandName;
		this.noOfButtons=noOfButtons;
		this.fitType=fitType;
	}
	
	Blazer(int blazerId,String brandName,String size,String color,String materialType,int noOfButtons,String fitType){
		System.out.println();
		System.out.println("Blazer constructer with parameters loaded");
		this.blazerId=blazerId;
		this.brandName=brandName;
		this.size=size;
		this.color=color;
		this.materialType=materialType;
		this.noOfButtons=noOfButtons;
		this.fitType=fitType;
	}
	
	public void getBlazerInfo(){
		System.out.println("Blazer one details : ");
		System.out.println("Id of blazer is : "+blazerId);
		System.out.println("brand name of blazer is : "+brandName);
		System.out.println("size of the blazer is : "+size);
		System.out.println("color of the blazer is : "+color);
		System.out.println("material type of the blazer is : "+materialType);
		System.out.println("no of buttons on blazer are : "+noOfButtons);
		System.out.println("fit type of the blazer is : "+fitType);
	}
	
}