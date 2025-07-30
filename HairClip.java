class HairClip{
	
	int hairClipId;
	String hairClipColor;
	String hairClipMaterial;
	String hairClipType;
	double hairClipPrice;
	String hairClipSize;
	
	HairClip(){
		System.out.println();
		System.out.println("Hairclip constructor without parameters loaded");
	}
	
	HairClip(int hairClipId,String hairClipType,double hairClipPrice){
		System.out.println();
		System.out.println("Hairclip constructor with(int,String,double) parameters loaded");
		this.hairClipId=hairClipId;
		this.hairClipType=hairClipType;
		this.hairClipPrice=hairClipPrice;
	}
	
	HairClip(int hairClipId,String hairClipColor,String hairClipMaterial){
		System.out.println();
		System.out.println("Hairclip constructor with(int,String,Sting) parameters loaded");
		this.hairClipId=hairClipId;
		this.hairClipColor=hairClipColor;
		this.hairClipMaterial=hairClipMaterial;
	}
	
	HairClip(double hairClipPrice,String hairClipSize){
		System.out.println();
		System.out.println("Hairclip constructor with(double,String) parameters loaded");
		this.hairClipPrice=hairClipPrice;
		this.hairClipSize=hairClipSize;
	}
	
	HairClip(int hairClipId,String hairClipColor,String hairClipMaterial,String hairClipType,double hairClipPrice,String hairClipSize){
		System.out.println();
		System.out.println("Hairclip constructor with parameters loaded");
		this.hairClipId=hairClipId;
		this.hairClipColor=hairClipColor;
		this.hairClipMaterial=hairClipMaterial;
		this.hairClipType=hairClipType;
		this.hairClipPrice=hairClipPrice;
		this.hairClipSize=hairClipSize;
	}
	
	public void getClipInfo(){
			System.out.println("HairClip  details : ");
			System.out.println("id of the hair clip is : "+hairClipId);
			System.out.println("color of hair clip is : "+hairClipColor);
			System.out.println("material of hair clip is : "+hairClipMaterial);
			System.out.println("type of hair clip is : "+hairClipType);
			System.out.println("price of the hair clip is : "+hairClipPrice);
			System.out.println("size of the hair clip is : "+hairClipSize);
	}

}