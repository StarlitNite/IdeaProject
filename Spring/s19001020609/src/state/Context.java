package state;

import java.util.List;
import java.util.Map;

public class Context {

   public State NoMoney;
   public State HasMoney;
   public State GiveGoods;
   public State NoGoods;

   private int count;
   private State nowState;

    public void setState(State state) {
        this.nowState = state;
    }

    public Context() {
        NoMoney = new NoMoney(this);
        HasMoney = new HasMoney(this);
        GiveGoods = new GiveGoods(this);
        NoGoods = new NoGoods(this);


        nowState = NoMoney;

    }
    public void InsertMoney(int count){
        nowState = HasMoney;
        nowState.InsertMoney(count);

    }
    public void ChooseGoods(String name,int price,int num){
        nowState.ChooseGoods(name,price,num);
    }
    public void OutGoods(){
        nowState.OutGoods();
    }
    public void OutMoney(){
        nowState.OutMoney();
    }

}
