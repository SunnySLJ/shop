package com.eai.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class CheckValid implements Serializable {
	private static final long serialVersionUID = 5178470476151416779L;
	/**
	 * 校验的参数值
	 */
	private String validValue;

	/**
	 * 参数类型(列)
	 */
	private String type;
}