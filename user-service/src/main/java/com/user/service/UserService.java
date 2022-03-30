/**
 * 
 */
package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.VO.Department;
import com.user.entity.User;
import com.user.repository.UserRepository;
import com.user.response.template.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anuantony_
 *
 */
@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("inside saveUser method of UserService");
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		log.info("inside getUserWithDepartment method of UserService");

		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();

		User user = userRepository.findByUserId(userId);

		Department department = restTemplate.getForObject("http://localhost:9001/department/" + user.getDepartmentId(),
				Department.class);
		responseTemplateVO.setUser(user);
		responseTemplateVO.setDepartment(department);

		return responseTemplateVO;
	}

}
