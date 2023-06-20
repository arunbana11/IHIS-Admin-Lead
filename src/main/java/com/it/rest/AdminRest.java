package com.it.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.entity.AdminPlansEntity;
import com.it.service.IAdminService;

@RestController
public class AdminRest {

	@Autowired
	private IAdminService adminService;
	
	@GetMapping("/plans")
	public List<AdminPlansEntity> getPlans()
	{
		List<AdminPlansEntity> plans = adminService.getPlans();
		return plans;
	}
}
