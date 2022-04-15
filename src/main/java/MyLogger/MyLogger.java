package MyLogger;

import java.io.Serializable;
import java.util.ConcurrentModificationException;

public class MyLogger implements Serializable, Cloneable {
    
    private static MyLogger logger;
    private static LoggerType loggerType;
    private MyLogger(){
        if(logger!=null){
            throw new IllegalStateException("Logger is already present");
        }
    }
    
    public static MyLogger getInstance(){
        if(logger == null){
            synchronized (MyLogger.class){
                if(logger ==null)
                    logger = new MyLogger();
                    loggerType = LogManager.getLogger();
            }
        }
        return logger;
    }
    
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
    
    protected Object readResolve(){
        return logger;
    }
    
    private static void logMessage(int val, String msg){
        loggerType.logMessage(val,msg);
    }
    
    public static void info(String msg){
        logMessage(1,msg);
    }
    
    public static void error(String msg){
        logMessage(2,msg);
    }
    
    public static void debug(String msg){
        logMessage(3, msg);
    }
}
