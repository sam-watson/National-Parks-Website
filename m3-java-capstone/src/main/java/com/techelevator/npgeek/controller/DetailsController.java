package com.techelevator.npgeek.controller;

import com.techelevator.npgeek.model.*;

import java.util.ArrayList;
import java.util.List;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DetailsController {
	
	private ParkDao parkDao;
	
	@Autowired
	public DetailsController(ParkDao parkDao) {
		this.parkDao = parkDao;
	}
	
	
}
