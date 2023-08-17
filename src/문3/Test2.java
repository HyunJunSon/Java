package 문3;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
//        System.out.println("dejidjwijddwjidjwiejwgfhadd".contains("p"));
//        System.out.println(String.format("Name:%s", "Test"));
//        System.out.println(String.join("/",new String[]{"a","b","c"}));
        System.out.println("123".matches("\\d+"));
        System.out.println("12394a938172120a210aa".replaceAll("a", ""));
        Arrays.stream("123 456 789".split("\\s+")).forEach(System.out::println);
        System.out.println();
        String[] arr = "123 456 789".split("\\s+");
        for(String st : arr){
            System.out.println(st);

        }
    }
}
