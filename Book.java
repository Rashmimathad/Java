class Book{
	int bookId;
	String bookType;
	String bookName;
	boolean isAvailable;
	
	Book(){
		
		
	}
	
	Book(int bookId,String bookType,String bookName,boolean isAvailable){
		this.bookId=bookId;
		this.bookType=bookType;
		this.bookName=bookName;
		this.isAvailable=isAvailable;
	}
	
	public void getBookDetails(){
		System.out.println("Book info fetched...");
		System.out.println("Book Id is : "+bookId);
		System.out.println("Type of book is : "+bookType);
		System.out.println("Book name is : "+bookName);
		System.out.println("Is available? : "+isAvailable);
		
	}

}