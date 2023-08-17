package arr;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<Integer> lst;

        lst = new ArrayList<>(2);

        lst.add(10);
        lst.add(20);

        lst.forEach(System.out::println);


    }
}