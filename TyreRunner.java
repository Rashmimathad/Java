class TyreRunner{
	public static void main(String[] tyre){
		System.out.println("main started");
		String tyreBrand=Tyre.getTyreBrand();
		System.out.println("The brand name of the tyre is "+tyreBrand);
		String positioning=Tyre.getPositioning();
		System.out.println("Positioning of the tyre is "+positioning);
		int diameter=Tyre.getDiameter();
		System.out.println("Diameter of the tyre is : "+diameter+" inch");
		double weight=Tyre.getWeight();
		System.out.println("Weight of the tyre is : "+weight+" Kg");
		int width=Tyre.getWidth();
		System.out.println("Width of the tyre is : "+width+" mm");
		boolean isTwoWheelerTyre=Tyre.getIsTwoWheelerTyre();
		System.out.println("IS the tyre two wheeler type? "+isTwoWheelerTyre);
		System.out.println("main ended");
	}
}