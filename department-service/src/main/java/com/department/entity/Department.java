/**
 * 
 */
package com.department.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author anuantony_
 *
 */
@Entity
@Table(name = "department")

@Data
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "department_id")
	private Long departmentId;

	@Column(name = "department_name")
	private String departmentName;

	@Column(name = "department_address")
	private String departmentAddress;

	@Column(name = "department_code")
	private String departmentCode;

}
