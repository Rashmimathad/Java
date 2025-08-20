class Department{
	 
	int departmentId;
	String departmentName;
	int noOfDoctors;
	Doctor doctor;
	
	Department(){
		
		
	}
	
	Department(int departmentId,String departmentName,int noOfDoctors,Doctor doctor){
		this.departmentId=departmentId;
		this.departmentName=departmentName;
		this.noOfDoctors=noOfDoctors;
		this.doctor=doctor;
	}
	
	public void getDepartmentDetails(){
		System.out.println("Department details fetched...");
		System.out.println("Id of department is : "+departmentId);
		System.out.println("Name of the department is : "+departmentName);
		System.out.println("no of doctors in department are : "+noOfDoctors);
		System.out.println();
		System.out.println("Doctor Info : ");
		this.doctor.getDoctorInfo();
	}
}