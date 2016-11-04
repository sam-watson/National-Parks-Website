package com.techelevator.npgeek.integration;

import static org.junit.Assert.assertEquals;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;

import com.techelevator.npgeek.model.JdbcSurveyDao;
import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.SurveyDao;


public class JdbcSurveyDaoTest extends DaoIntegrationTest{

	private SurveyDao dao;
	
	@Before
	public void setupDAO() {
		DataSource dataSource = getDataSource();
		dao = new JdbcSurveyDao(dataSource);
	}
	
	@Test
	public void dao_can_save_new_surveys() {
		getSetup().addParkToDatabase("P");
		getSetup().addSurveyToDatabase("P");
		Park parkWinner = dao.getWinningPark();
		assertEquals("P", parkWinner.getParkCode());
	}
	
	@Test
	public void dao_returns_the_winningest_park() {
		getSetup().addParkToDatabase("winningest");
		getSetup().addParkToDatabase("nope");
		getSetup().addParkToDatabase("sucks");
		getSetup().addParkToDatabase("lame");
		getSetup().addSurveyToDatabase("winningest");
		getSetup().addSurveyToDatabase("winningest");
		getSetup().addSurveyToDatabase("winningest");
		getSetup().addSurveyToDatabase("nope");
		getSetup().addSurveyToDatabase("sucks");
		Park parkWinner = dao.getWinningPark();
		assertEquals("winningest", parkWinner.getParkCode());
	}
}
