class Hospital{
	int hospitalId;
	String hospitalName;
	String hospitalLocation;
	Department department;
	
	Hospital(){
		
		
	}

	Hospital(int hospitalId,String hospitalName,String hospitalLocation,Department department){
		System.out.println("Hospital constructor with parameters invoked");
		this.hospitalId=hospitalId;
		this.hospitalName=hospitalName;
		this.hospitalLocation=hospitalLocation;
		this.department=department;
	}
	
	public void getHospitalDetails(){
		System.out.println("Hospital detaild fetched.....");
		System.out.println("Id of the hospital is : "+hospitalId);
		System.out.println("Name of the hospital is  : "+hospitalName);
		System.out.println("hospital is located at : "+hospitalLocation);
		System.out.println();
		System.out.println("Department details : ");
		this.department.getDepartmentDetails();
	}
	
}