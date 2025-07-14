class Country{
	
	public static int getCountryCode(String countryName){
		
		int countryCode=0;
		
		if(countryName=="India")
				countryCode=91;
		else if(countryName=="Australia")
			countryCode=61;
		else if(countryName=="Iran")
			countryCode=98;
		else if(countryName=="Canada")
			countryCode=1;
		else if(countryName=="Argentina")
			countryCode=54;
		else if(countryName=="Bulgaria")
			countryCode=359;
		else if(countryName=="Cambodia")
			countryCode=855;
		else if(countryName=="Finland")
			countryCode=358;
		else if(countryName=="Maldives")
			countryCode=960;
		else if(countryName=="Mauritius")
			countryCode=230;
		else if(countryName=="Bangladesh")
			countryCode=880;
		else if(countryName=="Belgium")
			countryCode=32;
		else if(countryName=="China")
			countryCode=86;
		else if(countryName=="Colombia")
			countryCode=57;
		else if(countryName=="Cuba")
			countryCode=53;
		else if(countryName=="Denmark")
			countryCode=45;
		else if(countryName=="Egypt")
			countryCode=20;
		else if(countryName=="Georgia")
			countryCode=995;
		else if(countryName=="Germany")
			countryCode=49;
		else if(countryName=="Greece")
			countryCode=30;
		else if(countryName=="Hong Kong")
			countryCode=852;
		else if(countryName=="Indonesia")
			countryCode=62;
		else if(countryName=="Iraq")
			countryCode=964;
		else if(countryName=="Italy")
			countryCode=39;
		else if(countryName=="Japan")
			countryCode=81;
		else if(countryName=="Kenya")
			countryCode=254;
		else if(countryName=="Kuwait")
			countryCode=965;
		else if(countryName=="Libya")
			countryCode=218;
		else if(countryName=="Macau")
			countryCode=853;
		else if(countryName=="Madagascar")
			countryCode=261;
		else if(countryName=="Mexico")
			countryCode=52;
		else if(countryName=="Mongolia")
			countryCode=976;
		else if(countryName=="Namibia")
			countryCode=264;
		else if(countryName=="Nepal")
			countryCode=977;
		else if(countryName=="Netherlands")
			countryCode=31;
		else if(countryName=="New Zealand")
			countryCode=64;
		else if(countryName=="Paraguay")
			countryCode=595;
		else if(countryName=="Portugal")
			countryCode=351;
		else if(countryName=="Romania")
			countryCode=40;
		else if(countryName=="Russia")
			countryCode=7;
		else if(countryName=="Saudi Arabia")
			countryCode=966;
		else if(countryName=="Qatar")
			countryCode=974;
		else if(countryName=="Serbia")
			countryCode=381;
		else if(countryName=="South Africa")
			countryCode=27;
		else if(countryName=="Spain")
			countryCode=34;
		else if(countryName=="Sweden")
			countryCode=46;
		else if(countryName=="Switzerland")
			countryCode=41;
		else if(countryName=="Turkey")
			countryCode=90;
		else if(countryName=="Vietnam")
			countryCode=84;
		else if(countryName=="Zimbabwe")
			countryCode=263;
		else 
			System.out.println(countryName+" is Invalid");
		
		return countryCode;
	}
}