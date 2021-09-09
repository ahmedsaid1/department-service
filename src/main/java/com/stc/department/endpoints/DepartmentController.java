package com.stc.department.endpoints;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stc.department.model.Department;
import com.stc.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("departments")
@Slf4j
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;
	@PostMapping
	public Department saveDepartment(@RequestBody Department department) {
	    log.info("saveDepartment Method in DepartmentController");
		return departmentService.saveDepartment(department);
	}
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable Long id) {
	    log.info("getDepartmentById Method in DepartmentController");

		return departmentService.getDepartmentById(id);
	}
}
