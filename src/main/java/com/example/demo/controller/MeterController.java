package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Meter;
import com.example.demo.model.MeterData;
import com.example.demo.service.MeterDataService;
import com.example.demo.service.MeterService;

@Controller
public class MeterController {

	@Autowired
	private MeterService meterService;
	
	//display meter list
	@RequestMapping("/")
	public String viewHomePage (Model model) {
		model.addAttribute("listMeter", meterService.getAllMeters());
		return "meters";
	}
	
	@GetMapping("/addMeter")
	public String addMeter(Model model) {
		//create model attribute to bind form data
		Meter meter = new Meter();
		model.addAttribute("meter", meter);
		return "new_meter";
	}
	
	@PostMapping("/saveMeter")
	public String saveMeter(@ModelAttribute("meter") Meter meter) {
        // save employee to database
        meterService.saveMeter(meter);
        return "redirect:/";
	}
	
	@GetMapping("/deleteMeter/{id}")
	public String deleteMeter(@PathVariable (value = "id") long id) {
		//call delete meter method
		this.meterService.deleteMeterById(id);
		return "redirect:/";
	}
	
	@Autowired
	private MeterDataService meterDataService;
	
	//display meter list
	@RequestMapping("/history")
	public String History (Model model) {
		model.addAttribute("listMeterData", meterDataService.getAllMeters());
		return "history";
	}
	@GetMapping("/addData")
	public String addData(Model model) {
		//create model attribute to bind form data
		MeterData meterData = new MeterData();
		model.addAttribute("meterData", meterData);
		return "Add_Data";
	}
	
	@PostMapping("/saveMeterData")
	public String saveMeterData(@ModelAttribute("meterData") MeterData meterData) {
        // save employee to database
        meterDataService.saveMeterData(meterData);
        return "history";
	}
}
