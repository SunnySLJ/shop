package com.eai.entity;

import org.codehaus.jackson.SerializableString;

import lombok.Data;

@Data
public class LoginAuth implements SerializableString {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = -1137852221455042256L;
	//用户ID
	private Long userId;
	//登录名
	private String loginName;
	//用户名
	private String userName;
	//组织ID
	private Long groupId;
	//组织名称
	private String groupName;

	public LoginAuth() {
	}

	public LoginAuth(Long userId, String loginName, String userName) {
		this.userId = userId;
		this.loginName = loginName;
		this.userName = userName;
	}

	public LoginAuth(Long userId, String loginName, String userName, Long groupId, String groupName) {
		this.userId = userId;
		this.loginName = loginName;
		this.userName = userName;
		this.groupId = groupId;
		this.groupName = groupName;
	}

	@Override
	public char[] asQuotedChars() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] asQuotedUTF8() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] asUnquotedUTF8() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int charLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}
}