package reinterface;

public class CallListener implements Button.OnClickLister {

    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
