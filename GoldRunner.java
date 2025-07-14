class GoldRunner{
	public static void main(String[] gold){
		System.out.println("main started");
		boolean isMalleable=Gold.getIsMalleable();
		System.out.println("Is gold malleable? "+isMalleable);
		boolean isDuctile=Gold.getIsDuctile();
		System.out.println("Is gold ductile? "+isDuctile);	
		double price=Gold.getPrice();
		System.out.println("The price of the gold is "+price+" per gram");
		String goldType=Gold.getGoldType();
		System.out.println("The type of the gold is "+goldType);
		boolean isHeatResistant=Gold.getIsHeatResistant();
		System.out.println("Is gold heat resistant? "+isHeatResistant);
		System.out.println("main ended");
	}
}