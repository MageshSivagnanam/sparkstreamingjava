package com.streaming.utils;

import org.apache.spark.sql.SparkSession;

/**
 * This class has set of spark related  utility methods
 * @author Magesh
 * 30/06/2019
 */

public class SparkUtils {

	private SparkSession sparkSession = null;
	
	
	
	public SparkSession getSparkSession() {
		 if (sparkSession == null) {
			  sparkSession =  SparkSession.builder().getOrCreate();
		 }
		 return sparkSession;
	}
	
}
