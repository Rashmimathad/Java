class DisneyLandRunner{

	public static void main(String[] disneyland){
		System.out.println("main started");
		String parkType=DisneyLand.getParkType();
		System.out.println("The park type of disneyland is "+parkType);
		int noOfBranches=DisneyLand.getNoOfBranches();
		System.out.println("No of bramches of disneyland are "+noOfBranches);
		String owner=DisneyLand.getOwner();
		System.out.println("The owner of disneyland is "+owner);
		int disneyLandArea=DisneyLand.getDisneyLandArea();
		System.out.println("The area which disneyland occupies is "+disneyLandArea+" acres");
		boolean hasTicketPrice=DisneyLand.getHasTicketPrice();
		System.out.println("Does disneyLand has ticket price? "+hasTicketPrice);
		int ticketPrice=DisneyLand.getTicketPrice();
		System.out.println("The ticket price of disney land is $"+ticketPrice+" for one day visit");
		System.out.println("main ended");
	}
}