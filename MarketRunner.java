class MarketRunner{
	public static void main(String[] market){
		System.out.println("main started");
		String typeOfProductsSold=Market.getTypeOfProductsSold();
		System.out.println("The type of products sold in the market are : "+typeOfProductsSold);
		boolean isWholeSale=Market.getIsWholeSale();
		System.out.println("Is the market whole sale? "+isWholeSale);
		String location=Market.getLocation();
		System.out.println("The market is located at "+location);
		String timings=Market.getTimings();
		System.out.println("The timings of the market is from "+timings);
		boolean isOpenOnSunday=Market.getIsOpenOnSunday();
		System.out.println("Is the market open on sunday? "+isOpenOnSunday);
		boolean isMetroAvailable=Market.getIsMetroAvailable();
		System.out.println("Is metro available at the market? "+isMetroAvailable);
		System.out.println("main ended");
	}
}