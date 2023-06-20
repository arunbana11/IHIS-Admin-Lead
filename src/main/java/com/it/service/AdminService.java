package com.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.entity.AdminPlansEntity;
import com.it.repo.AdminServiceRepo;
import com.it.service.IAdminService;

@Service
public class AdminService implements IAdminService {

	@Autowired
	private AdminServiceRepo serviceRepo;
	
	@Override
	public List<AdminPlansEntity> getPlans() {

		
		
		return null;
	}

}
