package net.xsl.ordercake.discount;

public class OrderCake {
	double money,price;//money是打折后的最终价格，price是原价
	DiscountStyle style;
	double m;
	
	public double getMoney(double price,double m){
		return style.disCount(price,m); 
	}
	
	public void setPrice(double price){
		this.price = price ;		
	}
	
	public double getPrice(){
		return price;
	}

	public void setStyle(DiscountStyle style){
		this.style = style ;
	}
	
	public DiscountStyle getStyle(){
		return style;
	}
	
	public void setM(double m){
		this.m = m ;
	}
	
	public double getM(){
		return m;
	}
}
