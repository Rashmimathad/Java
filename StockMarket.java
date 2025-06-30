class StockMarket{
	public static void main(String stock[]){
		String stockNames[]={"Reliance Industries","P & G Hygiene","Colgate-Palmoliv","Glaxosmi. Pharma","Gillette India","Castrol India","Britannia Inds.","Hyundai Motor I","GE Vernova T&D","Nippon Life Ind."};
		System.out.println();
		System.out.println("The stock names of the stock market are : ");
		//System.out.println(stockNames[0]+","+stockNames[1]+","+stockNames[2]+","+stockNames[3]+","+stockNames[4]+","+stockNames[5]+","+stockNames[6]+","+stockNames[7]+","+stockNames[8]+","+stockNames[9]);
		for(String stockName : stockNames){
			System.out.println(stockName);
		}
	}
}