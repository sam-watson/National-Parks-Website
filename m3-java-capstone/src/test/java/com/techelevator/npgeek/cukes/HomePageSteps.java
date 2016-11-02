package com.techelevator.npgeek.cukes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import com.techelevator.npgeek.pageobjects.HomePage;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class HomePageSteps {

	private WebDriver webDriver;
	private HomePage homePage;

	@Autowired
	public HomePageSteps(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	@Given("^I am at the homepage$")
	public void i_am_at_the_homepage() {
		webDriver.get("http://localhost:8080/m3-java-capstone");
	    homePage = new HomePage(webDriver);
	}
	
	@Then("^I see the logo$")
	public void i_see_the_logo() {
	    assertNotNull(homePage.getLogo());
	}

	@Then("^I see a list of park pictures$")
	public void i_see_a_list_of_park_pictures() {
	   
	}

}
