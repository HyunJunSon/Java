package chapter5;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class p194 {
    public static void main(String[] args) {

        IntSupplier fib = new IntSupplier() {
            private int pre = 0;
            private int cur = 1;
            @Override
            public int getAsInt() {
                int oldpre = this.pre;
                int next = this.pre + this.cur;
                this.pre = this.cur;
                this.cur = next;
                return oldpre;
            }
        };
        IntStream.generate(fib).limit(10).forEach(System.out::println);
    }}