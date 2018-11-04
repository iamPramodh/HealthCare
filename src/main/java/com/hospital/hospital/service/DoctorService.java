package com.hospital.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.hospital.hospital.Dao.DoctorDao;
import com.hospital.hospital.pojo.Doctor;

@Service
public class DoctorService {
	@Autowired
	private DoctorDao ddao;
	
	public void saveDoctor(@RequestBody List<Doctor> d)
	{
		ddao.saveAll(d);
	}
}
