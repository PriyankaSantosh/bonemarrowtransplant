package BloodProduct;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CreateBloodProduct {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	WebDriver driver=new ChromeDriver();
@Test
public void CreateBloodProduct() throws InterruptedException
{
		
	
	
	/*public static void main(String[] args) throws InterruptedException
		{
		WebDriver driver=new ChromeDriver();*/
		driver.get("https://dev.bmtplus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
		driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.xpath("//a[@href='/patients?=&tid%5B%5D=10']")).click();
		driver.findElement(By.xpath("//a[@href='/add-new-patient-details']")).click();
		driver.navigate().to("https://dev.bmtplus.com/node/add/patient");
	driver.findElement(By.xpath("//div[@id='edit_field_patient_disease_und_chosen']")).click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@id='edit_field_patient_disease_und_chosen']")).click();
	
	WebDriverWait wait=new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-option-array-index='1']")));
	
	
		driver.findElement(By.xpath("//li[@data-option-array-index='1']")).click();
		driver.findElement(By.xpath("//div[@id='edit_og_group_ref_und_chosen']")).click();
	    driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
	    driver.findElement(By.xpath("(//a[@href='#undefined'])[2]")).click();
		DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    
	    //get current date time with Date()
	    
	    Date date1 = new Date();
	    
	  String  dd1=dateFormat1.format(date1);
	  System.out.println(dd1);
	    driver.findElement(By.xpath("//input[@id='edit-field-patient-name-und-0-value']")).sendKeys("testPatient"+""+dd1);
	    driver.findElement(By.id("edit-field-patient-date-of-birth-und-0-value-datepicker-popup-0")).sendKeys("9 Nov 2001");
	    driver.findElement(By.id("edit-field-patient-gender-und-female")).click();
	    driver.findElement(By.id("edit-submit")).click();
	    driver.findElement(By.xpath("(//div[@class='block-content'])[1]")).click();
	    String a = driver.getTitle();
	    System.out.println(a);
	    
	    driver.findElement(By.xpath("//a[@id='quicktabs-tab-patient_summary_pre_bmt-3']/span[1]")).click();
		Thread.sleep(5000);
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
		driver.findElement(By.xpath("//select[@id='edit-field-family-selected-donor-und']")).click();
		driver.findElement(By.xpath("(//option[text()='Yes'])[3]")).click();
		 driver.findElement(By.xpath("//select[@id='edit-field-transplant-trtmnt-regimen-und-hierarchical-select-selects-0']")).click();
		 driver.findElement(By.xpath("//option[@value='2413']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//select[@id='edit-field-transplant-trtmnt-regimen-und-hierarchical-select-selects-1']")).click();
		 driver.findElement(By.xpath("//option[@value='3977']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		 Thread.sleep(4000);
			
		driver.findElement(By.xpath("//*[@id=\"block-views-family-member-evaluation-block\"]/div/div/div/div[2]/div/a")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-family-weight-und-0-value']")).sendKeys("45");
		driver.findElement(By.xpath("//input[@id='edit-field-family-height-und-0-value']")).sendKeys("145");
		driver.findElement(By.id("edit-submit")).click();
	   WebElement family = driver.findElement(By.xpath("(//div[@class='field-item even']/a)[1]"));
	String storefamily = family.getText();
	System.out.println(storefamily);
		driver.get("http://dev.bmtplus.com/node/add/blood-products");
		driver.findElement(By.id("edit-field-bp-blood-bag-number-und-0-value")).sendKeys("testBloodgroup"+dd1);//unique
		driver.findElement(By.id("edit_field_bp_blood_component_und_chosen")).click();
		driver.findElement(By.xpath("//li[@data-option-array-index='2']")).click();
		driver.findElement(By.id("edit-field-bp-received-date-und-0-value-datepicker-popup-0")).sendKeys("19 Apr 2019");
		WebElement aa = driver.findElement(By.id("edit-field-bp-issued-to-und-0-target-id"));
		aa.sendKeys(a);
		aa.sendKeys(Keys.BACK_SPACE);
		aa.sendKeys(Keys.BACK_SPACE);
		aa.sendKeys(Keys.BACK_SPACE);
		aa.sendKeys(Keys.BACK_SPACE);
		aa.sendKeys(Keys.BACK_SPACE);
		aa.sendKeys(Keys.BACK_SPACE);
		aa.sendKeys(Keys.BACK_SPACE);
		aa.sendKeys(Keys.BACK_SPACE);
		aa.sendKeys(Keys.BACK_SPACE);
		aa.sendKeys(Keys.BACK_SPACE);

		driver.findElement(By.id("edit-field-bp-type-und")).click();
		driver.findElement(By.xpath("//option[text()='Donor Bone Marrow']")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-bp-donor-id-und-0-target-id']")).sendKeys(storefamily);
		driver.findElement(By.id("edit-field-transplant-cell-count-und-0-value")).sendKeys("45");
		driver.findElement(By.id("edit-field-transplant-total-mnc-und-0-value")).sendKeys("12");
		driver.findElement(By.id("edit-field-transplant-cd34-cells-und-0-value")).sendKeys("12");
		driver.findElement(By.id("edit-field-transplant-collection-vol-und-0-value")).sendKeys("400");
		driver.findElement(By.id("edit-field-notes-und-0-value_ifr")).sendKeys("na");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='edit-field-transplant-cd3-cells-und-0-value']")).sendKeys("441");
		
		driver.findElement(By.id("edit-field-bp-blood-type-und")).click();
		driver.findElement(By.xpath("//option[text()='A pos']")).click();
		driver.findElement(By.id("edit-field-bp-collection-date-und-0-value-datepicker-popup-0")).sendKeys("20 Apr 2019");
		driver.findElement(By.id("edit-field-bp-expiry-date-und-0-value-datepicker-popup-0")).sendKeys("30 Apr 2020");
		driver.findElement(By.id("edit-field-bp-status-und")).click();
		driver.findElement(By.xpath("//option[text()='Available']")).click();
		driver.findElement(By.id("edit-field-bp-irradiation-centres-und-0-target-id")).sendKeys("Agha Khan Lab (254772)");
		driver.findElement(By.id("edit-field-anticoagulant-details-und-0-value")).sendKeys("na");
		driver.findElement(By.id("edit-field-manipulation-details-und-0-value")).sendKeys("kkjkjk");
		driver.findElement(By.id("edit-field-bp-used-date-und-0-value-datepicker-popup-0")).sendKeys("30 Apr 2019");
		driver.findElement(By.id("edit-field-bp-used-date-und-0-value-timeEntry-popup-1")).sendKeys("13:15");
		driver.findElement(By.id("edit-field-bp-used-date-und-0-value2-datepicker-popup-0")).sendKeys("30 Apr 2019");
		driver.findElement(By.id("edit-field-bp-used-date-und-0-value2-timeEntry-popup-1")).sendKeys("14:15");
		driver.findElement(By.id("edit-field-bp-payment-mode-und")).click();
		driver.findElement(By.xpath("//option[@value='Sankalp']")).click();
		driver.findElement(By.id("edit_og_group_ref_und_chosen")).click();
		driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
		driver.findElement(By.id("edit-submit")).click();
		
		
		
		
		
		
	}
}
