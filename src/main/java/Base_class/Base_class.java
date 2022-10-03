package Base_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Base_class {
	public static WebDriver driver;

	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("firfox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");

			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void Elementclic(WebElement elelemnt) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", elelemnt);
	}

	public static void clickonElement(WebElement element) {
		element.click();

	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void inputvalueElement(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void back() {
		driver.navigate().back();

	}

	public static void dropdown(String type, WebElement element, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		} else if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);

		}
	}

	public static void implicitwait(int sec, TimeUnit type) {
		driver.manage().timeouts().implicitlyWait(sec, type);

	}
	
	public static String getData(String data, int rowno, int cellno) throws IOException {
		String res = null;
		File file = new File("C:\\Users\\VM452YE\\eclipse-workspace\\Cucumber_task\\Credit_Details\\Credit.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(data);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		int type = cell.getCellType();
		if (type == 1) {
			res = cell.getStringCellValue();
			System.out.println(res);
		} else if (type == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
				res = dateFormat.format(dateCellValue);
				System.out.println(res);
			} else {
				double d = cell.getNumericCellValue();
				long l = (long) d;
				res = String.valueOf(l);
				System.out.println(res);
			}
		}
		return res;
	}	

}
