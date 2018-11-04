package com.hospital.hospital.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospital.pojo.Patient;
import com.hospital.hospital.service.PatientService;

@RestController
@RequestMapping("patient")
public class PatientController {
	@Autowired
	private PatientService pserv;
	
	@PostMapping
	public void savePatient(@RequestBody Patient patient)
	{
		pserv.savePatient(patient);
	}
	
	@PostMapping("/all")
	public void savePatients(@RequestBody List<Patient> patients)
	{
		pserv.savePatients(patients);
	}
	
	@GetMapping("/byMedicineName/{name}")
	public List<Object[]> getPatientByMedicineName(@PathVariable("name") String medicineName)
	{
		return pserv.getPatientByMedicineName(medicineName);
	}
	
	@GetMapping("/byComplaints/{id}")
	public List<Object[]> getDoctorByComplaints(@PathVariable("id") Long id)
	{
		return pserv.getDoctorByComplaints(id);
	}
	
	@GetMapping("/byDisease/{name}")
	public List<String> getPatientByDisease(@PathVariable("name") String name)
	{
		return pserv.getPatientByDisease(name);
	}
	
	@GetMapping("/byDoctor/{name}")
	public List<String> getPatientByDoctor(@PathVariable("name") String name)
	{
		return pserv.getPatientByDoctor(name);
	}
	
	@GetMapping("/byPatient/{name}")
	public List<String> getDoctorByPatient(@PathVariable("name") String name)
	{
		return pserv.getDoctorByPatient(name);
	}
	
	@GetMapping("/byDate/{date1}")
	public List<Object[]> getAppointmentsAndPatientsByDate(@PathVariable("date1") @DateTimeFormat(pattern="yyyy-MM-dd") Date date)
	{
		List<Object[]> data = pserv.getAppointmentsAndPatientsByDate(date);
		return data;
	}
	
	@GetMapping("/byDates/{date1}/{date2}")
	public List<Object[]> getPatientAndVisitByDate(@PathVariable("date1")
			@DateTimeFormat(pattern="yyyy-MM-dd") Date date1,
			@PathVariable("date2")
			@DateTimeFormat(pattern="yyyy-MM-dd") Date date2)
	{
		return pserv.getPatientAndVisitByDate(date1, date2);
	}
}
