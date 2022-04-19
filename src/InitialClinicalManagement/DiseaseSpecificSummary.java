package InitialClinicalManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DiseaseSpecificSummary {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}


WebDriver driver=new ChromeDriver();
@Test
public void DiseaseSpecificSummary() throws InterruptedException 
{
	
	

	//public static void main(String[] args) throws InterruptedException
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
    driver.findElement(By.xpath("//a[@id='quicktabs-tab-patient_summary_pre_bmt-2']")).click();
    Thread.sleep(9000);
    driver.findElement(By.xpath("//div[@id='quicktabs-tabpage-patient_summary_pre_bmt-2']/div/div[2]/div/a")).click();
    driver.findElement(By.xpath("//input[@id='edit-field-dis-summ-title-mig-und-0-value']")).sendKeys("testtitle");
    driver.findElement(By.xpath("//input[@id='edit-field-dis-summ-description-und-0-value']")).sendKeys("na");
    driver.findElement(By.xpath("//input[@id='edit-field-dis-summ-date-und-0-value-datepicker-popup-0']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']/a")).click();
   driver.findElement(By.xpath("//input[@id='edit-field-dis-summ-diagnosis-age-und-0-value']")).sendKeys("15");
   driver.findElement(By.id("edit-submit")).click();
}
}
