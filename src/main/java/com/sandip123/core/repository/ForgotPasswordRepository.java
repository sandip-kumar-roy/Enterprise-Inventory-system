package com.tirmizee.core.repository;

import com.tirmizee.core.domain.ForgotPassword;
import com.tirmizee.core.jdbcrepository.JdbcRepository;

public interface ForgotPasswordRepository extends JdbcRepository<ForgotPassword, Integer> {
	
	public static final String TB_FORGOT_PASSWORD = "FORGOT_PASSWORD";
	public static final String COL_UPDATE_DATE = "UPDATE_DATE";
	public static final String COL_CREATE_DATE = "CREATE_DATE";
	public static final String COL_EMAIL = "EMAIL";
	public static final String COL_ACCESS_IP = "ACCESS_IP";
	public static final String COL_TOKEN = "TOKEN";
	public static final String COL_USERID = "USERID";
	public static final String COL_ID = "ID";
	public static final String COL_IS_RESET = "IS_RESET";
	public static final String COL_EXPIRED_DATE = "EXPIRED_DATE";
	public static final String UPDATE_DATE = "FORGOT_PASSWORD.UPDATE_DATE";
	public static final String CREATE_DATE = "FORGOT_PASSWORD.CREATE_DATE";
	public static final String EMAIL = "FORGOT_PASSWORD.EMAIL";
	public static final String ACCESS_IP = "FORGOT_PASSWORD.ACCESS_IP";
	public static final String TOKEN = "FORGOT_PASSWORD.TOKEN";
	public static final String USERID = "FORGOT_PASSWORD.USERID";
	public static final String ID = "FORGOT_PASSWORD.ID";
	public static final String EXPIRED_DATE = "FORGOT_PASSWORD.EXPIRED_DATE";
	public static final String IS_RESET = "FORGOT_PASSWORD.IS_RESET";

}
