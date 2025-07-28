class Hat{
	int hatId;
	String hatType;
	String hatColor;
	String brandName;
	double price;
	String material;
	
	Hat(){
		System.out.println();
		System.out.println("Hat constructor without parameters loaded");
	}
	
	Hat(int hatId,String hatType,String hatColor,String brandName,double price,String material){
		System.out.println();
		System.out.println("Hat constructor with parameters loaded");
		this.hatId=hatId;
		this.hatType=hatType;
		this.hatColor=hatColor;
		this.price=price;
		this.material=material;
	}
	
	public void getHatInfo(){
			System.out.println("hat details : ");
			System.out.println("id of hat is :"+hatId);
			System.out.println("type of the hat is : "+hatType);
			System.out.println("color of the hat is : "+hatColor);
			System.out.println("brand name of the hat is : "+brandName);
			System.out.println("price of the hat is : "+price);
			System.out.println("material of the hat is : "+material);
	}

}