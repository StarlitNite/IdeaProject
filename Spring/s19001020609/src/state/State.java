package state;

import java.util.List;
import java.util.Map;

/*状态模式*/
public interface State {

    //某个状态里用到的方法

    //投币
        public void InsertMoney(int count);
    //选择饮品
        public void ChooseGoods(String name,int price,int num);
    //出货
        public void OutGoods();
    //退币
        public int OutMoney();


    /*//未投币状态
    public void NoMoney();
    //
    public void insertMoney();
    //已投币状态
    public void HasMoney();
    //正在出货状态
    public void outgoods();
    //售罄状态
    public void nogoods();*/

}
