class PavitraCollections{
	public static void main(String collections[]){
		String brands[]={"adidas","Louis Vuitton","Gucci","Calvin Klein","Franklin & Marshall","Tommy Jeans","U.S. POLO ASSN.","Puma","Zudio","Max"};
		System.out.println();
		System.out.println("The brands of the pavithra collections are : ");
		//System.out.println(brands[0]+","+brands[1]+","+brands[2]+","+brands[3]+","+brands[4]+","+brands[5]+","+brands[6]+","+brands[7]+","+brands[8]+","+brands[9]);
		for(String brand : brands){
			System.out.println(brand);
		}
	}
}