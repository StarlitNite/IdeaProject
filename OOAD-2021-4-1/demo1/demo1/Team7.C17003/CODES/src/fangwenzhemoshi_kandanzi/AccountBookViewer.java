package fangwenzhemoshi_kandanzi;

public interface AccountBookViewer {

    //查看消费的单子
    String view(ConsumeBill bill);

    //查看收入的单子
    String view(IncomeBill bill);

}
