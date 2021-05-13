package com.homesnz.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomeSearch {
WebDriver ldriver;


public HomeSearch (WebDriver rdriver)
{
ldriver=rdriver;
PageFactory.initElements(rdriver, this);
}
	
@FindBy(id="autocomplete-search")
@CacheLookup
WebElement txtSearch;


@FindBy(xpath="//button[@class='homes-button-main borderless']")
@CacheLookup
WebElement SearchButton;


@FindBy(xpath ="//div[@class='ng-tns-c165-8 addressResult ng-star-inserted focus']//div[contains(string(),'Auckland')")
@CacheLookup
WebElement allvaluedropdown;
private List<WebElement> selects;

@FindBy(id="autocomplete-search")
@CacheLookup
WebElement citySearch;

@FindBy(xpath ="//div[@class='ng-tns-c165-8 addressResult ng-star-inserted focus']//div[contains(string(),'petone')")
@CacheLookup
WebElement allvaluedropdowncity;
private List<WebElement> selectcity;

@FindBy(xpath ="//body/homes-root/homes-map-page[@class='ng-tns-c294-8 ng-star-inserted']/div[@class='pageCont ng-tns-c294-8']/homes-drawer[@class='ng-tns-c294-8 ng-tns-c272-9 mode-standard expanded-none']/div[@class='ng-tns-c272-9 drawerContent expanded-none']/div[@class='ng-tns-c272-9 drawerContentContainer']/homes-property-tile-drawer-search-cards[@class='ng-tns-c294-8 ng-star-inserted']/h2[1]")
@CacheLookup
WebElement addressh1;

public void SearchHome(String SearchH) {
	txtSearch.sendKeys(SearchH);
	
}
public List<WebElement> Clickplace() throws Throwable {
		Thread.sleep(1000);
		
if(selects.contains("Auckland")) {
allvaluedropdown.click();
		}
else {
			System.out.print("Element not found");
		}
return selects;
}

public void SearchButton()
{
	SearchButton.click();
	

	}




public void SearchCity(String citysearch) {
	citySearch.sendKeys(citysearch);

}
public List<WebElement> Clickcity() throws Throwable {
	Thread.sleep(1000);
	
if(selectcity.contains("petone")) {
allvaluedropdowncity.click();

	}
else {
		System.out.print("Element not found");
	}
return selects;

}
public void AddressTittle() {	
	WebElement Addressfound;
	
}

}



