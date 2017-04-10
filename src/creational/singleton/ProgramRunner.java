package creational.singleton;

/**
 * Created by almayce on 05.04.17.
 */
public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger logger = ProgramLogger.getProgramLogger();
        logger.addLogInfo("First log...");
        logger.addLogInfo("Second log...");
        logger.addLogInfo("Third log...");

        logger.showLogFile();
    }
}
