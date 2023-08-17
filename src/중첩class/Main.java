package 중첩class;

public class Main {
    public static void main(String[] args) {
        TestA a = new TestA();
        TestA.TestB b = a.new TestB();

        TestC.TestD d = new TestC.TestD();
    }
}

class TestA {
    class TestB {
    }
}

class TestC {
    static class TestD {

    }
}
