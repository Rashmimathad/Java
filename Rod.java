class Rod{

	int rodId;
	String rodMaterial;
	double rodLength;
	double weight;
	boolean isMagnetic;
	double price;
	
	Rod(){
		System.out.println();
		System.out.println("Rod constructor without parameters loaded");
	}
	
	Rod(int rodId,String rodMaterial){
		System.out.println();
		System.out.println("Rod constructor with(int,String) parameters loaded");
		this.rodId=rodId;
		this.rodMaterial=rodMaterial;
	}
	
	Rod(double price,double weight){
		System.out.println();
		System.out.println("Rod constructor with(double,double) parameters loaded");
		this.price=price;
		this.weight=weight;
	}
	
	Rod(boolean isMagnetic,double rodLength){
		System.out.println();
		System.out.println("Rod constructor with(boolean,double) parameters loaded");
		this.isMagnetic=isMagnetic;
		this.rodLength=rodLength;
		
	}
	
	Rod(int rodId,String rodMaterial,double rodLength,boolean isMagnetic,double weight,double price){
		System.out.println();
		System.out.println("Rod constructor with parameters loaded");
		this.rodId=rodId;
		this.rodMaterial=rodMaterial;
		this.rodLength=rodLength;
		this.isMagnetic=isMagnetic;
		this.weight=weight;
		this.price=price;
	}
	
	public void getRodInfo(){
			System.out.println("Rod  details  : ");
			System.out.println("id of rod is : "+rodId);
			System.out.println("material  of rod is : "+rodMaterial);
			System.out.println("length of the rod is : "+rodLength+" metres");
			System.out.println("is Magnetic? "+isMagnetic);
			System.out.println("weight of the rod is : "+weight+" Kg");
			System.out.println("price of the rod is : "+price);
	}
}