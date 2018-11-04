package com.hospital.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospital.Dao.ComplaintsDao;
import com.hospital.hospital.pojo.Complaints;
import com.hospital.hospital.pojo.Medication;
@Service
public class ComplaintsService {
	@Autowired
	private ComplaintsDao complaintsDao;
	
	public void saveComplaints(Complaints complaint)
	{
		List<Medication> medicationList=complaint.getMedication();
		for (Medication medication : medicationList) {
			medication.setComplaints(complaint);
		}
		
		complaintsDao.save(complaint);
	}
	
	public void saveAllComplaints(List<Complaints> complaints)
	{
		for (Complaints c : complaints) {
			List<Medication> medicationList=c.getMedication();
			for (Medication medication : medicationList) {
				medication.setComplaints(c);
			}
		}
		complaintsDao.saveAll(complaints);
	}
}
