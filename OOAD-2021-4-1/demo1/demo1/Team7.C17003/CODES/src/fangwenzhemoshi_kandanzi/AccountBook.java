package fangwenzhemoshi_kandanzi;

import java.util.ArrayList;
import java.util.List;

public class AccountBook {
    //单子列表
    private List<Bill> billList = new ArrayList<Bill>();
    
    public List<Bill> getBillList() {
		return billList;
	}
	//添加单子
    public void addBill(Bill bill){
        billList.add(bill);
    }
    //供账本的查看者查看账本
    public String show(AccountBookViewer viewer){
    	StringBuffer asd = new StringBuffer();
        for (Bill bill : billList) {
            asd.append(bill.accept(viewer)+"<br/>");
        }
        System.out.println(asd);
        return asd.toString();
    }
}
