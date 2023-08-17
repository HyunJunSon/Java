package chapter3;

public class p113 {
    public static void main(String[] args) {
        final int portNumber = 1337;
        Runnable r = () -> System.out.println(portNumber);
//        portNumber = 31337;  //
    }
}
