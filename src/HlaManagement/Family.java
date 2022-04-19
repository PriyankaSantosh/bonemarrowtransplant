package HlaManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Family {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	WebDriver driver=new ChromeDriver();
	@Test
	public void Family() throws InterruptedException 
	{
			
	
	
	
	//public static void main(String[] args) throws Exception {
		//WebDriver driver= new ChromeDriver();
		driver.get("http://dev.bmtplus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.xpath("//a[@href='/patients?=&tid%5B%5D=10']")).click();
		driver.findElement(By.xpath("//a[@href='/add-new-patient-details']")).click();
		driver.findElement(By.xpath("//div[@id='edit_field_patient_disease_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Brain Tumor']")).click();
		driver.findElement(By.xpath("//div[@id='edit_og_group_ref_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
		driver.findElement(By.xpath("(//a[@href='#undefined'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-patient-name-und-0-value']")).sendKeys("testpatient");
	//	driver.findElement(By.xpath("//input[@id='edit-field-patient-uhid-und-0-value']")).sendKeys("test1478");
		driver.findElement(By.xpath("//input[@id='edit-field-patient-date-of-birth-und-0-value-datepicker-popup-0']")).sendKeys("17 Sep 2010");
		driver.findElement(By.xpath("//input[@id='edit-field-patient-gender-und-male']")).click();
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		driver.findElement(By.xpath("//a[@id='quicktabs-tab-patient_summary_pre_bmt-3']/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='quicktabs-tabpage-patient_summary_pre_bmt-3']/div/div/div/a")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-family-name-und-0-value']")).sendKeys("Testfamilymember");
		driver.findElement(By.xpath("//input[@id='edit-field-family-last-name-und-0-value']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='edit-field-family-date-of-birth-und-0-value-datepicker-popup-0']")).sendKeys("15 Sep 2002");
		driver.findElement(By.xpath("//select[@id='edit-field-family-gender-und']")).click();
		driver.findElement(By.xpath("//option[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-fm-local-reference-id-und-0-value']")).sendKeys("testreference");
		driver.findElement(By.xpath("//input[@id='edit-field-family-description-und-0-value']")).sendKeys("na");
		driver.findElement(By.xpath("//div[@id='edit_field_family_relationship_und_chosen']")).click();
		driver.findElement(By.xpath("//div[@id='edit_field_family_relationship_und_chosen']")).click();
		driver.findElement(By.xpath("//div[@id='edit_field_family_relationship_und_chosen']")).click();
		driver.findElement(By.xpath("//div[@id='edit_field_family_relationship_und_chosen']")).click();
		driver.findElement(By.xpath("//div[@id='edit_field_family_relationship_und_chosen']")).click();
		driver.findElement(By.xpath("//div[@id='edit_field_family_relationship_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Sibling']")).click();
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.xpath("//*[@id=\"block-views-family-member-evaluation-block\"]/div/div/div/div[2]/div/a")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-family-weight-und-0-value']")).sendKeys("45");
		driver.findElement(By.xpath("//input[@id='edit-field-family-height-und-0-value']")).sendKeys("145");
		driver.findElement(By.id("edit-submit")).click();

		

		
		

	}

}
