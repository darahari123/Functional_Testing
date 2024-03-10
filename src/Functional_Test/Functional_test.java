package Functional_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functional_test {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("css-sukebr")).click();
		driver.findElement(By.linkText("Orders")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[2]/button")).click();
		
		Thread.sleep(5000);
		
		String projectpath= System.getProperty("user.dir");
		
		
		driver.findElement(By.id("mui-7")).sendKeys(projectpath+"\\File\\demo-data.xlsx");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/button")).click();
		
		Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/button")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		
		

	}

}
