class Shelf {
	Book book;
	
	Shelf(){
		
	}
	
	Shelf(Book book){
		this.book=book;
	}
	public void getShelfDetails(){
		System.out.println("Shelf Info fetched....");
		this.book.getBookDetails();
		
	}
}