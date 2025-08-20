class Library{
	String libraryName;
	String location;
	int libraryId;
	Shelf shelf;
	int noOfStaff;
	
	Library(){
		
	}
	Library(String libraryName,String location,int libraryId,Shelf shelf,int noOfStaff){
		System.out.println("Library constructor invoked");
		this.libraryName=libraryName;
		this.location=location;
		this.libraryId=libraryId;
		this.shelf=shelf;
		this.noOfStaff=noOfStaff;
	}
	public void getLibraryDetails(){
		
		System.out.println("Library Details fetched....");
		System.out.println("Id of library is : "+libraryId);
		System.out.println("Library name is : "+libraryName);
		System.out.println("Library is located at : "+location);
		System.out.println("no of staff at library is : "+noOfStaff);
		System.out.println("Shelf info : ");
		this.shelf.getShelfDetails();
	}
}