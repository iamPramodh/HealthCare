package com.hospital.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospital.Dao.VisitingDao;
import com.hospital.hospital.pojo.Visiting;
@Service
public class VisitingService {
	@Autowired
	private VisitingDao visitingDao;
	
	public void saveVisiting(Visiting visiting)
	{
		visitingDao.save(visiting);
	}
	
	public void saveAllVisitings(List<Visiting> visitings)
	{
		visitingDao.saveAll(visitings);
	}
}
