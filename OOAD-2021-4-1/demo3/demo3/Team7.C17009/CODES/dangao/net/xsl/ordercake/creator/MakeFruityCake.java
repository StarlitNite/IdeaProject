package net.xsl.ordercake.creator;
import net.xsl.ordercake.product.FruitFactory;

public class MakeFruityCake implements MakeCake{
	private String cakeType;
	
	public MakeFruityCake(String cakeType){
		this.cakeType = cakeType;
}

public FruitFactory makeFruityCake(){
		return new FruitFactory(cakeType);
}
}
