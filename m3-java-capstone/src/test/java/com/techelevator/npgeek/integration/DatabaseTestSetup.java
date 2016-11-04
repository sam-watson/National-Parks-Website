package com.techelevator.npgeek.integration;

import java.time.LocalDate;

import org.springframework.jdbc.core.JdbcTemplate;

public class DatabaseTestSetup {

	JdbcTemplate template;
	
	public DatabaseTestSetup(JdbcTemplate template) {
		this.template = template;
	}

	public void addParkToDatabase(String code) {
		String sqlInsertPark = "INSERT INTO park "
				+ "(parkCode, parkName, state, "
				+ "acreage, elevationInFeet, milesOfTrail, numberOfCampsites, "
				+ "climate, yearFounded, annualVisitorCount, inspirationalQuote, inspirationalQuoteSource, "
				+ "parkDescription, entryFee, numberOfAnimalSpecies) "
				+ "VALUES (?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?)";
		template.update(sqlInsertPark,
				code, "Happy Springs", "Ohio", 
				Math.random(), Math.random(), Math.random(), Math.random(),
				"Happy", Math.random(), Math.random(), "Happiness is like a happy park", "Anne Frank",
				"A happy park.", Math.random(), Math.random()
				);
	}
	
	public void addWeatherToDatabase(String parkCode, int dayNumber) {
		String sqlInsertWeather = "INSERT INTO weather "
				+ "(parkCode, fivedayforecastvalue, low, high, forecast) "
				+ "VALUES (?,?,?,?,?)";
		template.update(sqlInsertWeather, parkCode, dayNumber, 5, 6000, "hooray!");
	}
	
	public void addSurveyToDatabase(String parkCode) {
		String sqlInsertSurvey = "INSERT INTO survey_result "
				+ "(parkCode, emailAddress, state, activityLevel) "
				+ "VALUES (?,?,?,?)";
		template.update(sqlInsertSurvey, parkCode, "email", "oo", "2");
	}
}
