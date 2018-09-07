package com.findlg.core.controler;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.findlg.core.model.Application;
import com.findlg.core.model.ChartContainer;
import com.findlg.core.model.Data;
import com.findlg.core.model.Datap;
import com.findlg.core.model.Title;
import com.findlg.core.model.datapoint;
import com.findlg.core.model.datapoints;

@RestController
@RequestMapping("/FINDLG")
public class RestControler {

	@GetMapping(path = "/getJSON", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> doGetJson() {

		Application application = new Application();
		ChartContainer chartContainer = new ChartContainer();
		Title title = new Title();
		Data data = new Data();
		datapoints dataPoints01 = new datapoints();
		datapoints dataPoints02 = new datapoints();
		datapoints dataPoints03 = new datapoints();
		datapoints dataPoints04 = new datapoints();
		datapoints dataPoints05 = new datapoints();
		// Data datapoints[]=new Data();
		ArrayList<Data> al = new ArrayList<Data>();
		title.setText("Montly Expense");
		chartContainer.setTheme("light2");
		chartContainer.setAnimationEnabled(true);
		chartContainer.setExportEnabled(true);
		data.setType("pie");
		data.setShowInLegend(true);
		dataPoints01.setY(450);
		dataPoints01.setName("Food");
		dataPoints02.setY(120);
		dataPoints02.setName("Insurance");
		dataPoints03.setY(300);
		dataPoints03.setName("Traveling");
		dataPoints04.setY(800);
		dataPoints04.setName("Housing");
		dataPoints05.setY(150);
		dataPoints05.setName("Education");
		al.add(data);

		data.setDatapoints(new datapoints[] { dataPoints01, dataPoints02, dataPoints03, dataPoints04, dataPoints05 });
		chartContainer.setTitle(title);
		chartContainer.setData(al);
		application.setChartContainer(chartContainer);

		/*
		 * ob.setAdd("Manjera trinity"); ob.setAge(28); ob.setName("Madhu");
		 * ob.setPincode(500090);
		 */

		return new ResponseEntity<>(application, HttpStatus.OK);

	}

	
	//@GetMapping(path = "/getJSON", produces = { MediaType.APPLICATION_JSON_VALUE })
	@RequestMapping("/getALL")
	public List<datapoint> getAll()
	{
		Datap dataprovider=new Datap();
		dataprovider.setDataprovider("dataprovider");
		//dataprovider.setDataprovider(dataprovider);
	return Arrays.asList(new datapoint("2012-07-27",13),new datapoint("2012-07-28",11),
			new datapoint("2012-07-29",15),new datapoint("2012-07-30",16),new datapoint("2012-07-31",18),
			new datapoint("2012-08-01",13),new datapoint("2012-08-02",22),new datapoint("2012-08-03",23),
			new datapoint("2012-08-04",20),new datapoint("2012-08-05",17),new datapoint("2012-08-06",16),
			new datapoint("2012-08-07",18),new datapoint("2012-08-08",21),new datapoint("2012-08-09",26),
			new datapoint("2012-08-10",24),new datapoint("2012-08-11",29),new datapoint("2012-08-12",32),
			new datapoint("2012-08-13",18),new datapoint("2012-08-14",24),new datapoint("2012-08-15",22),
			new datapoint("2012-08-16",18),new datapoint("2012-08-17",19),new datapoint("2012-08-18",14),
			new datapoint("2012-08-19",15),new datapoint("2012-08-20",12),new datapoint("2012-08-21",8),
			new datapoint("2012-08-22",9),new datapoint("2012-08-23",8),new datapoint("2012-08-24",7),
			new datapoint("2012-08-25",5),new datapoint("2012-08-26",11),new datapoint("2012-08-27",13),
			new datapoint("2012-08-28",18),new datapoint("2012-08-29",20),new datapoint("2012-08-30",29),
			new datapoint("2012-08-31",33),new datapoint("2012-09-01",42),new datapoint("2012-09-02",35),
			new datapoint("2012-09-03",31),new datapoint("2012-09-04",47),new datapoint("2012-09-05",52),
			new datapoint("2012-09-06",46),new datapoint("2012-09-07",41),new datapoint("2012-09-08",43),
			new datapoint("2012-09-09",40),new datapoint("2012-09-10",39),new datapoint("2012-08-11",34),
			new datapoint("2012-09-11",29),new datapoint("2012-09-13",34),new datapoint("2012-09-14",37),
			new datapoint("2012-09-15",42),new datapoint("2012-09-16",49),new datapoint("2012-09-17",46)
			,new datapoint("2012-09-18",47)
			,new datapoint("2012-09-19",55)
			,new datapoint("2012-09-20",59),new datapoint("2012-09-21",58),new datapoint("2012-09-22",57)
			,new datapoint("2012-09-23",61),new datapoint("2012-09-24",59),new datapoint("2012-09-25",67)
			,new datapoint("2012-09-26",65),new datapoint("2012-09-27",61),new datapoint("2012-09-28",66)
			,new datapoint("2012-09-29",69),new datapoint("2012-09-30",71),new datapoint("2012-10-01",67)
			,new datapoint("2012-10-02",63),new datapoint("2012-10-03",46),new datapoint("2012-10-04",32)
			,new datapoint("2012-10-05",21),new datapoint("2012-10-06",18),new datapoint("2012-10-07",21)
			,new datapoint("2012-10-08",28),new datapoint("2012-10-09",27),new datapoint("2012-10-10",36)
			,new datapoint("2012-10-11",33),new datapoint("2012-10-12",31),new datapoint("2012-10-13",30)
			,new datapoint("2012-10-14",34),new datapoint("2012-10-15",38),new datapoint("2012-10-16",37),
			new datapoint("2012-10-17",44)
			,new datapoint("2012-10-18",49),new datapoint("2012-10-19",53),new datapoint("2012-10-20",57)
			,new datapoint("2012-10-21",60),new datapoint("2012-10-22",61),new datapoint("2012-10-23",69)
			,new datapoint("2012-10-24",67),new datapoint("2012-10-25",72),new datapoint("2012-10-26",77)
			,new datapoint("2012-10-27",75),new datapoint("2012-10-28",70),new datapoint("2012-10-29",72),
			new datapoint("2012-10-30",70),new datapoint("2012-10-31",72)
			
			,new datapoint("2012-11-01",73)
			,new datapoint("2012-11-02",67),new datapoint("2012-11-03",68),new datapoint("2012-11-04",65)
			,new datapoint("2012-11-05",71),new datapoint("2012-11-06",75),new datapoint("2012-11-07",74)
			,new datapoint("2012-11-08",71),new datapoint("2012-11-09",76),new datapoint("2012-11-10",77)
			,new datapoint("2012-11-11",81),new datapoint("2012-11-12",83),new datapoint("2012-11-13",80)
			,new datapoint("2012-11-14",81),new datapoint("2012-11-15",87),new datapoint("2012-11-16",82)
			,new datapoint("2012-11-17",86),new datapoint("2012-11-18",80),new datapoint("2012-11-19",87)
			,new datapoint("2012-11-20",83),new datapoint("2012-11-21",85),new datapoint("2012-11-22",84)
			,new datapoint("2012-11-23",82),new datapoint("2012-11-24",73),new datapoint("2012-11-25",71)
			,new datapoint("2012-11-26",75),new datapoint("2012-11-27",79),new datapoint("2012-11-28",70),
			new datapoint("2012-11-29",73),new datapoint("2012-11-30",61)
			,new datapoint("2012-12-01",62),new datapoint("2012-12-02",66),new datapoint("2012-12-03",65)
			,new datapoint("2012-12-04",73),new datapoint("2012-12-05",79),new datapoint("2012-12-06",78)
			,new datapoint("2012-12-07",78),new datapoint("2012-12-08",78),new datapoint("2012-12-09",74)
			,new datapoint("2012-12-10",73),new datapoint("2012-12-11",75),new datapoint("2012-12-12",70)
			,new datapoint("2012-12-13",77),new datapoint("2012-12-14",67),new datapoint("2012-12-15",62)
			,new datapoint("2012-12-16",64),new datapoint("2012-12-17",61),new datapoint("2012-12-18",59)
			,new datapoint("2012-12-19",53),new datapoint("2012-12-20",54),new datapoint("2012-12-21",56)
			,new datapoint("2012-12-22",59),new datapoint("2012-12-23",58),new datapoint("2012-12-24",55)
			,new datapoint("2012-12-25",52),new datapoint("2012-12-26",54),new datapoint("2012-12-27",50)
			,new datapoint("2012-12-28",50),new datapoint("2012-12-29",51),new datapoint("2012-12-30",52)
			,new datapoint("2012-12-31",58)
			,new datapoint("2013-01-01",60),new datapoint("2013-01-02",67),new datapoint("2013-01-03",64)
			,new datapoint("2013-01-04",66),new datapoint("2013-01-05",60),new datapoint("2013-01-06",63)
			,new datapoint("2013-01-07",61),new datapoint("2013-01-08",60),new datapoint("2013-01-09",65)
			,new datapoint("2013-01-10",75),new datapoint("2013-01-11",77),new datapoint("2013-01-12",78)
			,new datapoint("2013-01-13",70),new datapoint("2013-01-14",70),new datapoint("2013-01-15",73)
			,new datapoint("2013-01-16",71),new datapoint("2013-01-17",74),new datapoint("2013-01-18",78)
			,new datapoint("2013-01-19",85),new datapoint("2013-01-20",82),new datapoint("2013-01-21",83)
			,new datapoint("2013-01-22",88),new datapoint("2013-01-23",85),new datapoint("2013-01-24",85)
			,new datapoint("2013-01-25",80),new datapoint("2013-01-26",87),new datapoint("2013-01-27",84)
			,new datapoint("2013-01-28",83),new datapoint("2013-01-29",84),new datapoint("2013-01-30",81));
	}
	
	}
	
	

