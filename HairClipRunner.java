class HairClipRunner{
	public static void main(String clip[]){
		System.out.println("main started");
		System.out.println();
			HairClip hairClipOne = new HairClip(1,"Clasp",50.0);
			System.out.println("id of the hair clip is : "+hairClipOne.hairClipId);
			System.out.println("type of hair clip is : "+hairClipOne.hairClipType);
			System.out.println("price of the hair clip is : "+hairClipOne.hairClipPrice);
			System.out.println();
			
			HairClip hairClipTwo = new HairClip(2,"Black","Plastic");
			System.out.println("id of the hair clip is : "+hairClipTwo.hairClipId);
			System.out.println("color of hair clip is : "+hairClipTwo.hairClipColor);
			System.out.println("material of hair clip is : "+hairClipTwo.hairClipMaterial);
			System.out.println();
			
			HairClip hairClipThree = new HairClip(15.0,"Small");
			System.out.println("price of the hair clip is : "+hairClipThree.hairClipPrice);
			System.out.println("size of the hair clip is : "+hairClipThree.hairClipSize);
			System.out.println();
			System.out.println();
			
			HairClip hairClipFour = new HairClip(11,"Grey","Acrylic","French Clip",35.0,"Medium");
			hairClipFour.getClipInfo();
			System.out.println();
			
			HairClip hairClipFive = new HairClip();
			hairClipFive.getClipInfo();
		System.out.println();
		System.out.println("main ended");
	}

}