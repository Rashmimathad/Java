class SpiceShop{
	public static void main(String spice[]){
		String spices[]={"Turmeric","Cumin","Cinnamon","Cloves","Ginger","Black Pepper","coriander","bay leaf","fenugreek","Red chilli","star anice","Asafoetida","Ginger","Bay Leaf"};
		System.out.println();
		System.out.println("The spices of the spice shop are : ");
		//System.out.println(spices[0]+","+spices[1]+","+spices[2]+","+spices[3]+","+spices[4]+","+spices[5]+","+spices[6]+","+spices[7]+","+spices[8]+","+spices[9]+","+spices[10]+","+spices[11]+","+spices[12]+","+spices[13]);
		for(String spiceName : spices){
			System.out.println(spiceName);
		}
	}
}