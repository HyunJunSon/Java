package 바깥class참조;

public class Outer {
    String field = "outter field";

    void method(){
        System.out.println("Inner method");
    }

    class Inner {
        String field = "inner field";
        void method(){
            System.out.println("inner-method");
        }
        void print(){
            System.out.println(this.field);
            this.method();
            System.out.println(Outer.this.field);
            Outer.this.method();
        }

    }

}
