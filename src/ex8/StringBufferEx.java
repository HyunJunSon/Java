package ex8;

public class StringBufferEx {
    static void ex3() {
        StringBuffer str = new StringBuffer("홍길동"+"문남식");
        str.insert(0, "최길춘").insert(0, "강성범");

        System.out.println(str);
    }

    static void ex4() {
        StringBuffer str = new StringBuffer("홍길동 문남식");
        str.insert(0, "최길춘").insert(0, "강성범");
        int idx = str.indexOf("홍길동");
        str.replace(idx, idx+3, "유소영");
        System.out.println(str);
    }

    static void ex5() {
        StringBuffer str = new StringBuffer("홍길동");
        str.append(100).append(false).append("강성범");

        System.out.println(str);
        int idx = str.indexOf("false");
        str.delete(idx,idx+5 );
        System.out.println(str);

    }
}
