package testLog4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogClass {

	private static org.apache.log4j.Logger log = Logger.getLogger(LogClass.class);

	public static void main(String[] args) {

		init();
		 log.setLevel(Level.WARN);

	      log.trace("Trace Message!");
	      log.debug("Debug Message!");
	      log.info("Info Message!");
	      log.warn("Warn Message!");
	      log.error("Error Message!");
	      log.fatal("Fatal Message!");
	}

	private static void init() {
		PropertyConfigurator.configure("log4j.properties");
	}

}
