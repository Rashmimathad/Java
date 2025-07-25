class MarbleRunner{

	public static void main(String marble[]){
	
		System.out.println("main started");
			
			Marble marbleOne = new Marble();
			marbleOne.marbleId = 1;
			marbleOne.marbleName = "Calacatta";
			marbleOne.texture = "Smooth";
			marbleOne.porosity = "Low";
			marbleOne.pattern = "Swirls";
			marbleOne.color = "Peach";
			marbleOne.getMarbleInfo();
			 
			Marble marbleTwo = new Marble();
			marbleTwo.marbleId = 2;
			marbleTwo.marbleName = "Carrara";
			marbleTwo.texture = "Fine";
			marbleTwo.porosity = "Medium";
			marbleTwo.pattern = "Veins";
			marbleTwo.color = "White";
			marbleTwo.getMarbleInfo();

			Marble marbleThree = new Marble();
			marbleThree.marbleId = 3;
			marbleThree.marbleName = "Emperador";
			marbleThree.texture = "Glossy";
			marbleThree.porosity = "Low";
			marbleThree.pattern = "Grains";
			marbleThree.color = "Brown";
			marbleThree.getMarbleInfo();

			Marble marbleFour = new Marble();
			marbleFour.marbleId = 4;
			marbleFour.marbleName = "Statuario";
			marbleFour.texture = "Smooth";
			marbleFour.porosity = "Medium";
			marbleFour.pattern = "Linear Veins";
			marbleFour.color = "White-Grey";
			marbleFour.getMarbleInfo();
			
			Marble marbleFive = new Marble();
			marbleFive.marbleId = 5;
			marbleFive.marbleName = "Makrana";
			marbleFive.texture = "Matte";
			marbleFive.porosity = "Low";
			marbleFive.pattern = "Plain";
			marbleFive.color = "White";
			marbleFive.getMarbleInfo();

			Marble marbleSix = new Marble();
			marbleSix.marbleId = 6;
			marbleSix.marbleName = "Rainforest Brown";
			marbleSix.texture = "Rough";
			marbleSix.porosity = "High";
			marbleSix.pattern = "Tree-like";
			marbleSix.color = "Brown";
			marbleSix.getMarbleInfo();

			Marble marbleSeven = new Marble();
			marbleSeven.marbleId = 7;
			marbleSeven.marbleName = "Nero Marquina";
			marbleSeven.texture = "Polished";
			marbleSeven.porosity = "Medium";
			marbleSeven.pattern = "White Veins";
			marbleSeven.color = "Black";
			marbleSeven.getMarbleInfo();

			Marble marbleEight = new Marble();
			marbleEight.marbleId = 8;
			marbleEight.marbleName = "Crema Marfil";
			marbleEight.texture = "Smooth";
			marbleEight.porosity = "Medium";
			marbleEight.pattern = "Light Veins";
			marbleEight.color = "Beige";
			marbleEight.getMarbleInfo();

			Marble marbleNine = new Marble();
			marbleNine.marbleId = 9;
			marbleNine.marbleName = "Indian Green";
			marbleNine.texture = "Glossy";
			marbleNine.porosity = "Low";
			marbleNine.pattern = "Random";
			marbleNine.color = "Green";
			marbleNine.getMarbleInfo();

			Marble marbleTen = new Marble();
			marbleTen.marbleId = 10;
			marbleTen.marbleName = "Pietra Grey";
			marbleTen.texture = "Polished";
			marbleTen.porosity = "Low";
			marbleTen.pattern = "White Streaks";
			marbleTen.color = "Dark Grey";
			marbleTen.getMarbleInfo();

			Marble marbleEleven = new Marble();
			marbleEleven.marbleId = 11;
			marbleEleven.marbleName = "Thassos White";
			marbleEleven.texture = "Crystal-like";
			marbleEleven.porosity = "Very Low";
			marbleEleven.pattern = "Plain";
			marbleEleven.color = "Bright White";
			marbleEleven.getMarbleInfo();

			Marble marbleTwelve = new Marble();
			marbleTwelve.marbleId = 12;
			marbleTwelve.marbleName = "Dark Emperador";
			marbleTwelve.texture = "Polished";
			marbleTwelve.porosity = "Medium";
			marbleTwelve.pattern = "Spider Veins";
			marbleTwelve.color = "Dark Brown";
			marbleTwelve.getMarbleInfo();

			Marble marbleThirteen = new Marble();
			marbleThirteen.marbleId = 13;
			marbleThirteen.marbleName = "Botticino";
			marbleThirteen.texture = "Smooth";
			marbleThirteen.porosity = "Low";
			marbleThirteen.pattern = "Cloudy";
			marbleThirteen.color = "Cream";
			marbleThirteen.getMarbleInfo();

			Marble marbleFourteen = new Marble();
			marbleFourteen.marbleId = 14;
			marbleFourteen.marbleName = "Spider Green";
			marbleFourteen.texture = "Rough";
			marbleFourteen.porosity = "High";
			marbleFourteen.pattern = "Web Veins";
			marbleFourteen.color = "Dark Green";
			marbleFourteen.getMarbleInfo();

			Marble marbleFifteen = new Marble();
			marbleFifteen.marbleId = 15;
			marbleFifteen.marbleName = "Volakas";
			marbleFifteen.texture = "Polished";
			marbleFifteen.porosity = "Medium";
			marbleFifteen.pattern = "Diagonal Veins";
			marbleFifteen.color = "White-Grey";
			marbleFifteen.getMarbleInfo();

			Marble marbleSixteen = new Marble();
			marbleSixteen.marbleId = 16;
			marbleSixteen.marbleName = "Mystery White";
			marbleSixteen.texture = "Soft";
			marbleSixteen.porosity = "Low";
			marbleSixteen.pattern = "Faint Veins";
			marbleSixteen.color = "Off White";
			marbleSixteen.getMarbleInfo();

			Marble marbleSeventeen = new Marble();
			marbleSeventeen.marbleId = 17;
			marbleSeventeen.marbleName = "Rosso Levanto";
			marbleSeventeen.texture = "Glossy";
			marbleSeventeen.porosity = "Medium";
			marbleSeventeen.pattern = "White Veins";
			marbleSeventeen.color = "Red-Brown";
			marbleSeventeen.getMarbleInfo();

			Marble marbleEighteen = new Marble();
			marbleEighteen.marbleId = 18;
			marbleEighteen.marbleName = "Golden Spider";
			marbleEighteen.texture = "Polished";
			marbleEighteen.porosity = "High";
			marbleEighteen.pattern = "Golden Veins";
			marbleEighteen.color = "Ivory";
			marbleEighteen.getMarbleInfo();

			Marble marbleNineteen = new Marble();
			marbleNineteen.marbleId = 19;
			marbleNineteen.marbleName = "Pink Marble";
			marbleNineteen.texture = "Smooth";
			marbleNineteen.porosity = "Low";
			marbleNineteen.pattern = "Wavy";
			marbleNineteen.color = "Pink";
			marbleNineteen.getMarbleInfo();

			Marble marbleTwenty = new Marble();
			marbleTwenty.marbleId = 20;
			marbleTwenty.marbleName = "Black Marquina";
			marbleTwenty.texture = "High Gloss";
			marbleTwenty.porosity = "Low";
			marbleTwenty.pattern = "Sharp Veins";
			marbleTwenty.color = "Jet Black";
			marbleTwenty.getMarbleInfo();

		System.out.println("main ended");	
		}

}