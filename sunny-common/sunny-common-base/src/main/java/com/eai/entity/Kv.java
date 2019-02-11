package com.eai.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Kv<K, V> implements Serializable {

	private static final long serialVersionUID = -7712636075929650779L;

	/**
	 * Instantiates a new Kv.
	 */
	public Kv() {
	}

	/**
	 * Instantiates a new Kv.
	 *
	 * @param key   the key
	 * @param value the value
	 */
	public Kv(K key, V value) {
		this.key = key;
		this.value = value;
	}

	/**
	 * key
	 */
	private K key;
	/**
	 * value
	 */
	private V value;

}