class TailorRunner{
	public static void main(String[] tailor){
		System.out.println("main started");
		boolean hasSewingSkills=Tailor.getHasSewingSkills();
		System.out.println("Does the tailor has sewing skills? "+hasSewingSkills);
		boolean hasFabricKnowledge=Tailor.getHasFabricKnowledge();
		System.out.println("Does the tailor has fabric knowledge? "+hasFabricKnowledge);
		boolean hasSewingMachine=Tailor.getHasSewingMachine();
		System.out.println("Does the tailor has sewing machine? "+hasSewingMachine);
		String sewingMachineType=Tailor.getSewingMachineType();
		System.out.println("The sewing machine type is "+sewingMachineType);
		boolean hasPatternCuttingSkills=Tailor.getHasPatternCuttingSkills();
		System.out.println("Does the tailor has pattern cutting skills? "+hasPatternCuttingSkills);
		System.out.println("main ended");
	}
}