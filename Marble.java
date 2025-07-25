class Marble{

	int marbleId;
	String marbleName;
	String texture;
	String porosity;
	String pattern;
	String color;

	public void getMarbleInfo(){
		System.out.println();
		System.out.println("Marble  details : ");
		System.out.println("id of marble is : " + marbleId);
		System.out.println("name of the marble is : " + marbleName);
		System.out.println("texture of the marble is : " + texture);
		System.out.println("porosity of the marble is : " + porosity);
		System.out.println("color of the marble is : " + color);
		System.out.println("pattern of the marble is : " + pattern);
	}
}