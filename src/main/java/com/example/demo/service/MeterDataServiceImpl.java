package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MeterData;
import com.example.demo.repository.MeterDataRepository;


@Service
public class MeterDataServiceImpl implements MeterDataService {
	
	@Autowired
	private MeterDataRepository meterDataRepository;
	
	@Override
	public List<MeterData> getAllMeters() {
		return meterDataRepository.findAll();
	}
	
	@Override
	public void saveMeterData(MeterData meterData) {
		this.meterDataRepository.save(meterData);
	}
}
