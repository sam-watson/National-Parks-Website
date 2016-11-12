package com.techelevator.npgeek.model;

import java.util.LinkedHashMap;

public interface SurveyDao {

	public void saveSurvey(Survey survey);
	//public Park getWinningPark();
	public LinkedHashMap<Park, Integer> getParkVotes();
}
