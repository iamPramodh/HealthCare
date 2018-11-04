package com.hospital.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospital.pojo.Medication;
import com.hospital.hospital.service.MedicationService;

@RestController
@RequestMapping("medication")
public class MedicationController {
	@Autowired
	private MedicationService medicationService;
	@PostMapping
	public void saveMedication(@RequestBody Medication medication)
	{
		medicationService.saveMedication(medication);
	}
	@PostMapping("/all")
	public void saveAllMedication(@RequestBody List<Medication> medications)
	{
		medicationService.saveAllMedication(medications);
	}
}
