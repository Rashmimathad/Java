class RiverRunner{
	public static void main(String[] river){
		System.out.println("main started");
		String riverName=River.getRiverName();
		System.out.println("The name of the river is "+riverName);
		String riverOrigin=River.getRiverOrigin();
		System.out.println("The origin of the river is "+riverOrigin);
		int flowLength=River.getFlowLength();
		System.out.println("The length of the river is "+flowLength+" Km");
		double phRange=River.getPhRange();
		System.out.println("The Ph Range of the river is "+phRange);
		boolean hasMedicinalProperties=River.getHasMedicinalProperties();
		System.out.println("does the river has medicinal properties? "+hasMedicinalProperties);
		System.out.println("main ended");
	}
}