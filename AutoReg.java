package Register;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoReg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Singh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Noida");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("sweta.singh@mavenwave.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("8826503079");
		Thread.sleep(2000);
		//WebElement radio1= driver.findElement(By.className("ng-dirty ng-valid ng-valid-required ng-touched"));
		//radio1.click();
		WebElement radio2= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
		radio2.click();
		Thread.sleep(2000);
		WebElement option1 = driver.findElement(By.id("checkbox1"));
		 option1.click();
		 Thread.sleep(2000);
		//WebElement option2 = driver.findElement(By.id("checkbox2"));
		 //option2.click();
		//WebElement option3 = driver.findElement(By.id("checkbox3"));
		 //option3.click();
		 WebElement dropdown_arrow = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
		 dropdown_arrow.click();
		 WebElement dropdown_value = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a"));
		 dropdown_value.click();
		 Select drpSkills = new Select(driver.findElement(By.id("Skills")));
			drpSkills.selectByVisibleText("Android");
			Thread.sleep(2000);
		Select drpCountry = new Select(driver.findElement(By.id("countries")));
			drpCountry.selectByVisibleText("India");
			Thread.sleep(2000);
		Select drpyear = new Select(driver.findElement(By.id("yearbox")));
		    drpyear.selectByVisibleText("1999");
		    Thread.sleep(2000);
		Select drpmonth = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
		    drpmonth.selectByVisibleText("May");
		    Thread.sleep(2000);
		Select drpday = new Select(driver.findElement(By.xpath("//*[@id=\"daybox\"]")));
		    drpday.selectByVisibleText("6");
		    Thread.sleep(2000);
		driver.findElement(By.id("firstpassword")).sendKeys("swetasingh7");
		Thread.sleep(2000);
		driver.findElement(By.id("secondpassword")).sendKeys("swetasingh7");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).sendKeys("C:\\Users\\Sweta Singh\\Downloads");
		Thread.sleep(2000);
		driver.findElement(By.id("submitbtn")).submit();
		Thread.sleep(2000);
		driver.close();
		}

}
