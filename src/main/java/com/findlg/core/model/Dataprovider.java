package com.findlg.core.model;

import java.util.List;

public class Dataprovider {
	private String dataprovider;
public List<datapoint>datapoint;
public Dataprovider(List<datapoint> datapoint) {
	this.datapoint=datapoint;
}
public String getDataprovider() {
	return dataprovider;
}
public void setDataprovider(String dataprovider) {
	this.dataprovider = dataprovider;
}
public List<datapoint> getDatapoint() {
	return datapoint;
}
public void setDatapoint(List<datapoint> datapoint) {
	this.datapoint = datapoint;
}

/*public datapoint[] getDatapoint() {
	return datapoint;
}
public void setDatapoint(datapoint[] datapoint) {
	this.datapoint = datapoint;
}*/
	
	/*public datapoint[] getDatapoint() {
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
	

	public Dataprovider(String dataprovider) {
		super();
		this.dataprovider = dataprovider;
	}

	public Dataprovider() {
		
	}

	public String getDataprovider() {
		return dataprovider;
	}

	public void setDataprovider(String dataprovider) {
		this.dataprovider = dataprovider;
	}
	*/

}
