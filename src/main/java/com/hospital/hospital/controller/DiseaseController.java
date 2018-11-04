package com.hospital.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospital.pojo.Disease;
import com.hospital.hospital.service.DiseaseService;

@RestController
public class DiseaseController {
	@Autowired
	private DiseaseService diserv;
	
	@RequestMapping("saveDisease")
	public void saveDisease(@RequestBody List<Disease> d)
	{
		diserv.saveDisease(d);
	}
}
