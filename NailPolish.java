class NailPolish{
	int nailPolishId;
	String nailPolishColor;
	String brandName;
	String shadeName;
	String finishType;
	double price;
	String packagingType;
	 
	 NailPolish(){
		 this(1,"Peach","Lakme");
		System.out.println("NailPolish default constructor invoked");
		 
	 }
	 
	 NailPolish(int nailPolishId,String nailPolishColor,String brandName){
		 this("Rose Petal","Matte",200.00);
		System.out.println("NailPolish constructor with(int,String,String) invoked");
		this.nailPolishId=nailPolishId;
		this.nailPolishColor=nailPolishColor;
		this.brandName=brandName;
	 }
	 
	 NailPolish(String shadeName,String finishType,double price){
		 this("Maybelline","Mint Pop","Glass bottle");
		System.out.println("NailPolish constructor with(String,String,double) invoked");
		this.shadeName=shadeName;
		this.finishType=finishType;
		this.price=price;
	 }
	 
	 NailPolish(String brandName,String shadeName,String packagingType){
		 this(5,"Blue","Nykaa","Lavender","Glossy",150.00,"Plastic bottle");
		System.out.println("NailPolish constructor with(String,String,String) invoked");
		this.brandName=brandName;
		this.shadeName=shadeName;
		this.packagingType=packagingType;
	 }
	 
	 NailPolish(int nailPolishId,String nailPolishColor,String brandName,String shadeName,String finishType,double price,String packagingType){
		this(3,"Glass bottle");
		System.out.println("NailPolish constructor with(int,String,String) invoked");
		this.nailPolishId=nailPolishId;
		this.nailPolishColor=nailPolishColor;
		this.brandName=brandName;
		this.shadeName=shadeName;
		this.finishType=finishType;
		this.price=price;
		this.packagingType=packagingType;
	 }
	 
	 NailPolish(int nailPolishId,String brandName){
		 this("Midnight Blue","Matte");
		System.out.println("NailPolish constructor with(int,String) invoked");
		this.nailPolishId=nailPolishId;
		this.brandName=brandName;
	 }
	 
	 NailPolish(String shadeName,String finishType){
		System.out.println("NailPolish constructor with(String,String) invoked");
		 this.shadeName=shadeName;
		 this.finishType=finishType;
	 }
	 
	 public void getNailPolishInfo(){
		 System.out.println("NailPolish details: ");
		 System.out.println("Id of nail polish is : "+nailPolishId);
		 System.out.println("brand name of nail polish is : "+brandName);
		 System.out.println("color of nail polish is : "+nailPolishColor);
		 System.out.println("shade of nail polish is : "+shadeName);
		 System.out.println("finish type of nail polish is : "+finishType);
		 System.out.println("price of nail polish is : "+price);
		 System.out.println("packaging type of nail polish is : "+packagingType);
	 }
}