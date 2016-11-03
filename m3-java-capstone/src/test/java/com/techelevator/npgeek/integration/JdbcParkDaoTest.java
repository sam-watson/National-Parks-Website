package com.techelevator.npgeek.integration;
import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;

import com.techelevator.npgeek.model.JdbcParkDao;
import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.ParkDao;

public class JdbcParkDaoTest extends DaoIntegrationTest {

	private ParkDao dao;

	@Before
	public void setupDAO() {
		DataSource dataSource = getDataSource();
		dao = new JdbcParkDao(dataSource);
	}

	@Test
	public void dao_returns_all_parks() {
		getSetup().addParkToDatabase("1");
		getSetup().addParkToDatabase("2");
		getSetup().addParkToDatabase("3");
		List<Park> parks = dao.getAllParks();
		assertEquals(3, parks.size());
	}
	
	@Test
	public void dao_returns_specific_park_for_code() {
		getSetup().addParkToDatabase("1");
		getSetup().addParkToDatabase("2");
		getSetup().addParkToDatabase("3");
		Park park = dao.getParkByParkCode("2");
		assertEquals("2", park.getParkCode());
	}
}
