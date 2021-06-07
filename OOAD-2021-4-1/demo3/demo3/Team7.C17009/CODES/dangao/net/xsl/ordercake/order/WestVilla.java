package net.xsl.ordercake.order;
import net.xsl.ordercake.creator.MakeChocolateCake;
import net.xsl.ordercake.creator.MakeFruityCake;
import net.xsl.ordercake.creator.MakeMilkCake;
import net.xsl.ordercake.jdbc.JDBCFacade;
import net.xsl.ordercake.product.ChocolateFactory;
import net.xsl.ordercake.product.FruitFactory;
import net.xsl.ordercake.product.MilkFactory;

public class WestVilla implements Customer{
	Shop shop;
	private String cakeType;
	
	public WestVilla(Shop shop,String cakeType){
		this.shop = shop;
		this.cakeType = cakeType;
		shop.addCustomer(this);
	}
	
	public void orderCake(String name){	
		System.out.println(name+"订了一个"+cakeType+"蛋糕");
		JDBCFacade dbFacade=new JDBCFacade(); 
		String sqlStr = "select * from ordercake"; 
		String sqlStr1 = "insert into ordercake(cakeType, name, quantity)"+ " VALUES ('"+cakeType+"','"+name+"','1')"; 
		dbFacade.jdbcInsert(sqlStr1);
		System.out.println("查询插入之后新的数据库");
        dbFacade.jdbcSelect(sqlStr);
		if(cakeType.equals("草莓水果") || cakeType.equals("葡萄水果")){
			MakeFruityCake westVilla = new MakeFruityCake(cakeType);
			FruitFactory fruitCake = westVilla.makeFruityCake();
			fruitCake.createCake();
		}
		else if(cakeType.equals("牛奶巧克力") || cakeType.equals("黑巧克力")){			
			MakeChocolateCake westVilla1 = new MakeChocolateCake(cakeType);
			ChocolateFactory chocolateCake = westVilla1.makeChocolateCake();
			chocolateCake.createCake();
		}
		else if(cakeType.equals("双层鲜奶") || cakeType.equals("甜奶")){			
			MakeMilkCake westVilla1 = new MakeMilkCake(cakeType);
			MilkFactory milkCake = westVilla1.makeMilkCake();
			milkCake.createCake();
		}
	}	
} 
