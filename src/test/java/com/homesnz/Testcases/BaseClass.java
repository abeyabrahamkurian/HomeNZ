package com.homesnz.Testcases;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import freemarker.log.Logger;

public class BaseClass {

	public String baseURL="https://homes.co.nz/";
	public String SearchH="Auckland"; 
	public String citySearch="petone";
	public String addressSearch="45 Puru Crescent,";
	public static WebDriver driver;
	public static org.apache.log4j.Logger Logger;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		Logger =Logger.getLogger("HomesNZ");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	
	
	@AfterClass
	public void teardown()
	{
	//	driver.quit();
	}
		

	
}
