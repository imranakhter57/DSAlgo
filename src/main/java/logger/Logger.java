package logger;

import java.io.Serializable;

public class Logger implements Serializable, Cloneable {
    private volatile static Logger logger;
    private volatile static AbstractLogger chainOfLogger;
    private volatile static LogSubject logSubject;
    private Logger(){
        if(logger!= null){
            throw new IllegalStateException("Object already exists");
        }
    }
    
    public static Logger getInstance(){
        if(logger == null){
            synchronized (Logger.class) {
                if(logger==null)
                    logger = new Logger();
                    chainOfLogger = LogManager.buildChainOfLogger();
                    logSubject = LogManager.buildSubject();
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
    
    private void createLog(int level, String msg){
        chainOfLogger.logMessage(level, msg,logSubject);
    }
    
    public void info(String msg){
        createLog(1,msg);
    }

    public void error(String msg){
        createLog(2,msg);
    }
    public void debug(String msg){
        createLog(3,msg);
    }
    public void debug2(String msg){
        createLog(4,msg);
    }
}
