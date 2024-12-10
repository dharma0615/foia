package com.hcl.foia;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FoiaLogging {

	static Logger logger = LogManager.getLogger(FoiaLogging.class);

	public static void main(String[] args) {
		try {
			logger.info("information logging");
			System.out.println("information logging");
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}