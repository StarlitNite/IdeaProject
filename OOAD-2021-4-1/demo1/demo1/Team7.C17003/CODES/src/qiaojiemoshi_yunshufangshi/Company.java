package qiaojiemoshi_yunshufangshi;

public abstract class Company {
	TransportType transportType;
	
	public void setTransportType(TransportType transportType) {
		this.transportType = transportType;
	}
	public abstract String print();
}
