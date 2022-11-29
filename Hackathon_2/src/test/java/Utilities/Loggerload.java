package Utilities;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Loggerload {
    private static Logger logger = LogManager.getLogger(" log.properties");
	   
  	 public static void info(String message) {
		 logger.info(message); 			
		 }
	 public static void warn(String message) {
		 logger.warn(message);
		}
	 public static void error(String message) {
		 logger.error(message);
		}
	 public static void fatal(String message) {
		 logger.fatal(message);
		}
	 public static void debug(String message) {
		 logger.debug(message);
		}
}
