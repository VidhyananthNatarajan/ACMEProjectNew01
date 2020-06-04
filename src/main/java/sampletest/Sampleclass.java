package sampletest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sampleclass {

@Test
public void startApp() {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	
}

}
