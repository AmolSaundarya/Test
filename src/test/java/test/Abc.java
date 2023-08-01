package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abc {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  Thread.sleep(3000);
		  driver.quit();
	}

}
