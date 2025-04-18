public abstract class LogProcessor {


    public static int INFOLOG=1;
    public static int DEBUGLOG=2;
    public static int ERRORLOG=3;

    LogProcessor nextProcessor; // this will help for next processor

    public LogProcessor(LogProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void log(int level, String message) {
        if(nextProcessor != null) {
            nextProcessor.log(level, message);
        }
    }

}
