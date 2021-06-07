package net.xsl.ordercake.product;

public class MilkFactory implements Factory{
	private String cakeType;
	
	public MilkFactory(String cakeType){
		this.cakeType = cakeType;
	}
	
	public void createCake(){
		try{
			if (cakeType.equals("双层鲜奶")){
				MilkCake doubleMilkCake = new DoubleMilkCake();
				doubleMilkCake.show();				
			}
			else if (cakeType.equals("甜奶")) {
				MilkCake sweetMilkCake = new SweetMilkCake();
				sweetMilkCake.show();
			}
		} 
		catch (Exception e){  
            System.out.println("制作"+cakeType+"蛋糕失败");  
        } 
    }
}
