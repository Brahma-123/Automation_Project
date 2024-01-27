package MavenProject.First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJava {
	
	public static void main(String[]args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./target/chromeDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Brahma");
		driver.findElement(By.name("password")).sendKeys("Jan@2023");
		
	
		
		driver.findElement(By.xpath("//input[@class='button']")).click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}
	
	


}
