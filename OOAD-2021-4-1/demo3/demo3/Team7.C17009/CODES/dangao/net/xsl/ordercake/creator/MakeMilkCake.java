package net.xsl.ordercake.creator;
import net.xsl.ordercake.product.MilkFactory;

public class MakeMilkCake implements MakeCake{
private String cakeType;

public MakeMilkCake(String cakeType){
	this.cakeType = cakeType;
}
	
public MilkFactory makeMilkCake(){
return new MilkFactory(cakeType);
}
}
