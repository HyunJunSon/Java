package Ex11;

public class Main {
    public static void main(String[] args) {
//        String st = "메가코딩컴퓨터학원";
//        System.out.println(st.substring(4));
//        String[] arr = {"hi","hello","안녕"};
//        String joinedSt = String.join("/", arr);
//        System.out.println(joinedSt);

        String st = "1234A2839832929B393939";
        String st2 = "kim    mun   lee  ";


        st = st.replaceAll("\\w+", "");
        System.out.println(st);

//        st2 = st2.replaceAll("\\s+", "");
        String[] arr = st2.split("\\s+");
        for (String a : arr) {
            System.out.println(a+"님");
        }

        System.out.println(st2);

        String test = "abc";
        for (char ch : test.toCharArray()) {
            System.out.println(ch);
        }


    }
}
