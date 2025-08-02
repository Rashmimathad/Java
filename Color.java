class Color{
	
	int colorId;
	String colorName;
	String colorCode;
	String colorShade;
	boolean isPastelColor;
	String rgbValues;
	
	Color(){
		this(1,"Red");
		System.out.println("Color default constructor invoked");
	}
	
	Color(int colorId,String colorName){
		this("#FF0000","Dark",false);
		System.out.println("Color  constructor with(int,String) parameters invoked");
		this.colorId=colorId;
		this.colorName=colorName;
	}
	
	Color(String colorCode,String colorShade,boolean isPastelColor){
		this("Blue","#0000FF","(0, 0, 255)");
		System.out.println("Color  constructor with(String,String,boolean) parameters invoked");
		this.colorCode=colorCode;
		this.colorShade=colorShade;
		this.isPastelColor=isPastelColor;
	}
	
	Color(String colorName,String colorCode,String rgbValues){
		this(5,	"Pastel Pink",	"#FFD1DC","Light",true,"(255, 209, 220)");
		System.out.println("Color  constructor with(String,String,String) parameters invoked");
		this.colorName=colorName;
		this.colorCode=colorCode;
		this.rgbValues=rgbValues;
	}
	
	Color(int colorId,String colorName,String colorCode,String colorShade,boolean isPastelColor,String rgbValues){
		this("Orange",false);
		System.out.println("Color  constructor with all  parameters invoked");
		this.colorId=colorId;
		this.colorName=colorName;
		this.colorCode=colorCode;
		this.colorShade=colorShade;
		this.isPastelColor=isPastelColor;
		this.rgbValues=rgbValues;
	}
	
	Color(String colorName,boolean isPastelColo){
		this(6,"Peach","#FFDAB9");
		System.out.println("Color  constructor with(String,boolean) parameters invoked");
		this.colorName=colorName;
		this.isPastelColor=isPastelColor;
	}
	
	Color(int colorId,String colorName,String colorCode){
		System.out.println("Color  constructor with(int,String,String) parameters invoked");
	}
	
	public void getColorDetails(){
		System.out.println("Color Details:");
		System.out.println("id of color is : "+colorId);
		System.out.println("name of color is : "+colorName);
		System.out.println("code of color is : "+colorCode);
		System.out.println("shade of color is : "+colorShade);
		System.out.println("Is pastel Color? "+isPastelColor);
		System.out.println("rgb values of color are : "+rgbValues);
		
	}
}