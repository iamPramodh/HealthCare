package com.hospital.hospital.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.hospital.Dao.PatientDao;
import com.hospital.hospital.pojo.Patient;

@Service
public class PatientService {

	@Autowired
	private PatientDao pdao;
	
	public void savePatient(Patient patient)
	{
		pdao.save(patient);
	}
	
	public void savePatients(List<Patient> patients)
	{
		pdao.saveAll(patients);
	}
	
	public List<Object[]> getPatientByMedicineName(String medicineName)
	{
		return pdao.getPatientByMedicineName(medicineName);
	}
	
	public List<Object[]> getDoctorByComplaints(Long id)
	{
		return pdao.getDoctorByComplaints(id);
	}
	
	public List<String> getPatientByDisease(String name)
	{
		return pdao.getPatientByDisease(name);
	}
	
	public List<String> getPatientByDoctor(String name)
	{
		return pdao.getPatientByDoctor(name);
	}
	
	public List<String> getDoctorByPatient(String name)
	{
		return pdao.getDoctorByPatient(name);
	}
	
	public List<Object[]> getAppointmentsAndPatientsByDate(Date date)
	{
		return pdao.getAppointmentsAndPatientsByDate(date);
	}
	
	public List<Object[]> getPatientAndVisitByDate(Date date1,Date date2)
	{
		return pdao.getPatientAndVisitByDate(date1, date2);
	}
	
}
