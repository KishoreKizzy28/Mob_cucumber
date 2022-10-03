package Com.Testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Base_class.Base_class;
import Com.helper.File_Reader_Manager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\test\\java\\Com\\feature\\Mobile.feature",
		
		glue = {"Com.stepdefinition" ,"Com.hooks"},
		
		monochrome = true ,
		
				plugin = {
						"html:Report/HtmlReport.html",
						"json:jsoneport/Report.json",
						"pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		
		
		
		)







public class Runner_class {
	
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_up() throws Throwable {
		String browser = File_Reader_Manager.getInstanceFrm().getInstanceCR().getbrowser();
		driver = Base_class.getBrowser(browser);

	}
	
	@AfterClass
	public static void tear_Down() {
		
		driver.close();

	}

}
