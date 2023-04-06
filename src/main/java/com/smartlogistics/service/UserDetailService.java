package com.smartlogistics.service;

import com.smartlogistics.dto.LoginRequestDetails;
import com.smartlogistics.dto.LoginResponseDetails;
import com.smartlogistics.dto.LogoutDTO;
import com.smartlogistics.dto.UserDetailDTO;
import com.smartlogistics.entity.UserDetailEntity;
import com.smartlogistics.util.CommonUtils.Roles;

public interface UserDetailService {

	LoginResponseDetails userLogin(LoginRequestDetails loginRequestDetails);

	boolean userLogout(LogoutDTO dto);

	UserDetailEntity registerUser(UserDetailDTO userDetails, Roles role);

}
