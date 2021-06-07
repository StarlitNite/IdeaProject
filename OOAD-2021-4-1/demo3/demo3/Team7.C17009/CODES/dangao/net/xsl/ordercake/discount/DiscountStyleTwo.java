package net.xsl.ordercake.discount;

public class DiscountStyleTwo implements DiscountStyle{
public double disCount(double price,double m) {
	price = price - m;
	return price;
}
}
