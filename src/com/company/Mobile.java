package com.company;

public interface Mobile {
    void startCall (String number);
    void acceptCall (String number);
    void breakCall ();
}
abstract class SiemensMobile implements Mobile {
    Boolean isTalkingNow;
    int siemensSerialNumber;
    abstract void connectToSiemensOnline();
}
class Model extends SiemensMobile {
    @Override
    void connectToSiemensOnline() {
        System.out.println("Подсоединились к сервису Сименс Онлайн");
    }
    @Override
    public void startCall(String number) {
        isTalkingNow = true;
    }

    @Override
    public void acceptCall(String number) {
        isTalkingNow = true;
    }
    @Override
    public void breakCall() {
        isTalkingNow = false;
    }
}