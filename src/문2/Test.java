package 문2;


public class Test {

    public static void main(String[] args) {
        Anonymous anony = new Anonymous();

        anony.field.run();
        anony.method1();
        anony.method2(()-> System.out.println("트럭이 달립니다."));
    }
}
