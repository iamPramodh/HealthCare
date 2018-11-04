package com.hospital.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospital.pojo.Appointment;
import com.hospital.hospital.service.AppointmentService;
@RestController
@RequestMapping("appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping
	public void saveAppointment(@RequestBody Appointment appointment)
	{
		appointmentService.saveAppointment(appointment);
	}

	@PostMapping("/all")
	public void saveAllAppointment(@RequestBody List<Appointment> appointments)
	{
		appointmentService.saveAllAppointment(appointments);
	}
}
