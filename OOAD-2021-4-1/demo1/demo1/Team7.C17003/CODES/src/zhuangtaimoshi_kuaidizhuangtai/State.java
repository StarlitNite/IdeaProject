package zhuangtaimoshi_kuaidizhuangtai;

public interface State {
	public boolean modify();//�޸�
	public boolean cancle();//ȡ��
	public boolean query();//��ѯ
	public boolean evaluate();//����
}
