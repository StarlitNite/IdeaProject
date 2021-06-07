package net.xsl.ordercake.order;

public interface Shop {
	public void addCustomer(Customer o);
	public void deleteCustomer(Customer o);
	public void notifyCustomer();
}
