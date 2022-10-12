package Testing;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;




public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\phase 5 workspace/chromedriver.exe");
	  ChromeDriver webdriver=new ChromeDriver();

String URL = "http://www.flipkart.com/";
	  webdriver.get(URL);
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		webdriver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();


		webdriver.findElement(By.xpath("//img[@alt='Mobiles & Tablets']")).click();

		
		webdriver.findElement(By.xpath("(//img[@alt='Moto Edge 30'])[2]")).click();
		webdriver.findElement(By.xpath("//div[@class='_2LR_KO']")).click();
		webdriver.findElement(By.xpath("//input[@placeholder='Search Brand']")).sendKeys("SAMSUNG");
		webdriver.findElement(By.xpath("//div[@title='SAMSUNG']//div[@class='_24_Dny']")).click();

		webdriver.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
		js.executeScript("window.scrollBy(0,5428)", "");
		System.out.println("Contents refreshed successfully");
	}
	  /*long start=System.currentTimeMillis();
	driver.get("https://www.flipkart.com/");
	long finish=System.currentTimeMillis();
	long totalTime=finish-start;
	System.out.println("The page load time "+totalTime);
	 final JavascriptExecutor js = (JavascriptExecutor) driver;
	    // time of the process of navigation and page load
	    double loadTime = (Double) js.executeScript(
	        "return (window.performance.timing.loadEventEnd - window.performance.timing.navigationStart) / 1000");
	    System.out.print(loadTime + " seconds"); // 5.15 seconds*/

     
   
  @Test(priority = 2)
  public void search() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\phase 5 workspace/chromedriver.exe");
	  ChromeDriver webdriver=new ChromeDriver();

String URL = "http://www.flipkart.com/";
	  webdriver.get(URL);
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		webdriver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();


		webdriver.findElement(By.xpath("//img[@alt='Mobiles & Tablets']")).click();

		
		webdriver.findElement(By.xpath("(//img[@alt='Moto Edge 30'])[2]")).click();
		webdriver.findElement(By.xpath("//div[@class='_2LR_KO']")).click();
		webdriver.findElement(By.xpath("//input[@placeholder='Search Brand']")).sendKeys("SAMSUNG");
		webdriver.findElement(By.xpath("//div[@title='SAMSUNG']//div[@class='_24_Dny']")).click();

		boolean image2 = webdriver
				.findElement(By.xpath("//div[normalize-space()='SAMSUNG Galaxy F13 (Sunrise Copper, 64 GB)']"))
				.isDisplayed();

		if (image2) {
			System.out.println("Image2 Loaded ");
		} else {
			System.out.println("Image2 not Loaded");
		}

		boolean image3 = webdriver
				.findElement(By.xpath("//div[normalize-space()='SAMSUNG Galaxy F13 (Nightsky Green, 64 GB)']"))
				.isDisplayed();

		if (image3) {
			System.out.println("Image3 Loaded ");
		} else {
			System.out.println("Image3 not Loaded");
		}

		WebElement Element = webdriver.findElement(By.xpath(
				"//div[normalize-space()='SAMSUNG Galaxy A23 (Black, 128 GB)']"));
		JavascriptExecutor js = (JavascriptExecutor) webdriver;

		js.executeScript("arguments[0].scrollIntoView();", Element);
		System.out.println("Scrolled Down Successfully");
	}

  
	
  }