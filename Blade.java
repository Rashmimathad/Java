class Blade{
	int bladeId;
	double bladeWeight;
	double bladeThickness;
	String bladeMaterial;
	double bladeLength;
	String bladeType;
	String sharpnessLevel;
	
	Blade(){
		System.out.println();
		System.out.println("Blade constructor without parameters loaded");
	}
	
	Blade(int bladeId,double bladeWeight,double bladeThickness){
		System.out.println();
		System.out.println("Blade constructor with(int,double,double) parameters loaded");
		this.bladeId=bladeId;
		this.bladeWeight=bladeWeight;
		this.bladeThickness=bladeThickness;
	}
	
	Blade(String bladeMaterial,double bladeLength,String bladeType){
		System.out.println();
		System.out.println("Blade constructor with(String,double,String) parameters loaded");
		this.bladeMaterial=bladeMaterial;
		this.bladeLength=bladeLength;
		this.bladeType=bladeType;
	}
	
	Blade(double bladeThickness,String sharpnessLevel){
		System.out.println();
		System.out.println("Blade constructor with(double,String) parameters loaded");
		this.bladeThickness=bladeThickness;
		this.sharpnessLevel=sharpnessLevel;
	}
	
	Blade(int bladeId,double bladeWeight,double bladeThickness,String bladeMaterial,double bladeLength,String bladeType,String sharpnessLevel){
		System.out.println();
		System.out.println("Blade constructor with parameters loaded");
		this.bladeId=bladeId;
		this.bladeWeight=bladeWeight;
		this.bladeThickness=bladeThickness;
		this.bladeMaterial=bladeMaterial;
		this.bladeLength=bladeLength;
		this.bladeType=bladeType;
		this.sharpnessLevel=sharpnessLevel;
	}
	
	public void getBladeInfo(){
		System.out.println("Blade  details : ");
		System.out.println("id of blade is : "+bladeId);
		System.out.println("weight of the blade is : "+bladeWeight+" g");
		System.out.println("thickness of the blade is : "+bladeThickness+" mm");
		System.out.println("material of the blade is : "+bladeMaterial);
		System.out.println("length of the blade is : "+bladeLength+" inches");
		System.out.println("type of the blade is : "+bladeType);
		System.out.println("sharpness level of blade is : "+sharpnessLevel);
	}
}