package org.ictak.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase
{
WebDriver driver;

@BeforeTest
public void setUp() throws InterruptedException
{
driver=new ChromeDriver();
driver.get("https://learnertracker.netlify.app/");
driver.manage().window().maximize();
Thread.sleep(3000);
}

@AfterTest
public void afTest() throws InterruptedException 
{
	Thread.sleep(5000);
	driver.quit();
}
}

