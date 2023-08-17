package reinterface;

public class Button {
    interface OnClickLister {
        void onClick();
    }
    OnClickLister lister;

    void setOnClickListener(OnClickLister lister) {
        this.lister = lister;
    }
    void touch() {
        if (lister != null) {
            lister.onClick();
        }
    }
}
