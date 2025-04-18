public class ErrorLogProcessor extends LogProcessor{

    ErrorLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    public void log(int level, String message) {
        if(level == ERRORLOG) {

            System.out.println("ERROR" + " " +message);

        }
        else {
            super.log(level, message);
        }
    }
}
