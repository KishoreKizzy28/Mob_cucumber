package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Info_page {
	
	public WebDriver driver;
	
	@FindBy(id = "billing:firstname")
	private WebElement fname;
	
	
	public Info_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getRegion1() {
		return region1;
	}

	public WebElement getZip() {
		return zip;
	}

	public WebElement getCountry1() {
		return country1;
	}

	public WebElement getMob() {
		return mob;
	}

	public WebElement getSub1() {
		return sub1;
	}

	public WebElement getShipping() {
		return shipping;
	}

	public WebElement getCont1() {
		return cont1;
	}

	public WebElement getRadio() {
		return radio;
	}

	@FindBy(id = "billing:lastname")
	private WebElement lname;
	
	@FindBy(id = "billing:email")
	private WebElement email;
	
	@FindBy(id = "billing:street1")
	private WebElement address;
	
	@FindBy(id="billing:city")
	private WebElement city;
	
	@FindBy(id = "billing:region_id")
	private WebElement region1;
	
	@FindBy(id = "billing:postcode")
	private WebElement zip;
	
	@FindBy(xpath = "(//select[@title='Country'])[1]")
	private WebElement country1;
	
	@FindBy(id = "billing:telephone")
	private WebElement mob;
	
	@FindBy(xpath = "(//span[text()='Continue'])[2]")
	private WebElement sub1;
	
	@FindBy(xpath = "//h2[text()='Shipping Method']")
	private WebElement shipping;
	
	@FindBy(xpath = "(//span[text()='Continue'])[4]")
	private WebElement cont1;
	
	@FindBy(xpath = "(//input[@type='radio'])[6]")
	private WebElement radio;
	
}
