class Rod{

	int rodId;
	String rodMaterial;
	double rodLength;
	double weight;
	boolean isMagnetic;
	double price;
	
	public void getRodInfo(){
			System.out.println();
			System.out.println("Rod  details  : ");
			System.out.println("id of rod is : "+rodId);
			System.out.println("material  of rod is : "+rodMaterial);
			System.out.println("length of the rod is : "+rodLength+" metres");
			System.out.println("is Magnetic? "+isMagnetic);
			System.out.println("weight of the rod is : "+weight+" Kg");
			System.out.println("price of the rod is : "+price);
	}
}