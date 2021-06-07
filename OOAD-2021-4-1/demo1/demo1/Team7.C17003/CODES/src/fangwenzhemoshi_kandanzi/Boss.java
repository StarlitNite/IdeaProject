package fangwenzhemoshi_kandanzi;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Boss implements AccountBookViewer{

    private double totalIncome;

    private double totalConsume;

    //老板只关注一共花了多少钱以及一共收入多少钱，其余并不关心
    public String view(ConsumeBill bill) {
        totalConsume += bill.getAmount();
        return "";
    }

    public String view(IncomeBill bill) {
        totalIncome += bill.getAmount();
        return "";
    }

    public String getTotalIncome() {
    	BigDecimal bg1 = new BigDecimal(totalIncome).setScale(1, RoundingMode.UP);
        return "<br/>老板查看一共收入多少，数目是：" + String.valueOf(bg1.doubleValue());
    }

    public String getTotalConsume() {
    	BigDecimal bg1 = new BigDecimal(totalConsume).setScale(1, RoundingMode.UP);
        return "<br/>老板查看一共花费多少，数目是：" + String.valueOf(bg1.doubleValue());
    }

}
