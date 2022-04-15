package MyLogger;

public class LogManager {
    
    public static LoggerType getLogger(){
        DebugLogger debugLogger = new DebugLogger(3,null);
        ErrorLogger errorLogger = new ErrorLogger(2,debugLogger);
        InfoLogger infoLogger = new InfoLogger(1,errorLogger);
        
        return infoLogger;
    }
}
