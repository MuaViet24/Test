package com.TestGitRepo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LoggingConcept {

	public static void main(String[] args) {
		
		Logger log = Logger.getLogger(LoggingConcept.class) ;
		BasicConfigurator.configure(); //Basic configuration for logd4j
		log.trace("TRACE");
		log.debug("DEBUG");
		log.info("INFO");
		log.warn("WARN");
		log.error("ERROR");
		log.fatal("FATAL");

	}

}
