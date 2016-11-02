package com.techelevator.npgeek.model;

import java.util.List;

public interface ForecastDao {
	
	public List<ForecastDay> getForecastByPark(String parkcode);
}
