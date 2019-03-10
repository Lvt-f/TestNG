package log4jtutorial;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingConsole {
    private static final Logger log = LogManager.getLogger(LoggingConsole.class.getName());
    public static void main(String[] args){
        log.debug("Debug message logged");
        log.error("Debug message error");
        log.fatal("Debug message fatal");
    }
}
