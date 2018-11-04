package com.hospital.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospital.pojo.Visiting;
import com.hospital.hospital.service.VisitingService;

@RestController
@RequestMapping("visiting")
public class VisitingController {
	
	@Autowired
	private VisitingService visitingService;
	@PostMapping
	public void saveVisiting(@RequestBody Visiting visiting)
	{
		visitingService.saveVisiting(visiting);
	}
	@PostMapping("/all")
	public void saveAllVisitings(@RequestBody List<Visiting> visitings)
	{
		visitingService.saveAllVisitings(visitings);
	}
	
}
