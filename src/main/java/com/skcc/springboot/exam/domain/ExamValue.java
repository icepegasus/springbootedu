package com.skcc.springboot.exam.domain;

public class ExamValue {
	
	String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ExamValue [value=" + value + "]";
	}
	
	
}
