class HospitalRunner{
	public static void main(String doc[]){
		System.out.println("main started");
		System.out.println();
			Doctor doctor=new Doctor(1,"Dr. Reena","General Physician");
			Department department=new Department(3,"General Medicine",10,doctor);
			Hospital hospital = new Hospital(5,"Apollo Hospitals","Vijayanagara",department);
			hospital.getHospitalDetails();
		System.out.println();
		System.out.println("main ended");
	}

}