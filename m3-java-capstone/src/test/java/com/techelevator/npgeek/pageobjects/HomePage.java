package com.techelevator.npgeek.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver webDriver;

	public HomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public WebElement getLogo() {
		WebElement element = webDriver.findElement(By.id("logo"));
		return element;
	}
	
	

//	public AlienAgeInputPage clickAlienAgeCalculatorLink() {
//		WebElement link = webDriver.findElement(By.id("alienAgeURL"));
//		link.click();
//		return new AlienAgeInputPage(webDriver);
//	}

}
