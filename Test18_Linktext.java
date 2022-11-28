// Program 18 - write a program for link text locator any website

package org.octtestingbatch.vas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test18_Linktext
{

public static void main(String[] args) throws Throwable 
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver boyfriend = new ChromeDriver();
	
	boyfriend.get("https://adactin.com/HotelApp/index.php");
	WebElement w  = boyfriend.findElement(By.linkText("Forgot Password?"));
	w.click();
	//boyfriend.findElement(By.partialLinkText("Forg")).click();
}
}
