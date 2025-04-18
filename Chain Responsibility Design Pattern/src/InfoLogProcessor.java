import java.util.logging.Level;

public class InfoLogProcessor extends LogProcessor {

    InfoLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }
    public void log(int  level, String message) {
        if(level == INFOLOG) {
            System.out.println("INFO LOG" + " "+ message);
        }
        else {
            super.log(level, message);
        }
    }
}
