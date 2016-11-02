package com.techelevator.npgeek.model;

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
	public String getForecast() {
		return forecast;
	}
	public void setForecast(String forecast) {
		this.forecast = forecast;
	}
}
