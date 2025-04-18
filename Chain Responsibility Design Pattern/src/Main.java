//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LogProcessor logProcessor=new ErrorLogProcessor(new DebugLogProcessor(new InfoLogProcessor(null)));

        logProcessor.log(logProcessor.DEBUGLOG,"Exceptiom happened in debug log");
        logProcessor.log(logProcessor.INFOLOG,"Exceptiom happened in info log");
        logProcessor.log(logProcessor.ERRORLOG,"Exceptiom happened in error log");
        logProcessor.log(logProcessor.DEBUGLOG,"Exceptiom happened in debug log");
        logProcessor.log(logProcessor.INFOLOG,"Exceptiom happened in info log");


    }
}