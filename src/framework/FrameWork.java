package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWork {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agalya.T\\eclipse-workspace\\Automation\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement iFrameText = driver.findElement(By.xpath("//h3[contains(text(),'adBlock')]"));
		
		js.executeScript("arguments[0].scrollIntoView()", iFrameText);
		
		driver.switchTo().frame("a077aa5e");
		
		
		
		
	}

}
