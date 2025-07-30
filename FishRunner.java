class FishRunner{
	public static void main(String fish[]){
		System.out.println("main started");
		System.out.println();
			Fish fishOne = new Fish(1,"Salmon");
			System.out.println("id of fish is : "+fishOne.fishId);
			System.out.println("name of the fish is : "+fishOne.fishName);
			System.out.println();
			
			Fish fishTwo = new Fish("Freshwater","Round","Fan");
			System.out.println("category of the fish is : "+fishTwo.category);
			System.out.println("body shape of the fish is : "+fishTwo.bodyShape);
			System.out.println("fin ype of fish is : "+fishTwo.finType);
			System.out.println();
			
			Fish fishThree = new Fish("Clownfish",true);
			System.out.println("name of the fish is : "+fishThree.fishName);
			System.out.println("IS Aquarium friendly? "+fishThree.isAquariumFriendly);
			System.out.println();
			
			Fish fishFour = new Fish();
			fishFour.getFishInfo();
			System.out.println();
			
			Fish fishFive = new Fish(5,"Catfish","Freshwater","Flat-bottomed","Spine",false);
			fishFive.getFishInfo();
		System.out.println();
		System.out.println("main ended");
	}

}