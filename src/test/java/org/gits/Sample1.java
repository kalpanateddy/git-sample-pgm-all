package org.gits;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\ELCOT\\Desktop\\New folder (3)\\New folder\\New folder\\New folder (2)\\DayThree\\Drive\\operadriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement name = driver.findElement(By.id("username"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','kalpanateddy')", name);

	WebElement ps = driver.findElement(By.id("password"));
	js.executeScript("arguments[0].setAttribute('value','kalpana')", ps);
			
	WebElement login = driver.findElement(By.id("login"));
	js.executeScript("arguments[0].click()", login);
			
	System.out.println("js");
	System.out.println(name);
	System.out.println(login);

}}
