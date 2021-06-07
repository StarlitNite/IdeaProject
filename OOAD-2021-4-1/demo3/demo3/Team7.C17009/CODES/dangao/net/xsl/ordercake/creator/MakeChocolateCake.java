package net.xsl.ordercake.creator;
import net.xsl.ordercake.product.ChocolateFactory;

public class MakeChocolateCake implements MakeCake{
	private String cakeType;
	
	public MakeChocolateCake(String cakeType){
		this.cakeType = cakeType;
	}
	
	public ChocolateFactory makeChocolateCake(){
		return new ChocolateFactory(cakeType);
}
}
