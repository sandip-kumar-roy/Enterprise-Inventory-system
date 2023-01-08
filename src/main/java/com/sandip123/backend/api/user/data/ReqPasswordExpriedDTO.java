package com.tirmizee.backend.api.user.data;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

import com.tirmizee.core.hibernate.validator.FieldMatch;

import lombok.Data;

@Data
@FieldMatch(
	field = "newPassword",
	fieldMatch = "newPasswordConfirm",
	message = "The password fields must match" )
public class ReqPasswordExpriedDTO implements Serializable {

	private static final long serialVersionUID = 1390482383074497675L;
	
	@NotEmpty
	private String oldPassword;
	
	@NotEmpty
	private String newPassword;
	
	@NotEmpty
	private String newPasswordConfirm;

}
