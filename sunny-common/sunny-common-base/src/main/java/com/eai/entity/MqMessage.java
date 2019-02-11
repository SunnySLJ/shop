package com.eai.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MqMessage implements Serializable {

	private static final long serialVersionUID = -995670498005087805L;
	/**
	 * 消息key
	 */
	private String messageKey;

	/**
	 * topic
	 */
	private String messageTopic;
}