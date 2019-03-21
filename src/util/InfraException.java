package util;

public class InfraException extends Exception {
    public InfraException(String msg, Exception e) {
        super(msg, e);
    }
}
