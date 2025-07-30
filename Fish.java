class Fish {
	int fishId;
	String fishName;
	String category;
	String bodyShape;
	String finType;
	boolean isAquariumFriendly;
	
	Fish(){
		System.out.println();
		System.out.println("Fish constructor without parameters loaded");
	}
	
	Fish(int fishId,String fishName){
		System.out.println();
		System.out.println("Fish constructor with(int,String) parameters loaded");
		this.fishId=fishId;
		this.fishName=fishName;
	}
	
	Fish(String category,String bodyShape,String finType){
		System.out.println();
		System.out.println("Fish constructor with(String,String,String) parameters loaded");
		this.category=category;
		this.bodyShape=bodyShape;
		this.finType=finType;
	}
	
	Fish(String fishName,boolean isAquariumFriendly){
		System.out.println();
		System.out.println("Fish constructor with(String,boolean) parameters loaded");
		this.fishName=fishName;
		this.isAquariumFriendly=isAquariumFriendly;
	}
	
	Fish(int fishId,String fishName,String category,String bodyShape,String finType,boolean isAquariumFriendly){
		System.out.println();
		System.out.println("Fish constructor with parameters loaded");
		this.fishId=fishId;
		this.fishName=fishName;
		this.category=category;
		this.bodyShape=bodyShape;
		this.finType=finType;
		this.isAquariumFriendly=isAquariumFriendly;
	}

	public void getFishInfo(){
		System.out.println("fish  details : ");
		System.out.println("id of fish is : "+fishId);
		System.out.println("name of the fish is : "+fishName);
		System.out.println("category of the fish is : "+category);
		System.out.println("body shape of the fish is : "+bodyShape);
		System.out.println("fin ype of fish is : "+finType);
		System.out.println("IS Aquarium friendly? "+isAquariumFriendly);
	}
}