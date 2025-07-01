class Library {
	/*static String ikigai="Ikigai";
	static String atomicHabits="Atomic Habits";
	static String mockingBird="To Kill a Mockingbird";
	static String warAndPeace="War and Peace";
	static String twistedSeries="Twisted Series";
	static String harryPotterSeries="Harry Potter Series";
	static String theAlchemist="The Alchemist";
	static String catcherInTheRye="The Catcher in the Rye";
	static String handmadeTale="The Handmaid's Tale";
	static String dopamineDetox="Dopamine Detox";*/
	public static void main(String library[]){
			System.out.println("main started");
			String ikigai="Ikigai";
			String atomicHabits="Atomic Habits";
			String mockingBird="To Kill a Mockingbird";
			String warAndPeace="War and Peace";
			String twistedSeries="Twisted Series";
			String harryPotterSeries="Harry Potter Series";
			String theAlchemist="The Alchemist";
			String catcherInTheRye="The Catcher in the Rye";
			String handmadeTale="The Handmaid's Tale";
			String dopamineDetox="Dopamine Detox";
			
		String bookNames[]={ikigai,atomicHabits,mockingBird,warAndPeace,twistedSeries,harryPotterSeries,theAlchemist,catcherInTheRye,handmadeTale,dopamineDetox};
		System.out.println("The book names in the library are : ");
		//System.out.println(bookNames[0]+","+bookNames[1]+","+bookNames[2]+","+bookNames[3]+","+bookNames[4]+","+bookNames[5]+","+bookNames[6]+","+bookNames[7]+","+bookNames[8]+","+bookNames[9]);
		for(String bookName : bookNames){
			System.out.println(bookName);
		}
				System.out.println("main ended");
	}
}