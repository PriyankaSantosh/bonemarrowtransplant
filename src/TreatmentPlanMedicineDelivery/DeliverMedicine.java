package TreatmentPlanMedicineDelivery;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DeliverMedicine {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	WebDriver driver=new ChromeDriver();
	@Test
	public void DeliverMedicine() throws InterruptedException 
	{
	
		//public static void main(String[] args) throws InterruptedException {
		//WebDriver driver= new ChromeDriver();
		driver.get("https://dev.bmtplus.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
		driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
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
		
		
		
		driver.findElement(By.xpath("//a[@href='/patients?=&tid%5B%5D=10']")).click();
		driver.findElement(By.xpath("//a[@href='/add-new-patient-details']")).click();
		driver.findElement(By.xpath("//div[@id='edit_field_patient_disease_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Brain Tumor']")).click();
		driver.findElement(By.xpath("//div[@id='edit_og_group_ref_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
		driver.findElement(By.xpath("(//a[@href='#undefined'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-patient-name-und-0-value']")).sendKeys("testpatient");
		//driver.findElement(By.xpath("//input[@id='edit-field-patient-uhid-und-0-value']")).sendKeys("test1478");
		driver.findElement(By.xpath("//input[@id='edit-field-patient-date-of-birth-und-0-value-datepicker-popup-0']")).sendKeys("17 Sep 2010");
		driver.findElement(By.xpath("//input[@id='edit-field-patient-gender-und-male']")).click();
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		
	
		
		
		driver.findElement(By.xpath("//a[@id='quicktabs-tab-patient_summary_pre_bmt-9']")).click();
	    Thread.sleep(9000);
	    driver.findElement(By.xpath("//a[text()='Add New Transplant Summary']")).click();
	    String windowHandle = driver.getWindowHandle();
	  //input[@id='edit-field-transplant-descr-und-0-value']  
	  //Get the list of window handles
	  ArrayList tabs = new ArrayList (driver.getWindowHandles());
	  System.out.println(tabs.size());
	  //Use the list of window handles to switch between windows
	Set<String> a = driver.getWindowHandles();
	for(String b:a)
	{
		driver.switchTo().window(b);
	}

	driver.findElement(By.xpath("//input[@id='edit-field-transplant-descr-und-0-value']")).sendKeys("na");
	driver.findElement(By.xpath("//select[@id='edit-field-transplant-type-und']")).click();
	driver.findElement(By.xpath("//option[@value='Autologous']")).click();
	driver.findElement(By.xpath("//input[@id='edit-field-transplant-date-und-0-value-datepicker-popup-0']")).click();
	driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']")).click();
	driver.findElement(By.xpath("//input[@id='edit-field-transplant-patient-weight-und-0-value']")).sendKeys("45");
	driver.findElement(By.xpath("//input[@id='edit-field-transplant-patient-height-und-0-value']")).sendKeys("145");
	driver.findElement(By.xpath("//select[@id='edit-field-transplant-trtmnt-regimen-und-hierarchical-select-selects-0']")).click();
	driver.findElement(By.xpath("//option[text()='Old Treatment Plans']")).click();
	Thread.sleep(9000);
	Thread.sleep(9000);
	driver.findElement(By.xpath("//select[@id='edit-field-transplant-trtmnt-regimen-und-hierarchical-select-selects-1']")).click();
	driver.findElement(By.xpath("//option[text()='MRDBM-ST-01.2']")).click();
	Thread.sleep(9000);
	WebElement aa = driver.findElement(By.xpath("//input[@id='edit-submit']"));
	aa.click();

	driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div/div/div/div/div/div/div/div/div/div/ul/li[2]/a")).click();

	

	String uh = driver.getWindowHandle();
Set<String> han = driver.getWindowHandles();
for(String bow:han)
{
	driver.switchTo().window(bow);

}
	WebElement mm = driver.findElement(By.xpath("//input[@id='edit-submit']"));
	mm.click(); 
	Thread.sleep(9000);
	Thread.sleep(9000);
	Thread.sleep(10000);
	Thread.sleep(9000);
	Thread.sleep(10000);
	driver.switchTo().window(uh);
	driver.navigate().refresh();
	driver.navigate().refresh();
	driver.findElement(By.xpath("//*[@id=\"block-jagriti-custom-ji-add-content\"]/div/div/ul/li[2]/a")).click();
	
	
	String add = driver.getWindowHandle();
	Set<String> one = driver.getWindowHandles();
	for(String poy:one)
	{
		driver.switchTo().window(poy);
	}
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@id=\"block-system-main\"]/div/div[1]/div/a[1]")).click();
	String mod = driver.getWindowHandle();
	Set<String> mod1 = driver.getWindowHandles();
	for(String l1:mod1)
	{
		driver.switchTo().window(l1);
	}
	driver.findElement(By.xpath("//div[@id='edit_medicine_chosen']")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Acyclovir");
	driver.findElement(By.xpath("//div[@id=\"edit_medicine_chosen\"]/div/ul/li[1]")).click();
	driver.findElement(By.xpath("//input[@id='edit-day-from']")).sendKeys("0");
	driver.findElement(By.xpath("//input[@id='edit-day-to']")).sendKeys("0");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@id='edit_time_1_hour_chosen']")).click();
	driver.findElement(By.xpath("//li[@data-option-array-index='22']")).click();
	driver.findElement(By.xpath("//select[@id='edit-time-1-minute']")).click();
	driver.findElement(By.xpath("//select[@id='edit-time-1-minute']/option[2]")).click();
	driver.findElement(By.xpath("//select[@id='edit-therapy']")).click();
	driver.findElement(By.xpath("//option[@value='PO']")).click();
	driver.findElement(By.xpath("//input[@id='edit-dosage']")).sendKeys("250");
	driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
	String dose = driver.getWindowHandle();
	Set<String> dose2 = driver.getWindowHandles();
	for(String oo:dose2)
	{
		driver.switchTo().window(oo);
	}
	driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
	driver.switchTo().window(windowHandle);
	driver.navigate().refresh();
	driver.navigate().refresh();
	driver.findElement(By.xpath("//div[@id=\"block-jagriti-custom-jc-display-clinical-course-tab\"]/div/div/div/div/div/a")).click();
    driver.findElement(By.xpath("//input[@id='edit-field-clin-course-title-mig-und-0-value']")).sendKeys("test1238");
    driver.findElement(By.xpath("//input[@id='edit-field-clin-course-description-und-0-value']")).sendKeys("na");
    driver.findElement(By.xpath("//input[@id='edit-field-clin-course-weight-und-0-value']")).sendKeys("45");
    driver.findElement(By.xpath("//input[@id='edit-field-clin-course-height-und-0-value']")).sendKeys("145");
	driver.findElement(By.id("edit-submit")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='Administer Drug (Nurses)']")).click();
	driver.findElement(By.xpath("//input[@id='edit-field-medicines-medicine-barcode-und-0-value']")).sendKeys(ss);
	driver.findElement(By.xpath("//input[@id='edit-field-medicines-quantity-und-0-value']")).sendKeys("1");
	driver.findElement(By.xpath("//input[@value='Select Medicine Order']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='edit_field_medicines_trtment_plan_er_und__2_chosen']/a/span")).click();
	driver.findElement(By.xpath("//li[text()='21:00 pm - Acyclovir - 250']")).click();
	driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
	
	


	}
}
