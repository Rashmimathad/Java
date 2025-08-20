class PvrCinemas{
  int branchId;
  String branchLocation;
  String managerName;
  int noOfWorkingStaff;
  Screen screen;
  
	PvrCinemas(){
	  
	}
  
	PvrCinemas(int branchId,String branchLocation,String managerName,int noOfWorkingStaff,Screen screen){
		System.out.println("PvrCinemas constructors with parameters invoked");
		this.branchId=branchId;
		this.branchLocation=branchLocation;
		this.managerName=managerName;
		this.screen=screen;
	}
  
	public void getPvrCinemasInfo(){
		System.out.println("PvrCinemas details fetched....");
		System.out.println("Id of the branch of PvrCinemas is : "+branchId);
		System.out.println("location of the branch of PvrCinemas is  : "+branchLocation);
		System.out.println("manager name of the PvrCinemas is : "+managerName);
		System.out.println("No of working staff at this branch of PvrCinemas is : "+noOfWorkingStaff);
		System.out.println();
		System.out.println("Screen details : ");
		this.screen.getScreenInfo();
	  
	}
  
}