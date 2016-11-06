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

	public List<DailyForecast> getForecastByPark(String parkcode) {
	    List<DailyForecast> forecast = new ArrayList<>();
	    
	    String sqlSelectParkById = "SELECT * FROM weather WHERE parkcode = ?;";
	    SqlRowSet rows = jdbcTemplate.queryForRowSet(sqlSelectParkById, parkcode);
	    
	    while(rows.next()){
	        DailyForecast singleForecast = new DailyForecast();
	        singleForecast.setParkCode(rows.getString("parkcode"));
	        singleForecast.setDayNumber(rows.getInt("fiveDayForecastValue"));
	        singleForecast.setLowF(rows.getDouble("low"));
	        singleForecast.setHighF(rows.getDouble("high"));
	        singleForecast.setForecast(rows.getString("forecast"));
	        forecast.add(singleForecast);
	        singleForecast.getDay();
	    }
	    return forecast;
	}
}
