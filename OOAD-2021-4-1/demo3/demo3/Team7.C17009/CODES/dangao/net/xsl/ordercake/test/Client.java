package net.xsl.ordercake.test;
import net.xsl.ordercake.discount.DiscountStyleThree;
import net.xsl.ordercake.discount.OrderCake;
import net.xsl.ordercake.order.CakeShop;
import net.xsl.ordercake.order.EastVilla;
import net.xsl.ordercake.order.WestVilla;

public class Client {
	public static void main (String arg[]){
		CakeShop starCakeShop = CakeShop.getCakeShop();
		
		new WestVilla(starCakeShop, "草莓水果");		
		starCakeShop.getNewName("西13");
		starCakeShop.notifyCustomer();	
		OrderCake cake = new OrderCake();
		System.out.println("今日促销一律8折优惠");	
		cake.setM(8);
		cake.setStyle(new DiscountStyleThree());
		cake.setPrice(80) ;
		System.out.println("本次订购成功完成，需要支付的金额为"+cake.getMoney(cake.getPrice(),cake.getM())+"，原价80");
		System.out.println("=================================");
		
		new EastVilla(starCakeShop, "甜奶");
		starCakeShop.getNewName("东18");
		starCakeShop.notifyCustomer();	
		System.out.println("=================================");
		
		starCakeShop.getNewName("东12");
		starCakeShop.notifyCustomer();
	}
}
