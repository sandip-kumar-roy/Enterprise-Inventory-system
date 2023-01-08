package com.tirmizee.backend.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tirmizee.backend.api.user.data.UserDetailCriteriaDTO;
import com.tirmizee.backend.api.user.data.UserDetailPageDTO;
import com.tirmizee.backend.api.user.data.UserDetailUpdateDTO;
import com.tirmizee.core.domain.User;
import com.tirmizee.core.domain.UserDetail;
import com.tirmizee.core.repository.UserRepository;

public interface UserDao extends UserRepository {
	
	User findByEmail(String email);

	User findByUsername(String username);
	
	User findByUsername(String username, Long excludeUserId);
	
	User getUserByUserIdAndBranchCode(Long userId, String branchCode);
	
	User getUserByUsernameAndBranchCode(String username, String branchCode);

	UserDetail findDetailByUsername(String username);
	
	UserDetailUpdateDTO findDetailByUserId(Long userId);
	
	Page<UserDetailPageDTO> findPageAllUserByCriteria(Pageable pageable, UserDetailCriteriaDTO search);
	
	Page<UserDetailPageDTO> findPageBranchUserByCriteria(Pageable pageable, String branchCode, UserDetailCriteriaDTO search);
	
}
