package agent;
//发货方式---快递代理or门店自取
public class DeliverMethod implements DeliverGoods{
	boolean flag;
	public DeliverMethod(boolean flag){
		this.flag = flag;
	}
	
	@Override
	public String selectMethod(){
		if(flag){//如果flag为true，则选择快递代理方式发货
			DeliverGoods express = new Express(flag);
			return express.sendCoke("快递公司代理");
		}else{//否则，门店自取
			DeliverGoods tradition = new Tradition(flag);
			return tradition.sendCoke("门店自取");
		}
	}

	@Override
	public String sendCoke(String method) {
		return null;
	}

	

}
