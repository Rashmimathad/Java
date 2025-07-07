class CoolerRunner{

	public static void main(String[] cooler){
	
		System.out.println("main started");
		Cooler.onOrOff();
		Cooler.increaseSpeed();
		Cooler.increaseSpeed();
		Cooler.onOrOff();
		Cooler.increaseSpeed();
		Cooler.onOrOff();
		Cooler.increaseSpeed();
		Cooler.decreaseSpeed();
		Cooler.decreaseSpeed();
		Cooler.onOrOff();
		Cooler.decreaseSpeed();
		Cooler.onOrOff();
		Cooler.decreaseSpeed();
		Cooler.decreaseSpeed();
		System.out.println("main ended");
	}
}