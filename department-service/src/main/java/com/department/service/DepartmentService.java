/**
 * 
 */
package com.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.entity.Department;
import com.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anuantony_
 *
 */
@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment method of DepartmentRepository");
		return departmentRepository.save(department);
	}

	
	public Department findDepartmentById(Long departmentId) {
		log.info("Inside findDepartmentById method of DepartmentRepository");
		return departmentRepository.findByDepartmentId(departmentId);
	}

}
