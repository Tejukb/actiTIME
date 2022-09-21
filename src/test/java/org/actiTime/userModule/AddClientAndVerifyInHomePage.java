package org.actiTime.userModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddClientAndVerifyInHomePage {

	public static void main(String[] args) {
		
		//hi
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/abc6/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("tejunaik31@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("teju123");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		
//		driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("Asha");
//		driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("M");
//		driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("asham@gmail.com");
		
		
		
	}
}
