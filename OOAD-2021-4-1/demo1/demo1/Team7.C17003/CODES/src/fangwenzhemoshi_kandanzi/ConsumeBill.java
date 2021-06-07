package fangwenzhemoshi_kandanzi;

public class ConsumeBill implements Bill{

    private double amount;

    private String item;

    public ConsumeBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    public String accept(AccountBookViewer viewer) {
        return viewer.view(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }

}
