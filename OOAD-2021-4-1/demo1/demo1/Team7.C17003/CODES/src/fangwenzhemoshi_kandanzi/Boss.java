package fangwenzhemoshi_kandanzi;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Boss implements AccountBookViewer{

    private double totalIncome;

    private double totalConsume;

    //�ϰ�ֻ��עһ�����˶���Ǯ�Լ�һ���������Ǯ�����ಢ������
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
        return "<br/>�ϰ�鿴һ��������٣���Ŀ�ǣ�" + String.valueOf(bg1.doubleValue());
    }

    public String getTotalConsume() {
    	BigDecimal bg1 = new BigDecimal(totalConsume).setScale(1, RoundingMode.UP);
        return "<br/>�ϰ�鿴һ�����Ѷ��٣���Ŀ�ǣ�" + String.valueOf(bg1.doubleValue());
    }

}
