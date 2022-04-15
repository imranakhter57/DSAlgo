package MyLogger;

public class ErrorLogger extends LoggerType{


    public ErrorLogger(int val, LoggerType next) {
        super(val, next);
    }

    @Override
    protected void display(String msg) {
        System.out.println("Error: "+msg);
    }
}
