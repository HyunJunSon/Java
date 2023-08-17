package 문3;

public class Main {
    public static void main(String[] args) {
        view(10, 20);
        view(40);
        view(new Integer[]{2,4,10,5});
        view("Kim","Mun");
        view("Lee","Jun","Bark");
        view(new String[]{"Hong","Choe"});

        Info[] arr = {
                new Info("홍길동", "222-444"),
                new Info("강성범", "555-777"),
                new Info("이선희", "7777-999"),
        };

        view(arr);
        view(
                new Info("강호동", "777-8888"),
                new Info("이건길", "666-555")

        );
    }

    private static void view(Object ... objs) {
        for (Object obj : objs) {
            if (obj instanceof Integer) {
                System.out.print((Integer)obj+" ");
            }
            if (obj instanceof String) {
                System.out.print((String) obj +" ");
            }
            if (obj instanceof Info){
                System.out.println((Info)obj);
            }
        }
        System.out.println();
    }
}
