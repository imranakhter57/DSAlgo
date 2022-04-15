package MyLogger;

public class DebugLogger extends LoggerType{


    public DebugLogger(int val, LoggerType next) {
        super(val, next);
    }

    @Override
    protected void display(String msg) {
        System.out.println("Debug: "+msg);
    }
}
