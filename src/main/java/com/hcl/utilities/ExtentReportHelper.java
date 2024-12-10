package com.hcl.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportHelper {
	
	ExtentReports extent=new ExtentReports();
	ExtentSparkReporter sparkReport=new ExtentSparkReporter("./spark.html");
	
}
