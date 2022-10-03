package Automation_c;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Base_class.Base_class;
import Com.helper.File_Reader_Manager;
import Com.pgm.Page_Object_Manager;

public class Runner_class extends Base_class{
	
	public static WebDriver driver = getBrowser("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static void main(String[] args) throws Throwable {
		String sheetname = "task";
		String sheetname1 = "task1";
		
		
		String Url = File_Reader_Manager.getInstanceFrm().getInstanceCR().geturl();
		geturl(Url);
		clickonElement(pom.GetInstanceHp().getMobile());
		clickonElement(pom.getInstanceMB().getCart());
		clear(pom.getInstanceSP().getQty());
		inputvalueElement(pom.getInstanceSP().getQty(),File_Reader_Manager.getInstanceFrm().getInstanceCR().getqty());
		clickonElement(pom.getInstanceSP().getUpdate());
		implicitwait(10,TimeUnit.SECONDS);
		inputvalueElement(pom.getInstanceCP().getCouponc(),getData(sheetname1, 1, 0));
		clickonElement(pom.getInstanceCP().getApply());
		
		System.out.println(pom.getInstanceCP().getCoupon().getText());
		dropdown("text", pom.getInstanceCP().getCountry(),getData(sheetname1, 1, 1));
		inputvalueElement(pom.getInstanceCP().getRegion(), getData(sheetname1, 1, 2));
		inputvalueElement(pom.getInstanceCP().getPostcode(),getData(sheetname1, 1, 3));
		clickonElement(pom.getInstanceEP().getEstimate());
		clickonElement(pom.getInstanceEP().getProceed());
		
		System.out.println(pom.getInstanceCC().getHeader().isDisplayed());
		System.out.println(pom.getInstanceCC().getHeader().getText());
		implicitwait(10,TimeUnit.SECONDS);
		clickonElement(pom.getInstanceCC().getSub());
		
		inputvalueElement(pom.getInstanceIP().getFname(),getData(sheetname, 1, 0));
		inputvalueElement(pom.getInstanceIP().getLname(), getData(sheetname, 1, 1));
		inputvalueElement(pom.getInstanceIP().getEmail(),getData(sheetname, 1, 2));
		inputvalueElement(pom.getInstanceIP().getAddress(), getData(sheetname, 1, 4));
		inputvalueElement(pom.getInstanceIP().getCity(), getData(sheetname, 1, 5));		
		dropdown("text",pom.getInstanceIP().getRegion1() ,getData(sheetname1, 1, 4));
		inputvalueElement(pom.getInstanceIP().getZip(), getData(sheetname, 1, 6));		
		System.out.println(pom.getInstanceIP().getZip().getAttribute("value"));		
		
		dropdown("text", pom.getInstanceIP().getCountry1(),getData(sheetname1, 1, 5));
		inputvalueElement(pom.getInstanceIP().getMob(), getData(sheetname, 1, 3));
		clickonElement(pom.getInstanceIP().getSub1());
		System.out.println(pom.getInstanceIP().getShipping().getText() + "by ship");
		clickonElement(pom.getInstanceIP().getCont1());
		clickonElement(pom.getInstanceIP().getRadio());
		
		inputvalueElement(pom.getInstancePP().getCardname(),getData(sheetname, 1, 7));
		dropdown("text", pom.getInstancePP().getCreditcard(),getData(sheetname1, 1, 6));
		inputvalueElement(pom.getInstancePP().getCrd(), getData(sheetname, 1, 8));
		dropdown("value",pom.getInstancePP().getMonth() , getData(sheetname1, 1, 7));
		dropdown("value",pom.getInstancePP().getDate(),getData(sheetname1, 1, 8));
		inputvalueElement(pom.getInstancePP().getCvv(), getData(sheetname, 1, 9));
		
		clickonElement(pom.getInstancePP().getMoney());
		clickonElement(pom.getInstancePP().getCont5());
		clickonElement(pom.getInstanceCR().getOrder());
		System.out.println(pom.getInstanceCR().getPlaced().getText());
		driver.close();
		
		
	}

}
