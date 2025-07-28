class Jewellery{
	int jewelleryId;
	String jewelleryType;
	String jewelleryName;
	double makingCharges;
	double jewelleryPrice;
	String jewelleryDesignStyle;
	int warrantyPeriod;
	
	Jewellery(){
		System.out.println();
		System.out.println("Jewellery constructor without parameters loaded");
	}
	
	Jewellery(int jewelleryId,String jewelleryType,String jewelleryName,double makingCharges,double jewelleryPrice,String jewelleryDesignStyle,int warrantyPeriod){
		System.out.println();
		System.out.println("Jewellery constructor with parameters loaded");
		this.jewelleryId=jewelleryId;
		this.jewelleryType=jewelleryType;
		this.jewelleryName=jewelleryName;
		this.makingCharges=makingCharges;
		this.jewelleryPrice=jewelleryPrice;
		this.jewelleryDesignStyle=jewelleryDesignStyle;
		this.warrantyPeriod=warrantyPeriod;
	}
	
	public void getJewelleryInfo(){
			System.out.println("Jewellery  details : ");
			System.out.println("id of jewellery is : "+jewelleryId);
			System.out.println("the type of the jewellery is : "+jewelleryType);
			System.out.println("the jewellery name is : "+jewelleryName);
			System.out.println("the making charges of the jewellery is : "+makingCharges+" %");
			System.out.println("the price of the jewellery is : "+jewelleryPrice);
			System.out.println("the design style of the jewellery is : "+jewelleryDesignStyle);
			System.out.println("the warranty period of the jewellery is  : "+warrantyPeriod);
	}
}