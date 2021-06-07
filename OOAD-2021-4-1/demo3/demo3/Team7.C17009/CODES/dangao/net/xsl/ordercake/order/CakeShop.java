package net.xsl.ordercake.order;

import java.util.ArrayList;

public class CakeShop implements Shop{	
String name;
boolean changed;
ArrayList<Customer>personList;
	private int i = 0;
private static CakeShop uniqueCakeShop;

	private CakeShop() {
		uniqueCakeShop = this;
		personList = new ArrayList<Customer>();
		name = "";
		changed = false;
	}
	
	public static synchronized CakeShop getCakeShop(){
		if(uniqueCakeShop == null){
			uniqueCakeShop = new CakeShop();
		}		
		return uniqueCakeShop;	
	}		

	public void addCustomer(Customer o) {
		if(!(personList.contains(o)))
			personList.add(o);
	}
	
	public void deleteCustomer(Customer o) {
		if((personList.contains(o)))
			personList.remove(o);
	}
	
	public void notifyCustomer() {		
		if(changed){			
			try{
				Customer customer = personList.get(i);
				customer.orderCake(name);			
				i++;
				changed = false;
			}
			catch(Exception e){
				System.out.println("没有新的订购信息");
			}
		}		
	}
	
	public void getNewName(String str){
		if(str.equals(name))
			changed = false;
		else{
			name = str;
			changed = true;
		}
	}
}
