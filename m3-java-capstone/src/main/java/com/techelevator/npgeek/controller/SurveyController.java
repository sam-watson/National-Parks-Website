package com.techelevator.npgeek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.npgeek.model.Survey;
import com.techelevator.npgeek.model.SurveyDao;

@Controller
@SessionAttributes("preferences")
public class SurveyController {
	
	private SurveyDao surveyDao;
	
	@Autowired
	public SurveyController(SurveyDao surveyDao) {
		this.surveyDao = surveyDao;
	}

	@RequestMapping(path="/surveyForm", method=RequestMethod.GET)
	public String displaySurveyForm() {
		return "surveyForm";
	}
	
	@RequestMapping(path="/surveyForm", method=RequestMethod.POST)
	public String postSurveyInput(Survey survey, ModelMap modelMap) {
		surveyDao.saveSurvey(survey);
		return "redirect:/surveyResults";
	}
	
	@RequestMapping("/surveyResults")
	public String displaySurveyResults(ModelMap modelMap) {
		surveyDao.getWinningPark();
		return "surveyResults";
	}
}
