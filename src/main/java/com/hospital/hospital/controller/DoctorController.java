package com.hospital.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospital.pojo.Doctor;
import com.hospital.hospital.service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
	private DoctorService dserv;
	
	@RequestMapping("saveDoctor")
	public void saveDoctor(@RequestBody List<Doctor> d)
	{
		dserv.saveDoctor(d);
	}
}
