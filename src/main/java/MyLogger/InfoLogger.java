package MyLogger;

public class InfoLogger extends LoggerType{


    public InfoLogger(int val, LoggerType next) {
        super(val, next);
    }

    @Override
    protected void display(String msg) {
        System.out.println("INFO: "+msg);
    }
}
