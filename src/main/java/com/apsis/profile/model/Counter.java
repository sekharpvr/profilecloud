package com.apsis.profile.model;

/**
 * Model class used to hold the Counter Name and it's corresponding Value.
 * @author sekhar
 *
 */
public class Counter {

	private String counterName;
	private int value;
	
	public Counter(String counterName, int value) {
		this.counterName = counterName;
		this.value = value;
		
	}

	public String getCounterName() {
		return counterName;
	}

	public void setCounterName(String counterName) {
		this.counterName = counterName;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
