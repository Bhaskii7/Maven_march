package com.logger.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logger_configurator {
	
	//factory design pattern
	
	 static Logger log= Logger.getLogger(Logger_configurator.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties"); //configuration
		
		log.debug("debug");
		log.info("info");
		log.warn("warning");
		log.error("ff");
		log.fatal("fatal");
		
		
	}

}
