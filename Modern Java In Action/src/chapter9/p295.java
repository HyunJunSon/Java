package chapter9;

public class p295 {
    public static void main(String[] args) {
        final int a= 10;

        Runnable r1 = () -> {
            System.out.println(a);
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                int a = 2;
                System.out.println(a);
            }
        };

        Thread th1 = new Thread(r1);
        Thread th2 = new Thread(r2);

        th1.start();
        th2.start();
    }
}
