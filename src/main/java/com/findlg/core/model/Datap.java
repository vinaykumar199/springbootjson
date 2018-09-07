package com.findlg.core.model;

public class Datap {
	private String dataprovider;
	public String getDataprovider() {
		return dataprovider;
	}

	public void setDataprovider(String dataprovider) {
		this.dataprovider = dataprovider;
	}

	public datapoint[] datapoint;

	public datapoint[] getDatapoint() {
		return datapoint;
	}

	public void setDatapoint(datapoint[] datapoint) {
		this.datapoint = datapoint;
	}

	public Datap(com.findlg.core.model.datapoint[] datapoint) {
		super();
		this.datapoint = datapoint;
	}

	public Datap() {
		
	}
	

}
