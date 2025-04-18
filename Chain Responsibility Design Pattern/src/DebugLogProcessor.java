public class DebugLogProcessor extends LogProcessor {


     DebugLogProcessor(LogProcessor nextProcessor) {
       super(nextProcessor);
    }

    public void log(int level, String message) {
         if(level==DEBUGLOG){
             System.out.println("DEBUG" + " "+ message);
         }
         else{
             super.log(level, message);
         }
    }
}
