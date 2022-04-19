package Login;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hla {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("http://dev.bmtplus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.xpath("//*[@id='menu-1060-1']/a")).click();
		driver.get("http://dev.bmtplus.com/content/tsa17001");
		driver.findElement(By.xpath("//a[@href='/content/tsa17001?qt-patient_summary_pre_bmt=4#qt-patient_summary_pre_bmt']")).click();
		driver.findElement(By.xpath("//a[@href='/node/add/hla/201989']")).click();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='edit-field-hla-laboratory-id-und-0-value']")).sendKeys("0235");
		driver.findElement(By.id("edit-field-hla-description-und-0-value")).sendKeys("Hi");
		driver.findElement(By.id("edit_field_hla_laboratory_und_chosen")).click();
		driver.findElement(By.xpath("//li[@data-option-array-index='4']")).click();
		driver.findElement(By.id("edit-field-hla-date-sent-und-0-value-datepicker-popup-0")).sendKeys("22 Mar 2019");
		driver.findElement(By.id("edit-field-hla-date-recieved-at-hg-und-0-value-datepicker-popup-0")).sendKeys("24 Mar 2019");
		driver.findElement(By.id("edit-field-hla-date-und-0-value-datepicker-popup-0")).sendKeys("25 Mar 2019");
		driver.findElement(By.id("edit-field-hla-paid-und-yes")).click();
		driver.findElement(By.id("edit-field-hla-typing-method-und")).click();
		driver.findElement(By.xpath("//option[@value='Serology']")).click();
		driver.findElement(By.id("edit-field-hla-a-df-und-0-first")).sendKeys("1");
		driver.findElement(By.id("edit-field-hla-b-df-und-0-first")).sendKeys("2");
		driver.findElement(By.id("edit-field-hla-c-df-und-0-first")).sendKeys("3");
		driver.findElement(By.id("edit-field-hla-drb1-df-und-0-first")).sendKeys("4");
		driver.findElement(By.id("edit-field-hla-dqb1-df-und-0-first")).sendKeys("5");
		driver.findElement(By.id("edit-field-hla-dpb1-und-0-first")).sendKeys("6");
		
		driver.findElement(By.id("edit-field-hla-dpb1-und-0-second")).sendKeys("7");
		driver.findElement(By.id("edit-field-hla-ccr5-und-0-first")).sendKeys("8");
		driver.findElement(By.id("edit-field-hla-ccr5-und-0-second")).sendKeys("9");
		
		
		driver.findElement(By.id("edit-field-hla-blood-group-und-0-value")).sendKeys("B");
		driver.findElement(By.id("edit-field-hla-kir-profile-und-0-value")).sendKeys("4");
		File f= new File("File/Hla.docx");
		String path=f.getAbsolutePath();
		driver.findElement(By.id("edit-field-document-file-und-0-upload")).sendKeys(path);
		Thread.sleep(3000);
		driver.findElement(By.id("edit-field-document-file-und-0-upload-button")).click();
		driver.findElement(By.xpath("//iframe[@id='edit-field-hla-note-und-0-value_ifr']")).sendKeys("hi");
		driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
		
		
		

		
		
	}}
		
	
	

