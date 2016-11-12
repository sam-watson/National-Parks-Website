package com.techelevator.npgeek.model;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcSurveyDao implements SurveyDao {
	
	private JdbcTemplate jdbcTemplate;
	private JdbcParkDao parkDao;

	@Autowired
	public JdbcSurveyDao(DataSource dataSource) {
	    this.jdbcTemplate = new JdbcTemplate(dataSource);
	    this.parkDao = new JdbcParkDao(dataSource);
	}

	@Override
	public void saveSurvey(Survey survey) {
		String sqlUpdateSurvey = "INSERT INTO survey_result "
				+ "(parkCode, emailAddress, state, activityLevel) "
				+ "VALUES (?,?,?,?)";
		jdbcTemplate.update(sqlUpdateSurvey, survey.getFavoritePark(), survey.getEmail(), survey.getState(), survey.getActivity());
	}

	@Override
	public LinkedHashMap<Park, Integer> getParkVotes() {
		String sqlCountAllParkVotes = "SELECT parkCode, count(parkCode) "
				+ "FROM survey_result "
				+ "GROUP BY parkCode "
				+ "ORDER BY count(parkCode) DESC";
		SqlRowSet rows = jdbcTemplate.queryForRowSet(sqlCountAllParkVotes);
		LinkedHashMap<Park, Integer> parkVotes = new LinkedHashMap<>();
		while(rows.next()) {
			Park park = null;
			String parkCode = rows.getString(0);
			park = parkDao.getParkByParkCode(parkCode);
			int votes = rows.getInt(1);
			parkVotes.put(park, votes);
		}
		return parkVotes;
	}
}
