class LibraryRunner{
	public static void main(String lib[]){
		System.out.println("main started");
			System.out.println();
			Book book=new Book(007,"self help","Ikigai",true);
			Shelf shelf=new Shelf(book);
			Library libraryOne=new Library("Central Library","Rajajinagar",5,shelf,20);
			libraryOne.getLibraryDetails();
			System.out.println();
			System.out.println("main ended");
	}
}