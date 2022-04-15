package MyLogger;


public class Applicatin {

    public static void main(String[] args) {
        MyLogger log = MyLogger.getInstance();
        log.info("This is info");
        log.error("This is error");
        log.debug("This is debug");
    }
}
