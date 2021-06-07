package net.xsl.ordercake.discount;

public class DiscountStyleThree implements DiscountStyle{
public double disCount(double price,double m) {
	price = price * m/10;
	return price;
}
}
