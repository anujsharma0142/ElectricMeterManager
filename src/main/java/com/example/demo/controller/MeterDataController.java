//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.example.demo.model.MeterData;
//import com.example.demo.service.MeterDataService;
//
//@Controller
//public class MeterDataController {
//	
//	@Autowired
//	private MeterDataService meterDataService;
//	
//	//display meter list
//	@RequestMapping("/history")
//	public String History (Model model) {
//		model.addAttribute("listMeterData", meterDataService.getAllMeters());
//		return "history";
//	}
//	@GetMapping("/addData")
//	public String addData(Model model) {
//		//create model attribute to bind form data
//		MeterData meterData = new MeterData();
//		model.addAttribute("meterData", meterData);
//		return "Add_Data";
//	}
//}
