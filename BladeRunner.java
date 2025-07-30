class BladeRunner{
	public static void main(String blade[]){
		System.out.println("main started");
		System.out.println();
		
		Blade bladeOne = new Blade(1,150.00,2.5);
		System.out.println("The blade Id is : "+bladeOne.bladeId);
		System.out.println("weight of the blade is : "+bladeOne.bladeWeight+" g");
		System.out.println("thickness of the blade is : "+bladeOne.bladeThickness+" mm");
		System.out.println();
		
		Blade bladeTwo=new Blade("Stainless Steel",6.5,"Razor Blade");
		System.out.println("material of the blade is : "+bladeTwo.bladeMaterial);
		System.out.println("length of the blade is : "+bladeTwo.bladeLength+" inches");
		System.out.println("type of the blade is : "+bladeTwo.bladeType);
		System.out.println();
		
		Blade bladeThree=new Blade(1.75,"Less sharp");
		System.out.println("thickness of the blade is : "+bladeThree.bladeThickness+" mm");
		System.out.println("sharpness level of blade is : "+bladeThree.sharpnessLevel);
		System.out.println();
		
		Blade bladeFour = new Blade(4,180.00,0.75,"Stainless Steel",7.5,"Chef's Knife","Moderate");
		bladeFour.getBladeInfo();
		System.out.println();
		
		Blade bladeFive = new Blade();
		bladeFive.getBladeInfo();
		System.out.println();
		
		System.out.println("main ended");
	}
}