class MakeupKitRunner{

	public static void main(String[] makeup){
	
		System.out.println("main started");
		double price=MakeupKit.getPrice();
		System.out.println("The price of the makeup kit is "+price+" rs");
		String brandName=MakeupKit.getBrandName();
		System.out.println("The brand name of the makeup kit is "+brandName);
		int noOfMakeupItems=MakeupKit.getNoOfMakeupItems();
		System.out.println("The no of makeup items in the makeup kit is "+noOfMakeupItems);
		boolean isWaterProof=MakeupKit.getIsWaterProof();
		System.out.println("Are the make products waterproof? "+isWaterProof);
		String expiryDate=MakeupKit.getExpiryDate();
		System.out.println("The expiry date od the makeup kit is "+expiryDate);
		System.out.println("main ended");
	}
}