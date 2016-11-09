package com.techelevator.npgeek.model;

import java.util.HashMap;

public interface SurveyDao {

	public void saveSurvey(Survey survey);
	//public Park getWinningPark();
	public HashMap<Park, Integer> getParkVotes();
}
