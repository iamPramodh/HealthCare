package com.hospital.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.hospital.hospital.Dao.DiseaseDao;
import com.hospital.hospital.pojo.Disease;

@Service
public class DiseaseService {
	@Autowired
	private DiseaseDao disdao;
	
	public void saveDisease(@RequestBody List<Disease> d)
	{
		disdao.saveAll(d);
	}
}
