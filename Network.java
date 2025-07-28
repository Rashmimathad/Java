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