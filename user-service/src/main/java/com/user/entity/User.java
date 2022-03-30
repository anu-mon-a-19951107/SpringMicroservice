/**
 * 
 */
package com.user.entity;

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
@Table(name = "user_table")

@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long userId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "department_id")
	private Long departmentId;
	
	
	/*
	 * { "firstName":"Anu", "lastName":"Antony", "email":"anuantony@gmail.com",
	 * "departmentId":"2" }
	 */
}
