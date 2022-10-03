package Com.pgm;

import org.openqa.selenium.WebDriver;

import Com.pom.Checkout_page;
import Com.pom.Confirmation_page;
import Com.pom.Coupon_page;
import Com.pom.Estimate_page;
import Com.pom.Home_page;
import Com.pom.Info_page;
import Com.pom.Mobile_page;
import Com.pom.Payment_page;
import Com.pom.Shopping_page;

public class Page_Object_Manager {
	public WebDriver driver;
	private Home_page hp;
	private Confirmation_page cr;
	private Coupon_page cp;
	private Checkout_page cc;
	private Estimate_page ep;
	private Info_page ip;
	private Mobile_page mb;
	private Payment_page pp;
	private Shopping_page sp;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Home_page GetInstanceHp() {
		if (hp==null) {
			
			 hp = new Home_page(driver);
			
		}
		
		return hp;
	}
	
	public Confirmation_page getInstanceCR() {
		if (cr==null) {
			 cr = new Confirmation_page(driver);
			
		}
		return cr;
	}
	
	public Coupon_page getInstanceCP() {
		if (cp==null) {
			
			 cp = new Coupon_page(driver);
			
		}
		
		return cp;
	}
	
	public Checkout_page getInstanceCC() {
		if (cc==null) {
			 cc = new Checkout_page(driver);
		}
		return cc;
	}
	
	public Estimate_page getInstanceEP() {
		if (ep==null) {
			
			 ep = new Estimate_page(driver);
			
		}
		return ep;
	}
	
	public Info_page getInstanceIP() {
		if (ip==null) {
			
			 ip = new Info_page(driver);
			
			}
		return ip;
	}
	
	public Mobile_page getInstanceMB() {
		if (mb==null) {
			 mb = new Mobile_page(driver);
			
			}
		return mb;
	}
	
	public Payment_page getInstancePP() {
		if (pp==null) {
			 pp = new Payment_page(driver);
			
		}
		return pp;
	}
	
	public Shopping_page getInstanceSP() {
		if (sp==null) {
			 sp = new Shopping_page(driver);
			
		}
		return sp;
	}

}
