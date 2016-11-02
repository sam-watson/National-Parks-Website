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
}