package Screenshot;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationn {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agalya.T\\eclipse-workspace\\Seleniuminmakess\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lh.inmakesedu.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File img = ts.getScreenshotAs(OutputType.FILE);
		
		File f = new File("C:\\Users\\Agalya.T\\eclipse-workspace\\Automation\\WebpageScreenshot\\inmakes.png");
		
		FileUtils.copyFile(img, f);
				
		
		
	}

}

	

