class PeriodicTable{
/*	static String oxygen="Oxygen";
	static String hydrogen="Hydrogen";
	static String calcium="Calcium";
	static String magnesium="Magnesium";
	static String helium="Helium";
	static String sulphur="Sulphur";
	static String iron ="Iron";
	static String potassium="Potassium";
	static String carbon="Carbon";
	static String sodium="Sodium";
	static String aluminium="Aluminum";*/
	public static void main(String periodictable[]){
			System.out.println("main started");
			String oxygen="Oxygen";
			String hydrogen="Hydrogen";
			String calcium="Calcium";
			String magnesium="Magnesium";
			String helium="Helium";
			String sulphur="Sulphur";
			String iron ="Iron";
			String potassium="Potassium";
			String carbon="Carbon";
			String sodium="Sodium";
			String aluminium="Aluminum";
			
		String elements[]={oxygen,nitrogen,hydrogen,calcium,magnesium,helium,sulphur,iron,potassium,carbon,sodium,aluminum};
		System.out.println("The elements in the periodic table are : ");
		//System.out.println(elements[0]+","+elements[1]+","+elements[2]+","+elements[3]+","+elements[4]+","+elements[5]+","+elements[6]+","+elements[7]+","+elements[8]+","+elements[9]+","+elements[10]+","+elements[11]);
		for(String element : elements){
			System.out.println(element);
		}
				System.out.println("main ended");
	}
}
