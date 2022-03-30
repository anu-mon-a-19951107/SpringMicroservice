/**
 * 
 */
package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.User;

/**
 * @author anuantony_
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUserId(Long userId);

}
