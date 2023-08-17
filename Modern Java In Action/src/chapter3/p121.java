package chapter3;

public class p121 {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Color> func = Color::new;
        Color c = func.apply(10,20,30);
        System.out.println(c.a);
    }
}

@FunctionalInterface
interface TriFunction<T,U,V,R>{
    R apply(T t, U u, V v);
}


class Color {
    int a,b,c;

    public Color(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}