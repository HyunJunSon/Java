package 문3;

public class Info {
    String name;
    String phone;

    public Info(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "이름:"+name +" " +"전화:"+phone;
    }
}
