package com.eai.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class BaseQuery implements Serializable {

	private static final long serialVersionUID = 3319698607712846427L;

	/**
	 * 当前页
	 */
	private Integer pageNum = 1;

	/**
	 * 每页条数
	 */
	private Integer pageSize = 10;

	/**
	 * 排序
	 */
	private String orderBy;
}