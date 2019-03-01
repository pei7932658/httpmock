package com.cyc.httpmock.model.qinyang;

import lombok.Data;

@Data
public class ThirdLoginRequest {

	/**
	 * 用户名
	 */
	private String user;

	/**
	 * 用户密码
	 */
	private String password;
}
