package com.techelevator.npgeek.model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;

public class ForecastDay {

	private String parkCode;
	private int dayNumber;
	private double highF;
	private double lowF;
	private String forecast;
	
	public String getParkCode() {
		return parkCode;
	}
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	public String getDay() {
		LocalDate date = LocalDate.now();
		DayOfWeek day = date.plusDays(dayNumber-1).getDayOfWeek();
		return day.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
	}
	public int getDayNumber() {
		return dayNumber;
	}
	public void setDayNumber(int day) {
		this.dayNumber = day;
	}
	public double getHighF() {
		return highF;
	}
	public void setHighF(double highF) {
		this.highF = highF;
	}
	public double getLowF() {
		return lowF;
	}
	public void setLowF(double lowF) {
		this.lowF = lowF;
	}
	public double getHighC() {
		return tempFromFarenheitToCelsius(getHighF());
	}
	public double getLowC() {
		return tempFromFarenheitToCelsius(getLowF());
	}
	public String getForecast() {
		return forecast;
	}
	public void setForecast(String forecast) {
		this.forecast = forecast;
	}
	public String getForecastImageName() {
//		String imageName = forecast;
//		int spaceX = forecast.indexOf(" ");
//		if (spaceX != -1) {
//			String old = forecast.substring(spaceX, spaceX+2);
//			String fix = old;
//			fix.trim();
//			fix.toUpperCase();
//			imageName.replace(old, fix);
//		}
		if (forecast.equals("partly cloudy")) {
			return "partlyCloudy";
		}
		return forecast;
	}
	public String getAdvice() {
		HashMap<String, String> adviceMap = new HashMap<>();
		adviceMap.put("snow", "pack snowshoes");
		adviceMap.put("rain", "pack rain gear and wear waterproof shoes");
		adviceMap.put("thunderstorms", "seek shelter and avoid hiking on exposed ridges");
		adviceMap.put("sun", "pack sunblock");
		
		if (highF > 75) {
			"bring an extra gallon of water";
		}
		h. If the difference between the high and low temperature exceeds 20 degrees, tell the user to wear breathable layers.
		i. If the temperature is going to be below 20 degrees, make sure to warn the user of the dangers of exposure to frigid temperatures.
	}
	
	public double tempFromFarenheitToCelsius(double tempF){
	    Double celsiusTemp;
	    celsiusTemp = ((tempF - 32)*(5/9));
	    return celsiusTemp;
	}
}
