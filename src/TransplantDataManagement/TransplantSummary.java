package TransplantDataManagement;

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
import org.testng.annotations.Test;

public class TransplantSummary {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	
	WebDriver driver=new ChromeDriver();
	@Test
	public void TransplantSummary() throws InterruptedException 
	{
	//	public static void main(String[] args) throws InterruptedException
		//{
		//WebDriver driver=new ChromeDriver();
		driver.get("https://dev.bmtplus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
		driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.xpath("//a[@href='/patients?=&tid%5B%5D=10']")).click();
		driver.findElement(By.xpath("//a[@href='/add-new-patient-details']")).click();
		driver.findElement(By.xpath("//div[@id='edit_field_patient_disease_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Severe Thalassemia (major or intermedia)']")).click();
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
	    driver.findElement(By.xpath("//a[@id='quicktabs-tab-patient_summary_pre_bmt-9']")).click();
	    Thread.sleep(5000);
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
	Thread.sleep(5000);
	driver.findElement(By.xpath("//select[@id='edit-field-transplant-trtmnt-regimen-und-hierarchical-select-selects-1']")).click();
	driver.findElement(By.xpath("//option[text()='MRDBM-ST-01.2']")).click();
	Thread.sleep(5000);
	WebElement aa = driver.findElement(By.xpath("//input[@id='edit-submit']"));
	aa.click();

	

	
	driver.findElement(By.xpath("//div[@id='block-jagriti-custom-ji-add-content']/div/div/ul/li[2]/a")).click();
Set<String> han = driver.getWindowHandles();
for(String bow:han)
{
	driver.switchTo().window(bow);

}
	WebElement mm = driver.findElement(By.xpath("//input[@id='edit-submit']"));
	mm.click();

	

}
}
