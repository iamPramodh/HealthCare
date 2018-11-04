package com.hospital.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospital.pojo.Complaints;
import com.hospital.hospital.service.ComplaintsService;

@RestController
@RequestMapping("complaints")
public class ComplaintsController {
	@Autowired
	private ComplaintsService complaintsService;
	@PostMapping
	public void saveComplaints(@RequestBody Complaints complaint)
	{
		complaintsService.saveComplaints(complaint);
	}
	@PostMapping("/all")
	public void saveAllComplaints(@RequestBody List<Complaints> complaints)
	{
		complaintsService.saveAllComplaints(complaints);
	}
}
