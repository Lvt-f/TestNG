package log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
    private static final Logger log = LogManager.getLogger(LoggingDemo.class.getName());
    public static void main(String[] args){
        log.debug("Debug message logged");
        log.error("Debug message error");
        log.fatal("Debug message fatal");
        log.trace("Debug message trace");
        log.info("Debug message info");
    }
}
