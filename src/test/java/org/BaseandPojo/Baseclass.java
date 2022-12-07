package org.BaseandPojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	public static Actions a ;
	public static Alert alert;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	public static Select s;
	public static WebDriverWait webWait;
	public static FluentWait<WebDriver> fluentWait;

public static void launchBrowser(String browser) {
		
		if(browser.equals("Chrome")) {
	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	driver.manage().window().maximize();
	}

	public static void createActionsObj() {
		a = new Actions(driver);
	}
	public static void createAlertObjAndSwitch() {
		alert = driver.switchTo().alert();
	}
	public static void createScreenShotObj() {
		ts = (TakesScreenshot)driver;
	}
	public static void createJavascriptExecutorObj() {
		js = (JavascriptExecutor)driver;
	}

	public static void launchUrl(String url) {
	driver.get(url);
	}

	public static void getThePageTitle() {
	String title = driver.getTitle();
	System.out.println(title);
	}

	public static void getTheUrl() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println("Current Page Title: \n"+title);
	}
	public static void getText(WebElement we) {
		System.out.println(we.getText());
	}

	public static  void getAttribute(WebElement we) {
		System.out.println(we.getAttribute("value"));
	}
	public static void passTxt(WebElement we,String txt) {
		we.sendKeys(txt);
	}

	public static void clickBtn(WebElement btn) {
		btn.click();
	}

	public static void doubleClick(WebElement we) {
		a=new Actions(driver);
		
		a.doubleClick(we).perform();
	}

	public static void rightClick(WebElement we) {
		a=new Actions(driver);
		a.contextClick(we).perform();
	}

	public static void drgAndDrop(WebElement src, WebElement des) {
		a=new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}

	public static void mouseOver(WebElement we) {
		a=new Actions(driver);
		a.moveToElement(we).perform();
	}
	public static void passTxtAlert(String txt) {
		
	alert.sendKeys(txt);
	}
	public static void acceptAlert() {
		
		alert.accept();
	}

	public static void takeScreenShot(String imgName) throws IOException {
	File ss = ts.getScreenshotAs(OutputType.FILE);

	File des = new File("C:\\Users\\KUTTY\\Pictures\\Screenshots\\"+imgName+".png");
	FileUtils.copyFile(ss, des);
	}

	public static void passJavascriptTxt(String txt, WebElement we) {
		js.executeScript("arguments[0].setAttribute('value','"+txt+"')", we);
	}

	public static void clickJavascriptBtn(WebElement we) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",we);
	}

	public static void getAttributeJavascript(WebElement we) {
		Object rTxt = js.executeScript("return arguments[0].getAttribute('value')", we);
		String s = (String)rTxt;
		System.out.println(s);
	}
