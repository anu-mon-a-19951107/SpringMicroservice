/**
 * 
 */
package com.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.department.entity.Department;

/**
 * @author anuantony_
 *
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	public Department findByDepartmentId(Long departmentId);

}
