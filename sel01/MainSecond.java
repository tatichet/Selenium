package sel01;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MainSecond {

	public static void main(String[] args) throws InterruptedException {
	
String url = "http://www.leafground.com/";


ChromeOptions options = new ChromeOptions();
options.addArguments("start-maximized");
WebDriver driver = new ChromeDriver(options);

Thread.sleep(2000);
driver.get(url);

Thread.sleep(2000);
By homeButtonSelector = By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img");
WebElement homeButtonElement = driver.findElement(homeButtonSelector);

Thread.sleep(2000);
homeButtonElement.click();
System.out.println("change");
  }
	
}

