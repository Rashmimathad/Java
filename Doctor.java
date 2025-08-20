class Doctor{

	int doctorId;
	String doctorName;
	String specialization;
	
	Doctor(){
		
		
	}
	
	Doctor(int doctorId,String doctorName,String specialization){
		this.doctorId=doctorId;
		this.doctorName=doctorName;
		this.specialization=specialization;
	}
	
	public void getDoctorInfo(){
		System.out.println("Doctor details fetched....");
		System.out.println("Id of the doctor is : "+doctorId);
		System.out.println("name of the doctor is  : "+doctorName);
		System.out.println("Specialization of the doctor is  : "+specialization);
	}
}