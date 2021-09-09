package com.stc.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stc.department.model.Department;
import com.stc.department.repository.DepartmentRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	@Autowired
	DepartmentRepo departmentRepo;

	public Department saveDepartment(Department department) {
		log.info("saveDepartment Method in DepartmentService");

		return departmentRepo.save(department);
	}

	public Department getDepartmentById(Long id) {
		log.info("getDepartmentById Method in DepartmentService");

		return departmentRepo.findByDepartmentId(id);
	}
}
