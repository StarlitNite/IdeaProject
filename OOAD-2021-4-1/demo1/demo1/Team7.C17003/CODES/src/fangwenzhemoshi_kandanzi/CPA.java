package fangwenzhemoshi_kandanzi;

public class CPA implements AccountBookViewer{

    //�����֧��
    public String view(ConsumeBill bill) {
    	String asd="";
        if (bill.getItem().equals("���Ӳɹ�")) {
//            System.out.println("һ������"+bill.getAmount()+"Ǯ����ô�󣡣�");
            asd = "<br/>һ������"+bill.getAmount()+"��Ǯ����ô�󣡣�";
        }
        return asd;
    }
    //���������
    public String view(IncomeBill bill) {
//        System.out.println("��׬��"+bill.getAmount()+"��Ǯ��");
    	String asd="";
        if (bill.getItem().equals("��ݵ�")) {
            asd = "<br/>��׬��"+bill.getAmount()+"��Ǯ��";
        }
        return asd;
    }

}
