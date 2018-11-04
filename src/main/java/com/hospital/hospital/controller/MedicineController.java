package com.hospital.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospital.pojo.Medicine;
import com.hospital.hospital.service.MedicineService;

@RestController
public class MedicineController {
	@Autowired
	private MedicineService mserv;
	@RequestMapping("saveMedicine")
	 public void saveMedicine(@RequestBody List<Medicine> m)
	 {
		 mserv.saveMedicine(m);
	 }
}
