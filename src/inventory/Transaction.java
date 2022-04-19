package inventory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Transaction {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	WebDriver driver=new ChromeDriver();
	@Test
	public void Transaction() throws InterruptedException 
	{
	
	
	
	//public static void main(String[] args) throws Exception {
		//WebDriver driver= new ChromeDriver();
		driver.get("http://dev.bmtplus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-submit")).click();
		driver.get("http://dev.bmtplus.com/node/add/item");
		DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date=new Date();
		String item = dateFormat.format(date);
		System.out.println(item);
		driver.findElement(By.id("edit-title")).sendKeys("TestItem"+item);//unique dolo1
		driver.findElement(By.id("edit-field-item-category-und")).click();
		driver.findElement(By.xpath("//option[@value='1012']")).click();
		driver.findElement(By.xpath("//div[@id='edit_field_item_active_ingredient_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Acyclovir']")).click();
		driver.findElement(By.xpath("//div[@id='edit_og_group_ref_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
		//driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.id("edit-submit")).click();
		
		
		driver.get("http://dev.bmtplus.com/node/add/transaction");
		driver.findElement(By.id("edit-field-transaction-date-und-0-value-datepicker-popup-0")).sendKeys("3 May 2019");
		driver.findElement(By.id("edit-field-transaction-type-und")).click();
		driver.findElement(By.xpath("//option[@value='Purchase']")).click();
		driver.findElement(By.id("edit-field-transaction-associate-und-0-target-id")).sendKeys("Test Associate");
		driver.findElement(By.id("edit-field-transaction-bill-invoice-und-0-value")).sendKeys("123");
		driver.findElement(By.id("edit-field-transaction-details-und-0-value")).sendKeys("123");
		driver.findElement(By.id("edit_og_group_ref_und_chosen")).click();
		driver.findElement(By.id("edit_og_group_ref_und_chosen")).click();
		driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
		driver.findElement(By.id("edit-submit")).click();
		
		driver.findElement(By.xpath("//li/a[text()='Add a new item in your transaction']")).click();
		driver.findElement(By.id("edit-field-trans-item-part-number-und-0-target-id")).sendKeys("TestItem"+item);///unique dolo1
		driver.findElement(By.id("edit-field-trans-item-batch-serial-und-0-value")).sendKeys("555");
		driver.findElement(By.id("edit-field-trans-item-quantity-und-0-value")).sendKeys("25");
		driver.findElement(By.id("edit-field-trans-item-mfg-date-und-0-value-datepicker-popup-0")).sendKeys("7 May 2019");
		driver.findElement(By.id("edit-field-trans-item-expiry-date-und-0-value-datepicker-popup-0")).sendKeys("6 May 2020");
		driver.findElement(By.id("edit-field-trans-item-currency-type-und")).click();
		driver.findElement(By.xpath("//option[@value='INR']")).click();
		driver.findElement(By.id("edit-field-trans-item-mrp-und-0-value")).sendKeys("250");
		driver.findElement(By.id("edit-field-trans-item-labelled-price-und-0-value")).sendKeys("220");
		driver.findElement(By.id("edit-submit")).click();
		WebElement test = driver.findElement(By.xpath("(//td[@class='views-field views-field-field-trans-item-barcode'])[1]"));
		String ss = test.getText();
		System.out.println(ss);
		
	}
	
}
