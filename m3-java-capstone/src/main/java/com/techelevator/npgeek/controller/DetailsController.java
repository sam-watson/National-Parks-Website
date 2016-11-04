package com.techelevator.npgeek.controller;

import com.techelevator.npgeek.model.*;

import java.util.ArrayList;
import java.util.List;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("preferences")
public class DetailsController {
	
	private ParkDao parkDao;
	private ForecastDao forecastDao;
	
	@Autowired
	public DetailsController(ParkDao parkDao, ForecastDao forecastDao) {
		this.parkDao = parkDao;
		this.forecastDao = forecastDao;
	}
	
	@RequestMapping("/parkDetails")
	public String displayParkDetails(@RequestParam String code, ModelMap modelMap) {
		if (modelMap.get("preferences") == null) {
			Preferences preferences = new Preferences();
			modelMap.addAttribute("preferences", preferences);
		}
		Park park = parkDao.getParkByParkCode(code);
		modelMap.addAttribute("park", park);
		List<ForecastDay> forecast = forecastDao.getForecastByPark(code);
		modelMap.addAttribute("forecast", forecast);
		return "parkDetails";
	}
	
	@RequestMapping(path="/parkForecast", method=RequestMethod.GET)
	public String displayWeatherForecast(@RequestParam String code, ModelMap modelMap) {
		List<ForecastDay> forecast = forecastDao.getForecastByPark(code);
		modelMap.addAttribute("forecast", forecast);
		return "parkForecast";
	}
	
	@RequestMapping(path="/parkForecast", method=RequestMethod.POST)
	public String updateTemperaturePreference(@RequestParam String code, Preferences preferences, ModelMap modelMap) {
		modelMap.addAttribute("preferences", preferences);
		modelMap.addAttribute("code", code);
		return "redirect:/parkForecast";
//		return "redirect:/";
	}
}
