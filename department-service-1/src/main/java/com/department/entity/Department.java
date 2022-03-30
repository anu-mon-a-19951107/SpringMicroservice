/**
 * 
 */
package com.department.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author anuantony_
 *
 */
@Entity
@Table(name = "department")

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
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
