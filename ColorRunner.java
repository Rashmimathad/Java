class ColorRunner{
	public static void main(String color[]){
		System.out.println("main started");
		System.out.println();
		
			System.out.println("Instance one created");
			Color colorOne = new Color(1,"Red");
			colorOne.getColorDetails();
			System.out.println("Instance one ended");
			System.out.println();
			
			System.out.println("Instance two created");
			Color colorTwo = new Color("#FF0000","Dark",false);
			colorTwo.getColorDetails();
			System.out.println("Instance two ended");
			System.out.println();
			
			System.out.println("Instance three created");
			Color colorThree = new Color();
			colorThree.getColorDetails();
			System.out.println("Instance three ended");
			System.out.println();
			
			System.out.println("Instance four created");
			Color colorFour = new Color("Blue","#0000FF","(0, 0, 255)");
			colorFour.getColorDetails();
			System.out.println("Instance four ended");
			System.out.println();
			
			System.out.println("Instance five created");
			Color colorFive = new Color(5,	"Pastel Pink",	"#FFD1DC","Light",true,"	(255, 209, 220)");
			colorFive.getColorDetails();
			System.out.println("Instance five ended");
			System.out.println();
			
			System.out.println("Instance six created");
			Color colorSix = new Color(6,"Peach","#FFDAB9");
			colorSix.getColorDetails();
			System.out.println("Instance six ended");
			System.out.println();
			
			System.out.println("Instance Seven Created");
			Color colorSeven = new Color("Orange",false);
			colorSeven.getColorDetails();
			System.out.println("Instance Seven ended");
		
		
		System.out.println();
		System.out.println("main ended");
	}
}