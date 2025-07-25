class PoliticianRunner{

	public static void main(String[] politician){
	System.out.println("main started");
	
		Politician politicianOne=new Politician();
		politicianOne.politicianId=1;
		politicianOne.politicianName="Narendra Modi";
		politicianOne.dateOfBirth="14/10/1935";
		politicianOne.gender='M';
		politicianOne.politicalParty="BJP";
		politicianOne.position="Prime Minister";
		politicianOne.termStarted="2019";
		politicianOne.getPoliticianInfo();
			
		Politician politicianTwo = new Politician();
		politicianTwo.politicianId = 2;
		politicianTwo.politicianName = "Rahul Gandhi";
		politicianTwo.dateOfBirth = "19/06/1970";
		politicianTwo.gender = 'M';
		politicianTwo.politicalParty = "INC";
		politicianTwo.position = "MP, Wayanad";
		politicianTwo.termStarted = "2019";
		politicianTwo.getPoliticianInfo();

		Politician politicianThree = new Politician();
		politicianThree.politicianId = 3;
		politicianThree.politicianName = "Mamata Banerjee";
		politicianThree.dateOfBirth = "05/01/1955";
		politicianThree.gender = 'F';
		politicianThree.politicalParty = "TMC";
		politicianThree.position = "Chief Minister of West Bengal";
		politicianThree.termStarted = "2011";
		politicianThree.getPoliticianInfo();

		Politician politicianFour = new Politician();
		politicianFour.politicianId = 4;
		politicianFour.politicianName = "Arvind Kejriwal";
		politicianFour.dateOfBirth = "16/08/1968";
		politicianFour.gender = 'M';
		politicianFour.politicalParty = "AAP";
		politicianFour.position = "Chief Minister of Delhi";
		politicianFour.termStarted = "2015";
		politicianFour.getPoliticianInfo();

		Politician politicianFive = new Politician();
		politicianFive.politicianId = 5;
		politicianFive.politicianName = "K. Chandrashekar Rao";
		politicianFive.dateOfBirth = "17/02/1954";
		politicianFive.gender = 'M';
		politicianFive.politicalParty = "BRS";
		politicianFive.position = "Former Chief Minister of Telangana";
		politicianFive.termStarted = "2014";
		politicianFive.getPoliticianInfo();

		Politician politicianSix = new Politician();
		politicianSix.politicianId = 6;
		politicianSix.politicianName = "Yogi Adityanath";
		politicianSix.dateOfBirth = "05/06/1972";
		politicianSix.gender = 'M';
		politicianSix.politicalParty = "BJP";
		politicianSix.position = "Chief Minister of Uttar Pradesh";
		politicianSix.termStarted = "2017";
		politicianSix.getPoliticianInfo();

		Politician politicianSeven = new Politician();
		politicianSeven.politicianId = 7;
		politicianSeven.politicianName = "Sonia Gandhi";
		politicianSeven.dateOfBirth = "09/12/1946";
		politicianSeven.gender = 'F';
		politicianSeven.politicalParty = "INC";
		politicianSeven.position = "Former President of INC";
		politicianSeven.termStarted = "1998";
		politicianSeven.getPoliticianInfo();

		Politician politicianEight = new Politician();
		politicianEight.politicianId = 8;
		politicianEight.politicianName = "Nitish Kumar";
		politicianEight.dateOfBirth = "01/03/1951";
		politicianEight.gender = 'M';
		politicianEight.politicalParty = "JD(U)";
		politicianEight.position = "Chief Minister of Bihar";
		politicianEight.termStarted = "2005";
		politicianEight.getPoliticianInfo();

		Politician politicianNine = new Politician();
		politicianNine.politicianId = 9;
		politicianNine.politicianName = "Pinarayi Vijayan";
		politicianNine.dateOfBirth = "24/05/1945";
		politicianNine.gender = 'M';
		politicianNine.politicalParty = "CPI(M)";
		politicianNine.position = "Chief Minister of Kerala";
		politicianNine.termStarted = "2016";
		politicianNine.getPoliticianInfo();

		Politician politicianTen = new Politician();
		politicianTen.politicianId = 10;
		politicianTen.politicianName = "MK Stalin";
		politicianTen.dateOfBirth = "01/03/1953";
		politicianTen.gender = 'M';
		politicianTen.politicalParty = "DMK";
		politicianTen.position = "Chief Minister of Tamil Nadu";
		politicianTen.termStarted = "2021";
		politicianTen.getPoliticianInfo();
		
		Politician politicianEleven = new Politician();
		politicianEleven.politicianId = 11;
		politicianEleven.politicianName = "Arvind Kejriwal";
		politicianEleven.dateOfBirth = "16/08/1968";
		politicianEleven.gender = 'M';
		politicianEleven.politicalParty = "AAP";
		politicianEleven.position = "Chief Minister of Delhi";
		politicianEleven.termStarted = "2015";
		politicianEleven.getPoliticianInfo();

		Politician politicianTwelve = new Politician();
		politicianTwelve.politicianId = 12;
		politicianTwelve.politicianName = "Rahul Gandhi";
		politicianTwelve.dateOfBirth = "19/06/1970";
		politicianTwelve.gender = 'M';
		politicianTwelve.politicalParty = "INC";
		politicianTwelve.position = "Member of Parliament";
		politicianTwelve.termStarted = "2004";
		politicianTwelve.getPoliticianInfo();

		Politician politicianThirteen = new Politician();
		politicianThirteen.politicianId = 13;
		politicianThirteen.politicianName = "Amit Shah";
		politicianThirteen.dateOfBirth = "22/10/1964";
		politicianThirteen.gender = 'M';
		politicianThirteen.politicalParty = "BJP";
		politicianThirteen.position = "Home Minister of India";
		politicianThirteen.termStarted = "2019";
		politicianThirteen.getPoliticianInfo();

		Politician politicianFourteen = new Politician();
		politicianFourteen.politicianId = 14;
		politicianFourteen.politicianName = "Smriti Irani";
		politicianFourteen.dateOfBirth = "23/03/1976";
		politicianFourteen.gender = 'F';
		politicianFourteen.politicalParty = "BJP";
		politicianFourteen.position = "Minister of Women and Child Development";
		politicianFourteen.termStarted = "2019";
		politicianFourteen.getPoliticianInfo();

		Politician politicianFifteen = new Politician();
		politicianFifteen.politicianId = 15;
		politicianFifteen.politicianName = "Sharad Pawar";
		politicianFifteen.dateOfBirth = "12/12/1940";
		politicianFifteen.gender = 'M';
		politicianFifteen.politicalParty = "NCP";
		politicianFifteen.position = "Founder of NCP";
		politicianFifteen.termStarted = "1999";
		politicianFifteen.getPoliticianInfo();

		Politician politicianSixteen = new Politician();
		politicianSixteen.politicianId = 16;
		politicianSixteen.politicianName = "Mamata Banerjee";
		politicianSixteen.dateOfBirth = "05/01/1955";
		politicianSixteen.gender = 'F';
		politicianSixteen.politicalParty = "TMC";
		politicianSixteen.position = "Chief Minister of West Bengal";
		politicianSixteen.termStarted = "2011";
		politicianSixteen.getPoliticianInfo();

		Politician politicianSeventeen = new Politician();
		politicianSeventeen.politicianId = 17;
		politicianSeventeen.politicianName = "K. Chandrashekar Rao";
		politicianSeventeen.dateOfBirth = "17/02/1954";
		politicianSeventeen.gender = 'M';
		politicianSeventeen.politicalParty = "BRS";
		politicianSeventeen.position = "Former CM of Telangana";
		politicianSeventeen.termStarted = "2014";
		politicianSeventeen.getPoliticianInfo();

		Politician politicianEighteen = new Politician();
		politicianEighteen.politicianId = 18;
		politicianEighteen.politicianName = "Bhupesh Baghel";
		politicianEighteen.dateOfBirth = "23/08/1961";
		politicianEighteen.gender = 'M';
		politicianEighteen.politicalParty = "INC";
		politicianEighteen.position = "Former Chief Minister of Chhattisgarh";
		politicianEighteen.termStarted = "2018";
		politicianEighteen.getPoliticianInfo();

		Politician politicianNineteen = new Politician();
		politicianNineteen.politicianId = 19;
		politicianNineteen.politicianName = "Hemant Soren";
		politicianNineteen.dateOfBirth = "10/08/1975";
		politicianNineteen.gender = 'M';
		politicianNineteen.politicalParty = "JMM";
		politicianNineteen.position = "Former Chief Minister of Jharkhand";
		politicianNineteen.termStarted = "2019";
		politicianNineteen.getPoliticianInfo();

		Politician politicianTwenty = new Politician();
		politicianTwenty.politicianId = 20;
		politicianTwenty.politicianName = "Tejashwi Yadav";
		politicianTwenty.dateOfBirth = "09/11/1989";
		politicianTwenty.gender = 'M';
		politicianTwenty.politicalParty = "RJD";
		politicianTwenty.position = "Former Deputy CM of Bihar";
		politicianTwenty.termStarted = "2015";
		politicianTwenty.getPoliticianInfo();

	System.out.println("main ended");
	}

}