package com.techelevator.npgeek.model;

import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;

public class DailyForecast {

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
	public String getHighC() {
		return new DecimalFormat("#.#").format(tempFromFarenheitToCelsius(getHighF()));
	}
	public String getLowC() {
		return new DecimalFormat("#.#").format(tempFromFarenheitToCelsius(getLowF()));
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
		adviceMap.put("snow", "Pack snowshoes.");
		adviceMap.put("rain", "Pack rain gear and wear waterproof shoes.");
		adviceMap.put("thunderstorms", "Possible storms: seek shelter and avoid hiking on exposed ridges.");
		adviceMap.put("sunny", "You know where else it is sunny today? Philadelphia...");
		adviceMap.put("partly cloudy", "Don't worry about the weather, you'll be fine.");
		adviceMap.put("cloudy", "Make sure you bring a jacket! Unless it's also warm then you won't need a jacket.");
		String advice = adviceMap.get(forecast);
		if (highF > 75) {
			advice += " Bring an extra gallon of water.";
		}
		if (highF-lowF > 20) {
			advice += " Wear breathable layers.";
		}
		if (lowF < 20) {
			advice += " Frigid temperatures might result in loss of toes"
					+ " and make mustaches look even worse than normal.";
		}
		//advice = advice.substring(0, 1).toUpperCase() + advice.substring(1);
		return advice;
	}
	
	public double tempFromFarenheitToCelsius(double tempF){
	    Double celsiusTemp;
	    celsiusTemp = ((tempF - 32)*(5d/9));
	    return celsiusTemp;
	}
}
