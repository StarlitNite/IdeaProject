package controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import celuemoshi_huiyuanzhi.PlatinumUser;
import fangwenzhemoshi_kandanzi.IncomeBill;
import qiaojiemoshi_yunshufangshi.AirTransport;
import qiaojiemoshi_yunshufangshi.Company;
import qiaojiemoshi_yunshufangshi.LandTransport;
import qiaojiemoshi_yunshufangshi.SfTransport;
import qiaojiemoshi_yunshufangshi.Stotransport;
import qiaojiemoshi_yunshufangshi.TransportType;
import qiaojiemoshi_yunshufangshi.ZtoTransport;
import zhuangshizhemoshi_dingdan.Address;
import zhuangshizhemoshi_dingdan.BasicInpormation;
import zhuangshizhemoshi_dingdan.BoxType;
import zhuangshizhemoshi_dingdan.DeliveryForm;
import zhuangshizhemoshi_dingdan.Transport;
import zhuangtaimoshi_kuaidizhuangtai.packagee;;

@Controller
public class PlatinumMemberController {
	private PlatinumUser platinumUser;
	private packagee packagee;
	

	/**
	 * @param platinumUser
	 */
	public PlatinumMemberController() {
		this.platinumUser = new PlatinumUser();
	}



	@RequestMapping(value = "/PlatinumMember")
	public String PlatinumMember() {
		
		return "PlatinumMember";
	}
	@RequestMapping(value = "/PlatinumMemberdingdan")
	public String PlatinumMemberdingdan() {
		
		return "PlatinumMemberdingdan";
	}
	@RequestMapping(value = "/Platinumguanli")
	public String Platinumguanli() {
		return "PlatinumPackage";
	}
	@RequestMapping(value = "/PlatinumMemberdingdandong")
	public String dingdandong(HttpServletRequest request,Model model) {
		
		this.packagee = new packagee();
		
		String address = request.getParameter("address");
		String shoujianren = request.getParameter("shoujianren");
		String jijianren = request.getParameter("jijianren");
		String company = request.getParameter("company");
		String yunshufangshi = request.getParameter("yunshufangshi");
		String xinghao = request.getParameter("xinghao");
		
		
		Company comp;
		if(company.equals("shunfeng")) {
			comp = new SfTransport();
		} else if(company.equals("zhongtong")) {
			comp = new ZtoTransport();
		} else {
			comp = new Stotransport();
		}
		
		TransportType way;
		if(yunshufangshi.equals("kongyun")) {
			way = new AirTransport();
		} else {
			way = new LandTransport();
		}
		
		comp.setTransportType(way);
		
		
		DeliveryForm deliveryForm = new DeliveryForm();
		Address location = new Address(deliveryForm, address);
		BasicInpormation basicInpormation = new BasicInpormation(location, "收件人是"+shoujianren+" 寄件人是"+jijianren);
		Transport transport = new Transport(basicInpormation, comp.print());
		BoxType boxType = new BoxType(transport, xinghao);
		boxType.fill();
		model.addAttribute("kuaididan", boxType.getXingxi());
		
		BigDecimal bg1 = new BigDecimal(18+(double)(Math.random()*100)).setScale(1, RoundingMode.UP);
		double yuanjia = bg1.doubleValue();
		BigDecimal bg2 =  new BigDecimal(yuanjia*this.platinumUser.getMember().getDiscount()).setScale(1, RoundingMode.UP);
		double jiage = bg2.doubleValue();
		
		IncomeBill incomeBill = new IncomeBill(jiage, shoujianren);
		BossController.accountBook.addBill(incomeBill);
		
		model.addAttribute("yuanjia", yuanjia);
		model.addAttribute("zhekou", this.platinumUser.getMember().getDiscount());
		model.addAttribute("jiage", jiage);
		
		return "show";
	}
	@RequestMapping(value = "/Platinummodify")
	public String Platinummodify() {
		if(this.packagee.modify()) {
			return "modify";
		}
		return "modify_no";
	}
	@RequestMapping(value = "/Platinumcancle")
	public String Platinumcancle() {
		if(this.packagee.cancle()) {
			return "cancle";
		}
		return "cancle_no";
	}
	@RequestMapping(value = "/Platinumquery")
	public String Platinumquery() {
		if(this.packagee.query()) {
			return "query";
		}
		return "query_no";
	}
	@RequestMapping(value = "/Platinumevaluate")
	public String Platinumevaluate() {
		if(this.packagee.evaluate()) {
			return "evaluate";
		}
		return "evaluate_no";
	}
}
