class Tomato{
	int tomatoId;
	String tomatoType;
	double pricePerKg;
	double quantityInKg;
	String tomatoColor;
	boolean isOrganic;
	
	Tomato(int tomatoId,String tomatoType,double pricePerKg){
		this("Desi Tomato",25.0,5);
		System.out.println("Tomato constructor with(int,String,double) parameters invoked");
		this.tomatoId=tomatoId;
		this.tomatoType=tomatoType;
		this.pricePerKg=pricePerKg;
	}
	
	Tomato(String tomatoType,double pricePerKg,double quantityInKg){
		this("Green",true);
		System.out.println("Tomato constructor with(String,double,double) parameters invoked");
		this.tomatoType=tomatoType;
		this.pricePerKg=pricePerKg;
		this.quantityInKg=quantityInKg;
	}
	
	Tomato(String tomatoColor,boolean isOrganic){
		this("Hybrid Tomato","Red",false);
		System.out.println("Tomato constructor with(String,boolean) parameters invoked");
		this.tomatoColor=tomatoColor;
		this.isOrganic=isOrganic;
	}
	
	Tomato(String tomatoType,String tomatoColor,boolean isOrganic){
		this(5,"Cherry tomato",50.0,3.5,"Red",true);
		System.out.println("Tomato constructor with(String,String,boolean) parameters invoked");
			this.tomatoType=tomatoType;
			this.tomatoColor=tomatoColor;
			this.isOrganic=isOrganic;
	}
	
	Tomato(int tomatoId,String tomatoType,double pricePerKg,double quantityInKg,String tomatoColor,boolean isOrganics){
		this("Green",false,30.0);
		System.out.println("Tomato constructor with all  parameters invoked");
		this.tomatoId=tomatoId;
		this.tomatoType=tomatoType;
		this.pricePerKg=pricePerKg;
		this.quantityInKg=quantityInKg;
		this.tomatoColor=tomatoColor;
		this.isOrganic=isOrganic;
	}
	
	Tomato(){
		this(1,"Cherry Tomato",20.0);
		System.out.println("Tomato default constructor invoked");
	}
	
	Tomato(String tomatoColor,boolean isOrganic,double pricePerKg){
		System.out.println("Tomato constructor with(String,boolean,double) parameters invoked");
		this.tomatoColor=tomatoColor;
		this.isOrganic=isOrganic;
		this.pricePerKg=pricePerKg;
	}
	
	public void getTomatoInfo(){
		System.out.println("Tomato Details: ");
		System.out.println("id of tomato is : "+tomatoId);
		System.out.println("type of tomato is : "+tomatoType);
		System.out.println("price of the tomato per Kg : "+pricePerKg);
		System.out.println("quantity in kg is : "+quantityInKg);
		System.out.println("color of tomato is : "+tomatoColor);
		System.out.println("Is Organic tomato? "+isOrganic);
	}
}