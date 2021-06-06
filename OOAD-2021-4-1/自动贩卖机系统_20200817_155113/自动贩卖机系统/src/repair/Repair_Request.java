package repair;
public class Repair_Request
{
	private int Degree_fault;
	
	public Repair_Request(int Degree_fault)
	{
		this.Degree_fault=Degree_fault;
	}
	

	public void setLeaveDays(int Degree_fault) {
		this.Degree_fault = Degree_fault; 
	}


	public int getLeaveDays() {
		return (this.Degree_fault); 
	}	
}