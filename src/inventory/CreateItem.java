package inventory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateItem {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	WebDriver driver=new ChromeDriver();
	@Test
	public void CreateItem() throws InterruptedException 
	{
	
	
	
	//public static void main(String[] args) throws Exception {
	//	WebDriver driver= new ChromeDriver();
		driver.get("http://dev.bmtplus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
		driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK"); 
		driver.findElement(By.id("edit-submit")).click();
		driver.get("http://dev.bmtplus.com/node/add/item");
		
		driver.findElement(By.id("edit-title")).sendKeys("testItem");//unique
		 
		driver.findElement(By.id("edit-field-item-description-und-0-value")).sendKeys("na");
		driver.findElement(By.id("edit-field-item-category-und")).click();
		driver.findElement(By.xpath("//option[@value='1012']")).click();
		driver.findElement(By.xpath("//div[@id='edit_field_item_active_ingredient_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Acyclovir']")).click();
		
		
		driver.findElement(By.id("edit-field-item-manufacturer-und-0-value")).sendKeys("ma");
		driver.findElement(By.id("edit-field-item-threshold-quantity-und-0-value")).sendKeys("25");
		driver.findElement(By.id("edit-field-item-ideal-stock-und-0-value")).sendKeys("12");
		driver.findElement(By.id("edit-field-item-use-by-day-und-0-value")).sendKeys("4");
		driver.findElement(By.id("edit_field_item_preferred_vendor_und_chosen")).click();
	
		driver.findElement(By.id("edit-field-item-expected-cost-und-0-value")).sendKeys("25");
		driver.findElement(By.id("edit-field-item-inventory-exclude-und")).click();
		driver.findElement(By.xpath("//option[@value='YES']")).click();
		driver.findElement(By.id("edit-field-drugs-notes-und-0-value_ifr")).sendKeys("mnjm");
		driver.findElement(By.xpath("//div[@id='edit_og_group_ref_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
		//driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.id("edit-submit")).click();
		
	}
	
	
}
