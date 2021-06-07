package fangwenzhemoshi_kandanzi;

public class CPA implements AccountBookViewer{

    //如果是支出
    public String view(ConsumeBill bill) {
    	String asd="";
        if (bill.getItem().equals("箱子采购")) {
//            System.out.println("一个箱子"+bill.getAmount()+"钱？这么贵！！");
            asd = "<br/>一个箱子"+bill.getAmount()+"块钱？这么贵！！";
        }
        return asd;
    }
    //如果是收入
    public String view(IncomeBill bill) {
//        System.out.println("又赚了"+bill.getAmount()+"块钱！");
    	String asd="";
        if (bill.getItem().equals("快递单")) {
            asd = "<br/>又赚了"+bill.getAmount()+"块钱！";
        }
        return asd;
    }

}
