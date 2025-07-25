class Fish {
	int fishId;
	String fishName;
	String category;
	String bodyShape;
	String finType;
	boolean isAquariumFriendly;

	public void getFishInfo(){
		System.out.println();
		System.out.println("fish one details : ");
		System.out.println("id of fish is : "+fishId);
		System.out.println("name of the fish is : "+fishName);
		System.out.println("category of the fish is : "+category);
		System.out.println("body shape of the fish is : "+bodyShape);
		System.out.println("fin ype of fish is : "+finType);
		System.out.println("IS Aquarium friendly? "+isAquariumFriendly);
	}
}