package kr.kro.wonmyee.debug;

import kr.kro.wonmyee.Japdahan;
import org.apache.logging.log4j.Level;

public class LogHelper {

    public static void info(String log) {
        Japdahan.logger.log(Level.INFO, log);
    }

    public static void warn(String log) {
        Japdahan.logger.log(Level.WARN, log);
    }

    public static void error(String log) {
        Japdahan.logger.log(Level.ERROR, log);
    }

    public static void fatal(String log) {
        Japdahan.logger.log(Level.FATAL, log);
    }

    public static void all(String log) {
        Japdahan.logger.log(Level.ALL, log);
    }

    public static void debug(String log) {
        if(DebugMode.isDebugMode) {
            Japdahan.logger.log(Level.WARN, log);
        } else {
            Japdahan.logger.log(Level.DEBUG, log);
        }
    }
}
