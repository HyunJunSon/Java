package reinterface;

public class Test {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.setOnClickListener(new CallListener());
        btn.touch();

        btn.setOnClickListener(new Button.OnClickLister(){
                                   @Override
                                   public void onClick() {
                                       System.out.println("메세지를 보냅니다.");
                                   }
                               }
        );

        btn.touch();

        btn.setOnClickListener(() -> System.out.println("인쇄합니다."));
        btn.touch();
    }
}
