package com.SpiceJet;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet2Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		 FirefoxOptions opt = new FirefoxOptions();
		opt.addArguments("--disable-notifications");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(opt);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-117bsoe r-1otgn73' and @data-testid='round-trip-radio-button']")).click();
		driver.findElement(By.xpath("//div[.='From']/following-sibling::div/input[@type='text']")).sendKeys("Beng");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='To']/following-sibling::div/input[@type='text']")).sendKeys("delhi");
		Thread.sleep(2000);        
		driver.findElement(By.xpath("//div[.='20']")).click();     //departure date
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='20']")).click(); 	//return date
		driver.findElement(By.xpath("//div[.='Passengers']")).click();
		driver.findElement(By.xpath("//div[.='Children']/../../div/div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		Thread.sleep(1000);
	}
}


























