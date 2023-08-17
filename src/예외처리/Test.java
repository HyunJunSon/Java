package 예외처리;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"10","2a"};
        int v = 0;

        for (int i = 0; i < 2; i++) {
            try {
                v = Integer.valueOf(arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스 범위 오류");
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할수 없음");
            }finally {
                System.out.println(v);
            }
        }

    }
}
