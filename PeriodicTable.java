class PeriodicTable{
	public static void main(String periodictable[]){
		String elements[]={"Oxygen","Nitrogen","Hydrogen","Calcium","Magnesium","Helium","Sulphur","Iron","Potassium","Carbon","Sodium","Aluminum"};
		System.out.println();
		System.out.println("The elements in the periodic table are : ");
		//System.out.println(elements[0]+","+elements[1]+","+elements[2]+","+elements[3]+","+elements[4]+","+elements[5]+","+elements[6]+","+elements[7]+","+elements[8]+","+elements[9]+","+elements[10]+","+elements[11]);
		for(String element : elements){
			System.out.println(element);
		}
	}
}