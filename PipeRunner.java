class PipeRunner{
	public static void main(String[] pipe){
		System.out.println("main started");
			Pipe pipeOne=new Pipe(1,"PVC",3,30,"Green",300.00);
			/*pipeOne.pipeId=1;
			pipeOne.pipeMaterial="PVC";
			pipeOne.length=3;
			pipeOne.flowRate=30;
			pipeOne.color="Green";
			pipeOne.cost=300.0;*/
			pipeOne.getPipeInfo();
			
			Pipe pipeTwo = new Pipe(2,"Copper",2,50,"Brown",850.00);
			/*pipeTwo.pipeId = 2;
			pipeTwo.pipeMaterial = "Copper";
			pipeTwo.length = 2;
			pipeTwo.flowRate = 50;
			pipeTwo.color = "Brown";
			pipeTwo.cost = 850.0;*/
			pipeTwo.getPipeInfo();

			Pipe pipeThree = new Pipe(3,"Steel",5,70,"Silver",1200.00);
			/*pipeThree.pipeId = 3;
			pipeThree.pipeMaterial = "Steel";
			pipeThree.length = 5;
			pipeThree.flowRate = 70;
			pipeThree.color = "Silver";
			pipeThree.cost = 1200.0;*/
			pipeThree.getPipeInfo();

			Pipe pipeFour = new Pipe(4,"Iron",4,40,"Black",950.00);
			/*pipeFour.pipeId = 4;
			pipeFour.pipeMaterial = "Iron";
			pipeFour.length = 4;
			pipeFour.flowRate = 40;
			pipeFour.color = "Black";
			pipeFour.cost = 950.0;*/
			pipeFour.getPipeInfo();
			
			Pipe pipeFive = new Pipe(5,"HDPE",6,60,"Blue",1100.00);
			/*pipeFive.pipeId = 5;
			pipeFive.pipeMaterial = "HDPE";
			pipeFive.length = 6;
			pipeFive.flowRate = 60;
			pipeFive.color = "Blue";
			pipeFive.cost = 1100.0;*/
			pipeFive.getPipeInfo();

			Pipe pipeSix = new Pipe(6,"Concrete",8,80,"Grey",1600.00);
			/*pipeSix.pipeId = 6;
			pipeSix.pipeMaterial = "Concrete";
			pipeSix.length = 8;
			pipeSix.flowRate = 80;
			pipeSix.color = "Grey";
			pipeSix.cost = 1600.0;*/
			pipeSix.getPipeInfo();

			Pipe pipeSeven = new Pipe(7,"Glass",2,25,"Transparent",700.00);
			/*pipeSeven.pipeId = 7;
			pipeSeven.pipeMaterial = "Glass";
			pipeSeven.length = 2;
			pipeSeven.flowRate = 25;
			pipeSeven.color = "Transparent";
			pipeSeven.cost = 700.0;*/
			pipeSeven.getPipeInfo();

			Pipe pipeEight = new Pipe(8,"Rubber",3,35,"Black",400.00);
			/*pipeEight.pipeId = 8;
			pipeEight.pipeMaterial = "Rubber";
			pipeEight.length = 3;
			pipeEight.flowRate = 35;
			pipeEight.color = "Black";
			pipeEight.cost = 400.0;*/
			pipeEight.getPipeInfo();

			Pipe pipeNine = new Pipe(9,"Aluminum",6,65,"Silver",1300.00);
			/*pipeNine.pipeId = 9;
			pipeNine.pipeMaterial = "Aluminum";
			pipeNine.length = 6;
			pipeNine.flowRate = 65;
			pipeNine.color = "Silver";
			pipeNine.cost = 1300.0;*/
			pipeNine.getPipeInfo();

			Pipe pipeTen = new Pipe(10,"Brass",5,55,"Gold",1400.00);
			/*pipeTen.pipeId = 10;
			pipeTen.pipeMaterial = "Brass";
			pipeTen.length = 5;
			pipeTen.flowRate = 55;
			pipeTen.color = "Gold";
			pipeTen.cost = 1400.0;*/
			pipeTen.getPipeInfo();

			Pipe pipeEleven = new Pipe(11,"Fiber",4,45,"White",1000.00);
			/*pipeEleven.pipeId = 11;
			pipeEleven.pipeMaterial = "Fiber";
			pipeEleven.length = 4;
			pipeEleven.flowRate = 45;
			pipeEleven.color = "White";
			pipeEleven.cost = 1000.0;*/
			pipeEleven.getPipeInfo();

			Pipe pipeTwelve = new Pipe(12,"Plastic",3,40,"Blue",500.00);
			/*pipeTwelve.pipeId = 12;
			pipeTwelve.pipeMaterial = "Plastic";
			pipeTwelve.length = 3;
			pipeTwelve.flowRate = 40;
			pipeTwelve.color = "Blue";
			pipeTwelve.cost = 500.0;*/
			pipeTwelve.getPipeInfo();

			Pipe pipeThirteen = new Pipe(13,"Carbon Steel",6,75,"Dark Grey",1350.00);
			/*pipeThirteen.pipeId = 13;
			pipeThirteen.pipeMaterial = "Carbon Steel";
			pipeThirteen.length = 6;
			pipeThirteen.flowRate = 75;
			pipeThirteen.color = "Dark Grey";
			pipeThirteen.cost = 1350.0;*/
			pipeThirteen.getPipeInfo();

			Pipe pipeFourteen = new Pipe(14,"Lead",2,20,"Dull Grey",950.00);
			/*pipeFourteen.pipeId = 14;
			pipeFourteen.pipeMaterial = "Lead";
			pipeFourteen.length = 2;
			pipeFourteen.flowRate = 20;
			pipeFourteen.color = "Dull Grey";
			pipeFourteen.cost = 950.0;*/
			pipeFourteen.getPipeInfo();

			Pipe pipeFifteen = new Pipe(15,"Acrylic",5,60,"Red",900.00);
			/*pipeFifteen.pipeId = 15;
			pipeFifteen.pipeMaterial = "Acrylic";
			pipeFifteen.length = 5;
			pipeFifteen.flowRate = 60;
			pipeFifteen.color = "Red";
			pipeFifteen.cost = 900.0;*/
			pipeFifteen.getPipeInfo();

			Pipe pipeSixteen = new Pipe(16,"Steel Alloy",7,85,"Chrome",1700.00);
			/*pipeSixteen.pipeId = 16;
			pipeSixteen.pipeMaterial = "Steel Alloy";
			pipeSixteen.length = 7;
			pipeSixteen.flowRate = 85;
			pipeSixteen.color = "Chrome";
			pipeSixteen.cost = 1700.0;*/
			pipeSixteen.getPipeInfo();

			Pipe pipeSeventeen = new Pipe(17,"Ceramic",4,35,"Beige",800.00);
			/*pipeSeventeen.pipeId = 17;
			pipeSeventeen.pipeMaterial = "Ceramic";
			pipeSeventeen.length = 4;
			pipeSeventeen.flowRate = 35;
			pipeSeventeen.color = "Beige";
			pipeSeventeen.cost = 800.0;*/
			pipeSeventeen.getPipeInfo();

			Pipe pipeEighteen = new Pipe(18,"Teflan",3,32,"White",950.00);
			/*pipeEighteen.pipeId = 18;
			pipeEighteen.pipeMaterial = "Teflon";
			pipeEighteen.length = 3;
			pipeEighteen.flowRate = 32;
			pipeEighteen.color = "White";
			pipeEighteen.cost = 950.0;*/
			pipeEighteen.getPipeInfo();

			Pipe pipeNineteen = new Pipe(19,"Polypropylene",5,48,"Yellow",870.00);
			/*pipeNineteen.pipeId = 19;
			pipeNineteen.pipeMaterial = "Polypropylene";
			pipeNineteen.length = 5;
			pipeNineteen.flowRate = 48;
			pipeNineteen.color = "Yellow";
			pipeNineteen.cost = 870.0;*/
			pipeNineteen.getPipeInfo();

			Pipe pipeTwenty = new Pipe(20,"Bronze",6,68,"Bronze",1450.00);
			/*pipeTwenty.pipeId = 20;
			pipeTwenty.pipeMaterial = "Bronze";
			pipeTwenty.length = 6;
			pipeTwenty.flowRate = 68;
			pipeTwenty.color = "Bronze";
			pipeTwenty.cost = 1450.0;*/
			pipeTwenty.getPipeInfo();

		System.out.println("main ended");
	}

}