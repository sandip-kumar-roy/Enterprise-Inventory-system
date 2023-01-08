package com.tirmizee.core.repository;

import com.tirmizee.core.domain.Profile;
import com.tirmizee.core.jdbcrepository.JdbcRepository;

public interface ProfileRepository extends JdbcRepository<Profile, Long> {

	public static final String TB_PROFILE = "PROFILE";
	public static final String COL_PROFILE_BYTE = "PROFILE_BYTE";
	public static final String COL_BRANCH_CODE = "BRANCH_CODE";
	public static final String COL_TEL = "TEL";
	public static final String COL_SUB_DISTRICT_CODE = "SUB_DISTRICT_CODE";
	public static final String COL_CITIZEN_ID = "CITIZEN_ID";
	public static final String COL_EMAIL = "EMAIL";
	public static final String COL_PROFILE_IMAGE = "PROFILE_IMAGE";
	public static final String COL_UPDATE_DATE = "UPDATE_DATE";
	public static final String COL_CREATE_DATE = "CREATE_DATE";
	public static final String COL_LAST_NAME = "LAST_NAME";
	public static final String COL_FIRST_NAME = "FIRST_NAME";
	public static final String COL_PROFILE_ID = "PROFILE_ID";
	public static final String PROFILE_BYTE = "PROFILE.PROFILE_BYTE";
	public static final String BRANCH_CODE = "PROFILE.BRANCH_CODE";
	public static final String TEL = "PROFILE.TEL";
	public static final String SUB_DISTRICT_CODE = "PROFILE.SUB_DISTRICT_CODE";
	public static final String CITIZEN_ID = "PROFILE.CITIZEN_ID";
	public static final String EMAIL = "PROFILE.EMAIL";
	public static final String PROFILE_IMAGE = "PROFILE.PROFILE_IMAGE";
	public static final String UPDATE_DATE = "PROFILE.UPDATE_DATE";
	public static final String CREATE_DATE = "PROFILE.CREATE_DATE";
	public static final String LAST_NAME = "PROFILE.LAST_NAME";
	public static final String FIRST_NAME = "PROFILE.FIRST_NAME";
	public static final String PROFILE_ID = "PROFILE.PROFILE_ID";
	
}
