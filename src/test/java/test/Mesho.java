package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mesho {
  @Test
  public void faa() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.meshoo.com/");
	  Thread.sleep(3000);
	  driver.quit();
  }
}
