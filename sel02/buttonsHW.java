package sel02;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class buttonsHW {

	public static void main(String[] args) throws InterruptedException {
	
String url = "http://www.leafground.com/";


ChromeOptions options = new ChromeOptions();
options.addArguments("start-maximized");
WebDriver driver = new ChromeDriver(options);

Thread.sleep(2000);
driver.get(url);

Thread.sleep(2000);
By homeButtonSelector = By.cssSelector("#post-153 > div.wp-landing-categories > div > ul > li:nth-child(2) > a > img");

WebElement homeButtonElement = driver.findElement(homeButtonSelector);

Thread.sleep(2000);
homeButtonElement.click();

By ButtonSelector = By.xpath("//*[@id=\"color\"]");
String homeButtonElement1 = driver.findElement(ButtonSelector).getCssValue("color");




//driver.get(url);
//By ButtonSelector1 = By.cssSelector("#post-153 > div.wp-landing-categories > div > ul > li:nth-child(2) > a > img");

//WebElement ButtonElement = driver.findElement(ButtonSelector1);


//hread.sleep(2000);
//ButtonElement.click();

  }
	
}
