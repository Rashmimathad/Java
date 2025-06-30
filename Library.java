class Library {
	public static void main(String library[]){
		String bookNames[]={"Ikigai","Atomic Habits","To Kill a Mockingbird","War and Peace","Twisted Series","Harry Potter Series","The Alchemist","The Catcher in the Rye","The Handmaid's Tale","Dopamine detox"};
		System.out.println();
		System.out.println("The book names in the library are : ");
		//System.out.println(bookNames[0]+","+bookNames[1]+","+bookNames[2]+","+bookNames[3]+","+bookNames[4]+","+bookNames[5]+","+bookNames[6]+","+bookNames[7]+","+bookNames[8]+","+bookNames[9]);
		for(String bookName : bookNames){
			System.out.println(bookName);
		}
	}
}