package com.homesnz.Testcases;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.homesnz.PageObjects.HomeSearch;

public class TC_placeSearch extends BaseClass{
@Test
public void CitySearch() {
driver.get(baseURL);
Logger.info("URL opened succesfully");

HomeSearch placesearch =new HomeSearch(driver);

placesearch.SearchCity(citySearch);
Logger.info("user able to enter the place (Petone) successfully");

try {
	placesearch.Clickplace();
} catch (Throwable e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
placesearch.SearchButton();
Logger.info("user able to select the petone from the dropdown");

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
if (driver.getCurrentUrl().equals("https://homes.co.nz/map/lower-hutt/petone?searchLoc=nvrzFsclj%60@"))
{
//System.out.println("URL verified, Testcase passed");
Logger.info("The current url is same as the given URL-Test passed");

}
else {
	System.out.println("URL verified, Testcase failed-given URL is not same as the current URL");	
	Logger.info("The current url is not same as the given URL-Test Failed");

}
}
}