package com.eai.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class UpdateStatus implements Serializable {

	private static final long serialVersionUID = 1494899235149813850L;
	/**
	 * 角色ID
	 */
	private Long id;

	/**
	 * 状态
	 */
	private Integer status;
}