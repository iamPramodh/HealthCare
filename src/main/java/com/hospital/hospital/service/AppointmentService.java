 package com.hospital.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospital.Dao.AppointmentDao;
import com.hospital.hospital.pojo.Appointment;
@Service
public class AppointmentService {
	@Autowired
	private AppointmentDao appointmentDao;
	
	public void saveAppointment(Appointment appointment)
	{
		appointmentDao.save(appointment);
	}
	
	public void saveAllAppointment(List<Appointment> appointments)
	{
		appointmentDao.saveAll(appointments);
	}
}
