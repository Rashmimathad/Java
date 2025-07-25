class HairClip{
	
	int hairClipId;
	String hairClipColor;
	String hairClipMaterial;
	String hairClipType;
	double hairClipPrice;
	String hairClipSize;
	
	public void getClipInfo(){
			System.out.println();
			System.out.println("HairClip  details : ");
			System.out.println("id of the hair clip is : "+hairClipId);
			System.out.println("color of hair clip is : "+hairClipColor);
			System.out.println("material of hair clip is : "+hairClipMaterial);
			System.out.println("type of hair clip is : "+hairClipType);
			System.out.println("price of the hair clip is : "+hairClipPrice);
			System.out.println("size of the hair clip is : "+hairClipSize);
	}

}