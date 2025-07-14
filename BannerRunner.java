class BannerRunner{

	public static void main(String[] banner){
		System.out.println("main started");
		String text=Banner.getText();
		System.out.println("The text on the banner is : "+text);
		int height=Banner.getHeight();
		System.out.println("The height of the banner is : "+height+" inches");
		double width=Banner.getWidth();
		System.out.println("The width of the banner is : "+width+" inches");
		String surfaceType=Banner.getSurfaceType();
		System.out.println("The surface type of the banner is : "+surfaceType);
		double price=Banner.getPrice();
		System.out.println("The price of the banner is : "+price+" rs");
		boolean isFireResistant=Banner.getIsFireResistant();
		System.out.println("Is the banner fireresistant? "+isFireResistant);
		System.out.println("main ended");
	
	}

}