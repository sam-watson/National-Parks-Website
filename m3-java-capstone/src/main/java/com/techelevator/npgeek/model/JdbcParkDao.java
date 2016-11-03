package com.techelevator.npgeek.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcParkDao implements ParkDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcParkDao(DataSource dataSource) {
	    this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Park> getAllParks() {
		List<Park> allParksList = new ArrayList<>();

	    String sqlSelectAllParks = "SELECT * FROM park;";
	    SqlRowSet rows = jdbcTemplate.queryForRowSet(sqlSelectAllParks);
	    
	    while(rows.next()) {
	        Park park = newParkFromRow(rows);
	        allParksList.add(park);
	    }
	    return allParksList;
	}

	private Park newParkFromRow(SqlRowSet rows) {
		Park park = new Park();
		park.setParkCode(rows.getString("parkcode"));
		park.setParkName(rows.getString("parkname"));
		park.setState(rows.getString("state"));
		park.setAcreage(rows.getInt("acreage"));
		park.setElevationInFeet(rows.getInt("elevationinfeet"));
		park.setMilesOfTrail(rows.getDouble("milesoftrail"));
		park.setNumberOfCampsites(rows.getInt("numberofcampsites"));
		park.setClimate(rows.getString("climate"));
		park.setYearFounded(rows.getInt("yearfounded"));
		park.setAnnualVisitorCount(rows.getInt("annualvisitorcount"));
		park.setInspirationalquote(rows.getString("inspirationalquote"));
		park.setInspirationalQuoteSource(rows.getString("inspirationalquotesource"));
		park.setParkDescription(rows.getString("parkdescription"));
		park.setEntryFee(rows.getInt("entryfee"));
		park.setNumberOfAnimalSpecies(rows.getInt("numberofanimalspecies"));
		return park;
	}

	@Override
	public Park getParkByParkCode(String parkCode) {
	    String sqlSelectAllParks = "SELECT * FROM park Where parkcode = ?;";
	    SqlRowSet rows = jdbcTemplate.queryForRowSet(sqlSelectAllParks, parkCode);
	    Park park = null;
	    if (rows.next()) {
	    	park = newParkFromRow(rows);
	    }
	    return park;
	}

}
