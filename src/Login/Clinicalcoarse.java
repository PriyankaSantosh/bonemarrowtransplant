package Login;

import java.awt.Point;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clinicalcoarse {
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
		driver.findElement(By.xpath("//a[@href='/content/tsa21334']")).click();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1)); //switches to new tab
		driver.get("http://dev.bmtplus.com/node/add/clinical-course/297738");
		driver.findElement(By.id("edit-field-clin-course-title-mig-und-0-value")).sendKeys("Bnaaaa");
		driver.findElement(By.id("edit-field-clin-course-description-und-0-value")).sendKeys("bdabjj");
		driver.findElement(By.xpath("//select[@id='edit-field-clin-course-type-und']")).click();
		driver.findElement(By.xpath("//option[@value='Pre-Transplant']")).click();
		//driver.findElement(By.id("edit-field-clin-course-date-und-0-value-datepicker-popup-0")).sendKeys("19-Mar-2019");
		driver.findElement(By.id("edit-field-next-follow-up-date-und-0-value-datepicker-popup-0")).sendKeys("30-Mar-2019");
		driver.findElement(By.id("edit-field-clin-course-day-number-und-0-value")).sendKeys("-9");
		driver.findElement(By.id("edit-field-clin-course-free-tagging-und-0-value")).sendKeys("abnnnn");
		driver.findElement(By.id("edit-field-clin-course-weight-und-0-value")).sendKeys("45");
		driver.findElement(By.id("edit-field-clin-course-height-und-0-value")).sendKeys("145");
		driver.findElement(By.id("edit-field-clin-course-wbc-und-0-value")).sendKeys("45");
		driver.findElement(By.id("edit-field-clin-course-anc-und-0-value")).sendKeys("152");
		driver.findElement(By.id("edit-field-clin-course-alc-und-0-value")).sendKeys("42");
		driver.findElement(By.id("edit-field-clin-course-amc-und-0-value")).sendKeys("145");
		driver.findElement(By.id("edit-field-clin-course-hb-1-und-0-first")).sendKeys("25");
		driver.findElement(By.id("edit-field-clin-course-hb-1-und-0-second")).click();
		driver.findElement(By.xpath("//option[@value='mmol/L']")).click();
		driver.findElement(By.id("edit-field-clin-course-mcv-und-0-value")).sendKeys("15");
		driver.findElement(By.id("edit-field-clin-course-platelets-und-0-value")).sendKeys("14");
		driver.findElement(By.id("edit-field-clin-course-transfusions-und-packed-red-cells")).click();
		driver.findElement(By.id("edit-field-ciln-course-sgpt-alt-und-0-value")).sendKeys("9");
		driver.findElement(By.id("edit-field-clin-course-totalbilirubin-und-0-first")).sendKeys("9");
		driver.findElement(By.id("edit-field-clin-course-totalbilirubin-und-0-second")).click();
		driver.findElement(By.xpath("(//option[@value='µmol/L'])[1]")).click();
		driver.findElement(By.id("edit-field-clin-course-creatinine-1-und-0-first")).sendKeys("85");
		driver.findElement(By.id("edit-field-clin-course-creatinine-1-und-0-second")).click();
		driver.findElement(By.xpath("(//option[@value='µmol/L'])[2]")).click();
		driver.findElement(By.id("edit-field-tacrolimus-peak-level-und-0-value")).sendKeys("25");
		driver.findElement(By.id("edit-field-tacrolimus-trough-level-und-0-value")).sendKeys("25");
		driver.findElement(By.id("edit-field-clin-course-liver-und-0-value")).sendKeys("15");
		driver.findElement(By.id("edit-field-clin-course-spleen-und-0-value")).sendKeys("14");
		driver.findElement(By.id("edit-field-clin-course-liver-usg-und-0-value")).sendKeys("9");
		driver.findElement(By.id("edit-field-clin-course-spleen-usg-und-0-value")).sendKeys("6");
		driver.findElement(By.id("edit-field-clin-course-ferritin-und-0-value")).sendKeys("8");
		driver.findElement(By.id("edit-field-clin-course-pubic-hair-und")).click();
		driver.findElement(By.xpath("(//option[@value='1'])[1]")).click();
		driver.findElement(By.id("edit-field-clin-course-tanner-staging-und")).click();
		driver.findElement(By.xpath("(//option[@value='4'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.id("edit-field-clin-course-tom-lab-notes-und-0-value_ifr")).sendKeys("naaaa");
		driver.findElement(By.id("edit-field-document-notes-und-0-value_ifr")).sendKeys("1455");
		driver.findElement(By.id("edit-field-clin-course-doc-notes-und-0-value_ifr")).sendKeys("jkjjkjk");
		driver.findElement(By.id("edit-field-clin-course-medications-und-0-value_ifr")).sendKeys("jhdjajh");
		driver.findElement(By.id("edit-submit")).click();
		
	   
		
		
	    }	
		
}
