class WaterBall{
	int waterBallId;
	String shape;
	String color;
	String size;
	boolean isTransparent;
	boolean isGlowInDark;
	
	WaterBall(){
		this(1,"Oval");
		System.out.println("WaterBall default constructor invoked");
	}
	
	WaterBall(int waterBallId,String shape){
		this("Blue", "Medium",true);
		System.out.println("WaterBall constructor with(int,String) parameters invoked");
		this.waterBallId=waterBallId;
		this.shape=shape;
	}
	
	WaterBall(String color,String size,boolean isTransparent){
		this("Round",false);
		System.out.println("WaterBall constructor with(String,String,boolean) parameters invoked");
		this.color=color;
		this.size=size;
		this.isTransparent=isTransparent;
	}
	
	WaterBall(String shape,boolean isTransparent){
		this(3,"Spherical","Pink","Large",true,true);
		System.out.println("WaterBall constructor with(String,boolean) parameters invoked");
		this.shape=shape;
		this.isTransparent=isTransparent;
	}
	
	WaterBall(int waterBallId,String shape,String color,String size,boolean isTransparent,boolean isGlowInDark){
		this("Oval","Balck");
		System.out.println("WaterBall constructor with all parameters invoked");
		this.waterBallId=waterBallId;
		this.shape=shape;
		this.color=color;
		this.size=size;
		this.isTransparent=isTransparent;
		this.isGlowInDark=isGlowInDark;
	}
	
	WaterBall(String shape,String color){
		this("Small",false,false);
		System.out.println("WaterBall constructor with(String,String) parameters invoked");
		this.shape=shape;
		this.color=color;
	}
	
	WaterBall(String size,boolean isTransparent,boolean isGlowInDark){
		System.out.println("WaterBall constructor with(String,boolean,boolean) parameters invoked");
		this.size=size;
		this.isTransparent=isTransparent;
		this.isGlowInDark=isGlowInDark;
	}
	
	public void getWaterBallDetails(){
		System.out.println("waterBall Details: ");
		System.out.println("Id of water ball is : "+waterBallId);
		System.out.println("shape of waterBall is : "+shape);
		System.out.println("color of water ball is : "+color);
		System.out.println("size of water ball is : "+size);
		System.out.println("Is waterBall Transparent? "+isTransparent);
		System.out.println("Is glow in dark? "+isGlowInDark);
	}
}