public static JavascriptExecutor js1;
	public static void scrollToTargetWebEJavascript(WebElement scroll) {
		js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView(false)", scroll);
	}
	public static void switchToFrame(WebElement we) {
		driver.switchTo().frame(we);
	}
	public static void swithToParentFrame() {
		driver.switchTo().parentFrame();
	}
	public static void switchToMainHtml() {
		driver.switchTo().defaultContent();
	}

	public static void switchToLessThanTwoWindow() {
	String parWinId = driver.getWindowHandle();
		Set<String> allWinId = driver.getWindowHandles();
		for(String itr:allWinId) {
			if(parWinId != itr) {
			driver.switchTo().window(itr);
			}
		}
	}
	public static void switchToMoreThanTwoWindow(int index) {
		Set<String> allWinId = driver.getWindowHandles();
		List<String> l = new LinkedList<String>();
		l.addAll(allWinId);
		driver.switchTo().window(l.get(index));
	}
	//Select TAG in DropDown
	
	public static void createSelectObjforDrop(WebElement we) {
		s = new Select(we);
	}

	public static void selectByValue(String locat) {
		s.selectByValue(locat);
	}

	public static void selectByVisibleText(String txt) {
	
		s.selectByVisibleText(txt);
	}
	public static void selectByIndex(int index) {
		s.selectByIndex(index);
	}

	public static void deselectByValue(String value) {
		s.deselectByValue(value);
	}

	public static void deselectByVisibleText(String txt) {
		s.deselectByVisibleText(txt);
	}
	public static void deselectByIndex(int index) {
		s.deselectByIndex(index);
	}

	public static void getAllOptions() {
	List<WebElement> allOpt = s.getOptions();
	System.out.println("All OPtions inside the Select: ");
	for(WebElement itr:allOpt) {
		System.out.println(itr.getText());
	}
	}

	public static void getAllSelectedOptions() {
		List<WebElement> getSelOpt = s.getAllSelectedOptions();
		System.out.println("All Selected Options:");
		for(WebElement itr:getSelOpt) {
			System.out.println(itr.getText());
		}
	}
	public static void firstSelectedOption() {
		WebElement getFirSelOpt = s.getFirstSelectedOption();
	    System.out.println("First Selected Option: "+getFirSelOpt.getText());
	}
	public static void isMultipleDropDown(){
		Boolean mul = s.isMultiple();
		System.out.println(mul);
	}

	public static List<WebElement> allRows;
	public static List<WebElement> particularRowAllDatas;

	public static void getParticularValueInTable(WebElement table,int row,int column) {
	    allRows = table.findElements(By.tagName("tr"));
		WebElement particularRow = allRows.get(row);

		particularRowAllDatas = particularRow.findElements(By.tagName("td"));
		WebElement firstdata = particularRowAllDatas.get(column); 
		getText(firstdata);
	}
	public static void iterateAllTDDatasFromTable(WebElement table) {
	    allRows = table.findElements(By.tagName("tr"));
	    
	    for(int i=0;i<allRows.size();i++) {
	    	WebElement itrRow= allRows.get(i);
	    	particularRowAllDatas = itrRow.findElements(By.tagName("td"));
	    	for(int j=0;j<particularRowAllDatas.size();j++) {
		    WebElement itrCol = particularRowAllDatas.get(j);
		    System.out.println("\n"+itrCol.getText());
	    }
	   }	
	}
	public static void iterateAllTHDatasFromTable(WebElement table) {
	    allRows = table.findElements(By.tagName("tr"));
	    
	    for(int i=0;i<allRows.size();i++) {
	    	WebElement itrRow= allRows.get(i);
	    	particularRowAllDatas = itrRow.findElements(By.tagName("th"));
	    	for(int j=0;j<particularRowAllDatas.size();j++) {
		    WebElement itrCol = particularRowAllDatas.get(j);
		    System.out.println("\n"+itrCol.getText());
	     }
	    }
	   }

	public static void getLastRowLastElement(WebElement table) {
		allRows = table.findElements(By.tagName("tr"));
		
		WebElement lastRow = allRows.get(allRows.size()-1);
		particularRowAllDatas = lastRow.findElements(By.tagName("td"));
		
		WebElement lastColData = particularRowAllDatas.get(particularRowAllDatas.size()-1);
		System.out.println("Last Element in Table: "+lastColData.getText());
	}
	//implicit wait and explicit wait
	//implicit wait
	public static void implicitWaitMinutes(long minute) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(minute));
	}

	public static void implicitWaitSeconds(long sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	public static void implicitWaitDays(long day) {
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(day));
	}
	//Explicit wait
	//WebDriverWait
	public static void explicitWebDriverWaitMinutes(long minute) {
		webWait = new WebDriverWait(driver,Duration.ofMinutes(minute));
	}

	public static void explicitWebDriverWaitSec(long second) {
		webWait = new WebDriverWait(driver,Duration.ofSeconds(second));
	}
	public static void explicitWebDriverWaitDays(long day) {
		webWait = new WebDriverWait(driver,Duration.ofDays(day));
	}

	public static void webDriverElementToBeClickable(String txt) {
		webWait.until(ExpectedConditions.elementToBeClickable(By.xpath(txt)));
	}
	//Fluent wait
	public static void explicitFluentWaitMinutes(long minute,long millis) {
		fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMinutes(minute)).pollingEvery(Duration.ofMillis(millis)).ignoring(Throwable.class);
	}
	public static void explicitFluentWaitSec(long second,long millis) {
		fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(second)).pollingEvery(Duration.ofMillis(millis)).ignoring(Throwable.class);
	}
	public static void explicitFluentWaitDays(long day,long millis) {
		fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofDays(day)).pollingEvery(Duration.ofMillis(millis)).ignoring(Throwable.class);
	}
	public static void fluentWaitElementToBeClickable(String txt) {
		fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath(txt)));
	}

	//ReadTheExcelFile And Return the Value to use passTxt method to pass the value

	public static String readExcelFile(String excelname,String sheet,int row,int cell) throws IOException {
	File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\TestAdcatin\\excelsheetadactin\\"+excelname+".xlsx");

	FileInputStream fis = new FileInputStream(f);

	Workbook ws = new XSSFWorkbook(fis);

	Sheet mySheet = ws.getSheet(sheet);
	Row r = mySheet.getRow(row);
	Cell c = r.getCell(cell);

	String value="";

	if(c.getCellType()==1) {
		value = c.getStringCellValue();
		System.out.println(value);
	}
	else if(DateUtil.isCellDateFormatted(c)) {
		Date d = c.getDateCellValue();
		
		SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yyyy");
		value = sim.format(d);
		System.out.println(value);
	}
	else {
		double db = c.getNumericCellValue();
		long l = (long)db;
		value = String.valueOf(l);
		System.out.println(value);
	}
	return value;
	}

	//create the excel file

	public static void createExcelFile( int crerow, int crecell,String excelname,String sheetname,String data) throws IOException {
	File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\TestAdcatin\\excelsheetadactin\\"+excelname+".xlsx");

	Workbook wb = new XSSFWorkbook();
	Sheet newSheet = wb.createSheet(sheetname);
	Row newRow = newSheet.createRow(crerow);

	Cell newCell = newRow.createCell(crecell);
	newCell.setCellValue(data);

	FileOutputStream fos = new FileOutputStream(f);

	wb.write(fos);
	}

	//create Cell only
	public static void createExcelCellOnly( int getrow, int crecell,String excelname,String sheetname,String data) throws IOException {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\TestAdcatin\\excelsheetadactin\\"+ excelname +".xlsx");
	    FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mySheet = wb.getSheet(sheetname);
		Row r = mySheet.getRow(getrow);

		Cell newCell = r.createCell(crecell);
		newCell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);
	}

	//create new Row only
	public static void createExcelRowOnly( int crerow, int crecell,String excelname,String sheetname,String data) throws IOException {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\TestAdcatin\\excelsheetadactin\\"+ excelname +".xlsx");
	    FileInputStream fis = new FileInputStream(f);
	    Workbook wb = new XSSFWorkbook(fis);
	    Sheet mySheet = wb.getSheet(sheetname);
	    Row newRow = mySheet.createRow(crerow);
	    Cell newCell = newRow.createCell(crecell);
	    newCell.setCellValue(data);
	    
	    FileOutputStream fos = new FileOutputStream(f);
	    wb.write(fos);
	    
	    System.out.println("writed.......");
	}
	
	
	private void changes2() {
		System.out.println("checking conflicts");
	}

private void changes() {
	// TODO Auto-generated method stub
System.out.println("the branch is created");
}

}


