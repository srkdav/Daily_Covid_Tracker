package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.service.CovidDataService;

@Controller
public class HomeController {

	@Autowired
	private CovidDataService covidDataService;

	@GetMapping("/")
	public String home(Model model) {

		model.addAttribute("locationStats", covidDataService.getAllStats());
		model.addAttribute("totalCasesValue", covidDataService.getTotal());
		return "home";
	}
}
