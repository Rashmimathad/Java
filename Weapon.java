class Weapon{
	int weaponId;
	String weaponName;
	String weaponMaterial;
	double price;
	int manufacturedYear;
	int range;
	
	public void getWeaponInfo(){
		System.out.println();
		System.out.println(" weapon details :");
		System.out.println("id of weapon is : "+weaponId);
		System.out.println("name of the weapon is : "+weaponName);
		System.out.println("material of the weapon is : "+weaponMaterial);
		System.out.println("price of the weapon is  : "+price);
		System.out.println("manufactured year of the weapon is : "+manufacturedYear);
		System.out.println("range of the weapon is : "+range+" m");
	}

}