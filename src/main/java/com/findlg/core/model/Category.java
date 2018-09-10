package com.findlg.core.model;

public class Category {
	private String category;
	private int value;
	
	public Category() {
		
	}
	public Category(String category, int value) {
		
		this.category = category;
		this.value = value;
	}
	public String getCategery() {
		return category;
		
	}
	public void setCategery(String category) {
		this.category = category;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
