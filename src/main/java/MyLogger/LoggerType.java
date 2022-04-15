package MyLogger;

public abstract class LoggerType {
    int val;
    LoggerType next;

    public LoggerType(int val,LoggerType next) {
        this.val = val;
        this.next = next;
    }
    
    public void logMessage(int val, String message){
        if(this.val == val){
            display(message);
            return;
        }
        if(next!= null){
            next.logMessage(val,message);
        }
    }
    
    protected abstract void display(String msg); 
}
