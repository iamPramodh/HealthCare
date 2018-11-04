package com.hospital.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.hospital.hospital.Dao.MedicineDao;
import com.hospital.hospital.pojo.Medicine;

@Service
public class MedicineService {
	@Autowired
	private MedicineDao meddao;
	
	public void saveMedicine(@RequestBody List<Medicine> m)
	{
		meddao.saveAll(m);
	}
}
