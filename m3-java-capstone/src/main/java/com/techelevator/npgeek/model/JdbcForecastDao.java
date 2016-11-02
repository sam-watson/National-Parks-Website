package com.techelevator.npgeek.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class JdbcForecastDao implements ForecastDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcForecastDao(DataSource dataSource) {
	    this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<ForecastDay> getForecastByPark(String parkcode) {
	    List<ForecastDay> forecast = new ArrayList<>();
	    
	    String sqlSelectParkById = "SELECT * FROM park WHERE parkcode = ?;";
	    SqlRowSet rows = jdbcTemplate.queryForRowSet(sqlSelectParkById, parkcode);
	    
	    while(rows.next()){
	        ForecastDay singleForecast = new ForecastDay();
	        singleForecast.setParkCode(rows.getString("parkcode"));
	        singleForecast.setDayNumber(rows.getInt("fivedayforecastvalue"));
	        singleForecast.setHighF(rows.getDouble("low"));
	        singleForecast.setLowF(rows.getDouble("high"));
	        singleForecast.setForecast(rows.getString("forecast"));
	        forecast.add(singleForecast);
	    }
	    return forecast;
	}
}
