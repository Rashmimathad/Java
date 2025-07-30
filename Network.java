class Network{
	int networkId;
	String networkName;
	String topology;
	String securityType;
	int bandwidth;
	boolean isWireless;
	
	Network(){
		System.out.println();
		System.out.println("Network constructor without parameters loaded");
	}
	
	Network(int networkId,String networkName){
		System.out.println();
		System.out.println("Network constructor with(int,String) parameters loaded");
		this.networkId=networkId;
		this.networkName=networkName;
	}
	
	Network(String topology,String securityType){
		System.out.println();
		System.out.println("Network constructor with(String,String) parameters loaded");
		this.topology=topology;
		this.securityType=securityType;
	}
	
	Network(int bandwidth,boolean isWireless){
		System.out.println();
		System.out.println("Network constructor with(int,boolean) parameters loaded");
		this.bandwidth=bandwidth;
		this.isWireless=isWireless;
	}
	
	Network(int networkId,String networkName,String topology,String securityType,int bandwidth,boolean isWireless){
		System.out.println();
		System.out.println("Network constructor with parameters loaded");
		this.networkId=networkId;
		this.networkName=networkName;
		this.topology=topology;
		this.securityType=securityType;
		this.bandwidth=bandwidth;
		this.isWireless=isWireless;
	}
	
	public void getNetworkInfo(){
		System.out.println("network  details : ");
		System.out.println("id of network is : "+networkId);
		System.out.println("name of the network is : "+networkName);
		System.out.println("topology of the network is : "+topology);
		System.out.println("security type of the network is : "+securityType);
		System.out.println("bandwidth of the network : "+bandwidth);
		System.out.println("is network wireless? "+isWireless);
	}
}