package net.xsl.ordercake.product;

public class FruitFactory implements Factory{
	private String cakeType;
	
	public FruitFactory(String cakeType){
		this.cakeType = cakeType;
	}
	
	public void createCake(){
		try{
			if (cakeType.equals("草莓水果")){
				FruityCake strawberryCake = new StrawberryCake();
				strawberryCake.show();
			}
			else if (cakeType.equals("葡萄水果")) {
				FruityCake grapeCake = new GrapeCake();
				grapeCake.show();
			}
		} 
		catch (Exception e){  
            System.out.println("制作"+cakeType+"蛋糕失败");  
        }		
    }
}
