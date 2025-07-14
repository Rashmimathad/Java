class HackerRunner{
	public static void main(String[] hacker){
		System.out.println("main started");
		String technicalSkillsRequired=Hacker.getTechnicalSkillsRequired();
		System.out.println("Technical skills required for the hacker are : "+technicalSkillsRequired);
		int typesOfHackers=Hacker.getTypesOfHackers();
		System.out.println("The  no of types of hackers are "+typesOfHackers);
		int noOfHackingTechniques=Hacker.getNoOfHackingTechniques();
		System.out.println("The no of hacking techniques are "+noOfHackingTechniques);
		boolean hasProblemSolvingSkill=Hacker.getHasProblemSolvingSkill();
		System.out.println("does hacker has problem solving skill? "+hasProblemSolvingSkill);
		boolean hasTechnicalProficiency=Hacker.getHasTechnicalProficiency();
		System.out.println("Does hacker has technical proficiency? "+hasTechnicalProficiency);
		System.out.println("main ended");

	}

}