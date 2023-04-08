package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Downdrop {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agalya.T\\eclipse-workspace\\Automation\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("fruits"));
		
		Select s = new Select(dropdown);
		
		boolean mul = s.isMultiple();
		System.out.println(mul);
		
		s.selectByIndex(2);
		s.selectByVisibleText("Banana");
		s.selectByValue("grape");
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			
			WebElement opt = allSelectedOptions.get(i);
			String text = opt.getText();
			System.out.println(text);
			
			
			
			
			
			
			
		}
		
		
		
		
	}

}
