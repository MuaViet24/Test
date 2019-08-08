package com.TestGitRepo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggingPropertiesConcept {

	public static void main(String[] args) {
		
		Logger log = Logger.getLogger(LoggingPropertiesConcept.class);
		PropertyConfigurator.configure("C:\\Stuff\\Reetu\\WorkSpace\\TestGitRepo\\log4j.properties");
		
		log.trace("TRACE");
		log.debug("DEBUG");
		log.info("INFO");
		log.warn("WARN");
		log.error("ERROR");
		log.fatal("FATAL");
		

	}

}
