class GardenRunner{
	public static void main(String[] garden){
		
		System.out.println("main started");
		int gardenArea=Garden.getGardenArea();
		System.out.println("Garden Area is "+gardenArea+" Sq.ft");
		int noOfPlants=Garden.getNoOfPlants();
		System.out.println("The no of plants are "+noOfPlants);
		boolean hasEntryFee=Garden.getHasEntryFee();
		System.out.println("does garden has entry fee? "+hasEntryFee);
		double entryFee=Garden.getEntryFee();
		System.out.println("Entry fee of the garden is "+entryFee+" rs");
		String gardenName=Garden.getGardenName();
		System.out.println("The name of the garden is "+gardenName);
		String timings=Garden.getTimings();
		System.out.println("The timings of the garden is from "+timings);
		System.out.println("main ended");
	}

}