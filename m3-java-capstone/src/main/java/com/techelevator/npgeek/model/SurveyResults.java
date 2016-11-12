package com.techelevator.npgeek.model;

import java.util.LinkedHashMap;

public class SurveyResults {
	
	private LinkedHashMap<Park, Integer> parkVotes = new LinkedHashMap<>();
	
	public Park getWinningPark() {
		Park winningPark = null;
		int highVotes = 0;
		for (Park park : parkVotes.keySet()) {
			if (highVotes == parkVotes.get(park)) {
				return null;
			}
			if (highVotes > parkVotes.get(park)) {
				break;
			} else {
				winningPark = park;
			}
		}
		return winningPark;
	}

}
