package MavenProject.First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HYR_tutorials {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./target/chromeDriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	

		driver.get("https://www.hyrtutorials.com/");
		
		driver.manage().window().maximize();
   
		
		

		WebElement mouse =  	driver.findElement(By.xpath("//div[@id='menu']//li[4]/a[text()='Selenium Practice']"));

		Actions act = new Actions(driver);
		
		act.moveToElement(mouse).perform();
		
		WebElement small = driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[4]/ul/li[1]/a"));
		
		act.moveToElement(small);
		
		WebElement tar = driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[4]/ul/li[1]/ul/li/a"));
		
		act.moveToElement(tar).click().perform();
		
		String browserURL = driver.getCurrentUrl();
		
		String title = driver.getTitle();
		
		System.out.println("The browser URL is : "+ browserURL);
		
		System.out.println("The browser Title is : "+ title);
		
		
		driver.close();
		
		

	}

}
