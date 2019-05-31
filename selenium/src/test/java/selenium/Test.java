package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahanth\\eclipse-selenium\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.findElement(By.xpath(".//li[@class='h-c-header__nav-li g-mail-nav-links'][2]/a")).click();
	//	driver.findElement(By.xpath(".//*[@class='rFrNMe KSczvd uyaebd vHVGub zKHdkd sdJrJc Tyc9J']/div/div/div/input")).sendKeys("pmahanth967");
		driver.findElement(By.xpath(".//*[@class='ZFr60d CeoRYc']")).click();
		
		

	}

}
