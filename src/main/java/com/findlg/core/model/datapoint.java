package com.findlg.core.model;

public class datapoint {
private String date;
private int value;
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public datapoint(String date, int value) {
	super();
	this.date = date;
	this.value = value;
}
public datapoint() {
	
}

}
