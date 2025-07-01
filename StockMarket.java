class StockMarket{
	/*static String relianceIndustries="Reliance Industries";
	static String hygiene="P & G Hygiene";
	static String colgate="Colgate-Palmoliv";
	static String glasmoxi="Glaxosmi Pharma";
	static String gillette="Gillette India";
	static String castrol="Castrol India";
	static String britannia="Britannia Inds.";
	static String hyundai="Hyundai Motor I";
	static String verona="GE Vernova T&D";
	static String nippon="Nippon Life Ind.";*/
	public static void main(String stock[]){
			System.out.println("main started");
			String relianceIndustries="Reliance Industries";
			String hygiene="P & G Hygiene";
			String colgate="Colgate-Palmoliv";
			String glasmoxi="Glaxosmi Pharma";
			String gillette="Gillette India";
			String castrol="Castrol India";
			String britannia="Britannia Inds.";
			String hyundai="Hyundai Motor I";
			String verona="GE Vernova T&D";
			String nippon="Nippon Life Ind.";
			
		String stockNames[]={"Reliance Industries","P & G Hygiene","Colgate-Palmoliv","Glaxosmi Pharma","Gillette India","Castrol India","Britannia Inds.","Hyundai Motor I","GE Vernova T&D","Nippon Life Ind."};
		System.out.println("The stock names of the stock market are : ");
		//System.out.println(stockNames[0]+","+stockNames[1]+","+stockNames[2]+","+stockNames[3]+","+stockNames[4]+","+stockNames[5]+","+stockNames[6]+","+stockNames[7]+","+stockNames[8]+","+stockNames[9]);
		for(String stockName : stockNames){
			System.out.println(stockName);
		}
				System.out.println("main ended");
	}
}