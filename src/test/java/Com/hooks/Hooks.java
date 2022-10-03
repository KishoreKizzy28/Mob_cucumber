package Com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Com.Testrunner.Runner_class;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	
	public static WebDriver driver = Runner_class.driver;
	

	
	@AfterStep
	public void attachScreenshot(Scenario scenario) {
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot,"image/png",null);
	}
	

}
