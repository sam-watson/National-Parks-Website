package com.techelevator.npgeek.model;

import java.util.List;

public interface ForecastDao {
	
	public List<DailyForecast> getForecastByPark(String parkcode);
}
