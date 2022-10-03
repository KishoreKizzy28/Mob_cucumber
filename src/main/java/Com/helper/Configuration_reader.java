package Com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_reader {
	
	public static Properties p;
	
	public Configuration_reader() throws Throwable { // public constructor
		File f = new File("C:\\Users\\VM452YE\\eclipse-workspace\\Cucumber_task\\src\\main\\java\\Configuration\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		 p = new Properties();        //properties is a class object is invoked // method
		p.load(fis); 
	}
	
	public  String geturl() throws Throwable {
		String url = p.getProperty("url");
		return url;
		
		
	}
	
	public String getqty() {
		String qty = p.getProperty("qty");
		return qty;
		
	}
	
	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	

}
