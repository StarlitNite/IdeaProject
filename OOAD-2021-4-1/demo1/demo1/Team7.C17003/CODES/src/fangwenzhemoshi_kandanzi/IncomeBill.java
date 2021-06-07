package fangwenzhemoshi_kandanzi;

public class IncomeBill implements Bill{

    private double amount;

    private String item;

    public IncomeBill(double amount, String item) {
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
