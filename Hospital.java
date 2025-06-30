class Hospital{
	public static void main(String hospital[]){
		String doctorNames[]={"Cardiologist","Dermatologist","Orthopedist","Neurologist","Psychiatrist","Pediatrician","Oncologist","Gynecologist","Gastroenterologist","Surgeon"};
		System.out.println();
		System.out.println("The doctors of the hospital are  : ");
		//System.out.println(doctorNames[0]+","+doctorNames[1]+","+doctorNames[2]+","+doctorNames[3]+","+doctorNames[4]+","+doctorNames[5]+","+doctorNames[6]+","+doctorNames[7]+","+doctorNames[8]+","+doctorNames[9])
		for(String doctorName : doctorNames){
			System.out.println(doctorName);
		}
	}
}