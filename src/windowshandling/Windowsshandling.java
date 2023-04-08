package windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsshandling {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agalya.T\\eclipse-workspace\\Automation\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("ipad 10th gen");
		
		WebElement searchbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		searchbtn.click();
		
		WebElement ipad = driver.findElement(By.xpath("//img[@alt='Apple 2022 10.9-inch iPad (Wi-Fi, 64GB) - Silver (10th Generation)']"));
		ipad.click();
		
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Id : = " + parentWindowId);
		
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("All window id : " + allWindowsId);
		
		
		for (String winId : allWindowsId) {
			if (winId != parentWindowId) {
				driver.switchTo().window(winId);
				
			}
			
			
			
		}
		
		
		
		
		
		
		//driver.switchTo().window("https://www.amazon.in/Apple-2022-10-9-inch-iPad-Wi-Fi/dp/B0BJMSFMHH/ref=sr_1_2?crid=2R8PYE8G4E63A&keywords=ipad+10th+gen&qid=1677661305&sprefix=%2Caps%2C190&sr=8-2");
		//WebElement addToCart = driver.findElement(By.id("submit.buy-now"));
		//addToCart.click();
		
	}

}
