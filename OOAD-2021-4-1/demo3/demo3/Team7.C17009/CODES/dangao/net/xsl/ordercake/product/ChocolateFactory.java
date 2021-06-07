package net.xsl.ordercake.product;

public class ChocolateFactory {
	
	private String cakeType;
	
	public ChocolateFactory(String cakeType){
		this.cakeType = cakeType ;
	}
	
	public void createCake(){
		try{
			if (cakeType.equals("牛奶巧克力")){
				ChocolateCake milkChocolateCake = new MilkChocolateCake();
				milkChocolateCake.show();
			}
			else if (cakeType.equals("黑巧克力")) {
				ChocolateCake darkChocolateCake = new DarkChocolateCake();
				darkChocolateCake.show();
			}
		} 
		catch (Exception e){  
            System.out.println("制作"+cakeType+"蛋糕失败");  
        }		
    }
}
