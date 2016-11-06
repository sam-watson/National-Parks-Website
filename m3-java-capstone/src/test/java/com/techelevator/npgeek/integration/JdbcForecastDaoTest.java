package com.techelevator.npgeek.integration;

import static org.junit.Assert.*;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;

import com.techelevator.npgeek.model.ForecastDao;
import com.techelevator.npgeek.model.DailyForecast;
import com.techelevator.npgeek.model.JdbcForecastDao;
import com.techelevator.npgeek.model.JdbcParkDao;
import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.ParkDao;

public class JdbcForecastDaoTest extends DaoIntegrationTest {
	
	private ForecastDao dao;
	
	@Before
	public void setupDAO() {
		DataSource dataSource = getDataSource();
		dao = new JdbcForecastDao(dataSource);
	}

	@Test
	public void dao_returns_all_days_forecast_for_a_park_code() {
		String parkCode = "fun";
		getSetup().addParkToDatabase(parkCode);
		getSetup().addWeatherToDatabase(parkCode, 1);
		getSetup().addWeatherToDatabase(parkCode, 2);
		getSetup().addWeatherToDatabase(parkCode, 3);
		getSetup().addWeatherToDatabase(parkCode, 4);
		List<DailyForecast> fiveDayForecast = dao.getForecastByPark(parkCode);
		assertEquals(4, fiveDayForecast.size());
	}
	
	@Test
	public void dao_returns_forecasts_for_correct_park_code() {
		String rightCode = "fun";
		String wrongCode = "sad";
		getSetup().addParkToDatabase(rightCode);
		getSetup().addParkToDatabase(wrongCode);
		getSetup().addWeatherToDatabase(rightCode, 1);
		getSetup().addWeatherToDatabase(rightCode, 2);
		getSetup().addWeatherToDatabase(wrongCode, 1);
		getSetup().addWeatherToDatabase(wrongCode, 2);
		List<DailyForecast> fiveDayForecast = dao.getForecastByPark(rightCode);
		assertEquals(rightCode, fiveDayForecast.get(0).getParkCode());
	}

}
