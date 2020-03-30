package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class MainPage {
	private  By contactUsLoc=By.linkText("Contact us");
	private WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver=driver;
	}
	public  void clickOnContactUs() {
		driver.findElement(contactUsLoc).click();	
	}
	

}
