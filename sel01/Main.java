package sel01;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Main {

	public static void main(String[] args) throws InterruptedException {
	
String url = "http://www.leafground.com/pages/Window.html";
String currentUrl;


  ChromeOptions options = new ChromeOptions();
  options.addArguments("start-maximized");
  WebDriver driver = new ChromeDriver(options);
  
  Thread.sleep(2000);
  driver.get(url);
  
  Thread.sleep(2000);
  By homeButtonSelector = By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button");
  WebElement homeButtonElement = driver.findElement(homeButtonSelector);
  
  Thread.sleep(2000);
  homeButtonElement.click();
  
  currentUrl = driver.getCurrentUrl();
  System.out.println(currentUrl);
  
  Set<String> wins = driver.getWindowHandles();
  
  driver.switchTo().window(wins.toArray()[2].toString());
  driver.manage().window().maximize();
  
  Thread.sleep(3000);
  driver.quit();
	}

}
