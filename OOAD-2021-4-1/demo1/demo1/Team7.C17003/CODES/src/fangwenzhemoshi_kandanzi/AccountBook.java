package fangwenzhemoshi_kandanzi;

import java.util.ArrayList;
import java.util.List;

public class AccountBook {
    //�����б�
    private List<Bill> billList = new ArrayList<Bill>();
    
    public List<Bill> getBillList() {
		return billList;
	}
	//��ӵ���
    public void addBill(Bill bill){
        billList.add(bill);
    }
    //���˱��Ĳ鿴�߲鿴�˱�
    public String show(AccountBookViewer viewer){
    	StringBuffer asd = new StringBuffer();
        for (Bill bill : billList) {
            asd.append(bill.accept(viewer)+"<br/>");
        }
        System.out.println(asd);
        return asd.toString();
    }
}
