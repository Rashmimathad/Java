class JuiceShop{
	public static void main(String juice[]){
		String  juices[]={"Aam Panna","Mango","Orange","Watermelon","MuskMelon","Apple","Avocado","Cranberry","Dragon fruit","Grape","Guava","Lime","Lychee","Pomegranate","Pineapple"};
		System.out.println();
		System.out.println("The juices of the juice shop are : ");
		//System.out.println(juices[0]+","+juices[1]+","+juices[2]+","+juices[3]+","+juices[4]+","+juices[5]+","+juices[6]+","+juices[7]+","+juices[8]+","+juices[9]+","+juices[10]+","+juices[11]+","+juices[12]+","+juices[13]+","+juices[14]);
		for(String juiceName : juices){
			System.out.println(juiceName);
		}
	}
}