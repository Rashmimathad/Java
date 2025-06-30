class Bar {
	public static void main(String bar[]){
		String alcoholNames[]={"Vodka","gin","tequila","rum","whisky","brandy","Wine","Beer","Fortified Wine","Scotch","cider","singani"};
		System.out.println();
		System.out.println("The alcohol names in the bar are : ");
		//System.out.println(alcoholNames[0]+","+alcoholNames[1]+","+alcoholNames[2]+","+alcoholNames[3]+","+alcoholNames[4]+","+alcoholNames[5]+","+alcoholNames[6]+","+alcoholNames[7]+","+alcoholNames[8]+","+alcoholNames[9]+","+alcoholNames[10]+","+alcoholNames[11]);
		for(String alcoholName : alcoholNames){
			System.out.println(alcoholName);
		}
	}
}