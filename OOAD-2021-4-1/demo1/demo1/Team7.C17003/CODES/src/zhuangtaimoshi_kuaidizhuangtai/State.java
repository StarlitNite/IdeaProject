package zhuangtaimoshi_kuaidizhuangtai;

public interface State {
	public boolean modify();//修改
	public boolean cancle();//取消
	public boolean query();//查询
	public boolean evaluate();//评价
}
