class WaterBallRunner{
	public static void main(String waterBall[]){
		System.out.println("main started");
		System.out.println();
			
			System.out.println("Instance one created");
			WaterBall waterBallOne = new WaterBall(1,"Oval");
			waterBallOne.getWaterBallDetails();
			System.out.println("Instance one ended");
			System.out.println();
			
			System.out.println("Instance two created");
			WaterBall waterBallTwo = new WaterBall("Blue", "Medium",true);
			waterBallTwo.getWaterBallDetails();
			System.out.println("Instance two ended");
			System.out.println();
			
			System.out.println("Instance three created");
			WaterBall waterBallThree = new WaterBall("Round",false);
			waterBallThree.getWaterBallDetails();
			System.out.println("Instance three ended");
			System.out.println();
			
			System.out.println("Instance four created");
			WaterBall waterBallFour = new WaterBall(3,"Spherical","Pink","Large",true,true);
			waterBallFour.getWaterBallDetails();
			System.out.println("Instance four ended");
			System.out.println();
			
			System.out.println("Instance five created");
			WaterBall waterBallFive = new WaterBall("Oval","Balck");
			waterBallFive.getWaterBallDetails();
			System.out.println("Instance five ended");
			System.out.println();
			
			System.out.println("Instance six created");
			WaterBall waterBallSix = new WaterBall("Small",false,false);
			waterBallSix.getWaterBallDetails();
			System.out.println("Instance six ended");
			System.out.println();
			
			System.out.println("Instance seven created");
			WaterBall waterBallSeven = new WaterBall();
			waterBallSeven.getWaterBallDetails();
			System.out.println("Instance seven ended");
			
		System.out.println();
		System.out.println("main ended");
	}
}