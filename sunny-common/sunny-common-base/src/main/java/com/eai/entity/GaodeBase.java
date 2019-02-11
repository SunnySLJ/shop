package com.eai.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class GaodeBase implements Serializable{

	private static final long serialVersionUID = 5894304327211503218L;
	/**
	 * 状态
	 */
	private String status;

	/**
	 * 响应信息
	 */
	private String info;

	/**
	 * 响应编码
	 */
	private String infocode;
}