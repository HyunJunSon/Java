package 예외처리.문제3;

public class NotExistIDException extends Exception {
    NotExistIDException(){}

    NotExistIDException(String msg) {
        super(msg);
    }
}
