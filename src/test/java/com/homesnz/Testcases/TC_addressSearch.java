package com.homesnz.Testcases;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import com.homesnz.PageObjects.HomeSearch;

public class TC_addressSearch extends BaseClass {
@Test
public void SearchAddress() {
driver.get(baseURL);
Logger.info("URL opened succesfully");
HomeSearch placesearch =new HomeSearch(driver);

placesearch.SearchHome(addressSearch);
try {
	placesearch.Clickplace();
} catch (Throwable e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Logger.info("user able to enter the address successfully");
placesearch.SearchButton();
Logger.info("user able to select the address successfully");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
if (driver.getCurrentUrl().equals("https://homes.co.nz/map/wellington/lyall-bay/puru-crescent/45?searchLoc=rhf%7BFyb%7Bi%60@"))
{
//System.out.println("URL verified, Testcase passed");
Logger.info("The current url is same as the given URL-Test passed");
}
else {
	System.out.println("URL verified, Testcase failed-given URL is not same as the current URL");	
	Logger.info("The current url is not same as the given URL-Test Failed");
}

if(driver.getTitle().contains(addressSearch)) {
	Logger.info("45 Puru Cres is on top of the list- Test passed");
}

else {
	Logger.info("45 Puru Cres is not displayed on the top of the list- Test Failed");
}
}
}


