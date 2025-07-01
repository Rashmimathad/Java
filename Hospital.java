class Hospital{
	/*static String cardiologist="Cardiologist";
	static String dermatologist="Dermatologist";
	static String orthopedist="Orthopedist";
	static String neurologist="Neurologist";
	static String psychiatrist="Psychiatrist";
	static String pediatrician="Pediatrician";
	static String oncologist="Oncologist";
	static String gynecologist="Gynecologist";
	static String gastroenterologist="Gastroenterologist";
	static String surgeon="Surgeon";*/
	public static void main(String hospital[]){
			System.out.println("main started");
			String cardiologist="Cardiologist";
			String dermatologist="Dermatologist";
			String orthopedist="Orthopedist";
			String neurologist="Neurologist";
			String psychiatrist="Psychiatrist";
			String pediatrician="Pediatrician";
			String oncologist="Oncologist";
			String gynecologist="Gynecologist";
			String gastroenterologist="Gastroenterologist";
			String surgeon="Surgeon";
			
		String doctorNames[]={cardiologist,dermatologist,orthopedist,neurologist,psychiatrist,pediatrician,oncologist,gynecologist,gastroenterologist,surgeon};
		System.out.println("The doctors of the hospital are  : ");
		//System.out.println(doctorNames[0]+","+doctorNames[1]+","+doctorNames[2]+","+doctorNames[3]+","+doctorNames[4]+","+doctorNames[5]+","+doctorNames[6]+","+doctorNames[7]+","+doctorNames[8]+","+doctorNames[9])
		for(String doctorName : doctorNames){
			System.out.println(doctorName);
		}
				System.out.println("main ended");
	}
}