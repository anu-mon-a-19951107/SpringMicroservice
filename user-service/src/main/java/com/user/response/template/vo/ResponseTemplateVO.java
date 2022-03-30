/**
 * 
 */
package com.user.response.template.vo;

import org.springframework.beans.factory.annotation.Autowired;

import com.user.VO.Department;
import com.user.entity.User;

import lombok.Data;

/**
 * @author anuantony_
 *
 */
@Data
public class ResponseTemplateVO {
	
	@Autowired
	private User user;
	
	@Autowired
	private Department department;

}
