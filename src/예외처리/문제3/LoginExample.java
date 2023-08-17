package 예외처리.문제3;

public class LoginExample {
    public static void main(String[] args) {
        try {
            login("white", "1234");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            login("blue", "5432");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            login("blue", "1234");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void login(String ID, String Password) throws NotExistIDException, WrongPasswordException {


        if (ID.equals("blue")) {
            if (Password.equals("1234")) {
                System.out.println("정상적으로 로그인 되었습니다.");
            } else {
                throw new WrongPasswordException("패스워드가 틀립니다.");
            }
        } else {
            throw new NotExistIDException("아이디가 존재하지 않습니다.");
        }


    }
}
