package controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fangwenzhemoshi_kandanzi.AccountBook;
import fangwenzhemoshi_kandanzi.Boss;
import fangwenzhemoshi_kandanzi.CPA;
import fangwenzhemoshi_kandanzi.ConsumeBill;
import gongchangmoshi_box.BoxFactory;

@Controller
public class BossController {
	public static AccountBook accountBook = new AccountBook();
	
	@RequestMapping(value = "/first")
	public String first() {
		return "first";
	}
	@RequestMapping(value = "/boss")
	public String boss() {
		return "boss";
	}
	
	@RequestMapping(value = "/box")
	public String box() {
		return "box";
	}
	
	
	@RequestMapping(value = "/boxdinggou")
	@ResponseBody
	public HashMap<String,String> boxdinggou(String xinghao,String color,String geshu) {
		int num = Integer.parseInt(geshu);
		HashMap<String,String> map = new HashMap<String,String>();
		BoxFactory boxFactory = new BoxFactory();
		for(int i = 1; i <= num; i++) {
			map.put(boxFactory.productBoc(xinghao,color).play()+" *"+i,String.valueOf(i));
			
			if(xinghao.equals("yihaoxiang")) {
				BossController.accountBook.addBill(new ConsumeBill(3.7, "箱子采购"));
			} else if(xinghao.equals("erhaoxiang")) {
				BossController.accountBook.addBill(new ConsumeBill(2.6, "箱子采购"));
			} else {
				BossController.accountBook.addBill(new ConsumeBill(1.5, "箱子采购"));
			}
			
		}
		return map;
	}
	
	@RequestMapping(value = "/BOSSzhangdan")
	public String zhangdan(Model model) {
		Boss boss = new Boss();
		BossController.accountBook.show(boss);
        model.addAttribute("mingxi", boss.getTotalConsume()+boss.getTotalIncome());
		return "chakanzhangben";
	}
	@RequestMapping(value = "/CPAzhangdan")
	public String CPAzhangdan(Model model) {
		CPA cpa = new CPA();
		model.addAttribute("mingxi", BossController.accountBook.show(cpa));
		return "chakanzhangben";
	}
	
	
}
