class RadioRunner{

	public static void main(String[] radio){
		System.out.println("main started");
		String batteryLife=Radio.getBatteryLife();
		System.out.println("The battery life of the radio is "+batteryLife);
		int weight=Radio.getWeight();
		System.out.println("The weight of the radio is "+weight+" g");
		double customerRating=Radio.getCustomerRating();
		System.out.println("The customer rating of the radio is "+customerRating);
		boolean isWaterProof=Radio.getIsWaterProof();
		System.out.println("Is the Radio waterproof? "+isWaterProof);
		int voltage=Radio.getVoltageLevel();
		System.out.println("The voltage level of the radio is "+voltage+" volts");
		String radioType=Radio.getRadioType();
		System.out.println("The type of the radio is "+radioType);
		System.out.println("main ended");
	}
}