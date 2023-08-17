package 예외처리.문제3;

public class WrongPasswordException extends Exception {
    WrongPasswordException(){}

    WrongPasswordException(String msg) {
        super(msg);
    }
}
