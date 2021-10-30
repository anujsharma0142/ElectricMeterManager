package com.example.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;

//import java.util.HashSet;
//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "meter_details")

public class Meter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "meter_no")
	private long meterNo;
	
	@Column(name = "meter_name")
	private String meterName;
	
    @OneToMany(mappedBy = "meter", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<MeterData> meter_data;

	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMeterNo() {
		return meterNo;
	}
	public void setMeterNo(long meterNo) {
		this.meterNo = meterNo;
	}
	public String getMeterName() {
		return meterName;
	}
	public void setMeterName(String meterName) {
		this.meterName = meterName;
	}
	
}
