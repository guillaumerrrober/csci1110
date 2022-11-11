package headPhone;

import headPhone.headPhone;

public class mainHeadphone {
    public static void main(String[] args) {

        headPhone h = new headPhone();
        System.out.println(h.charge);
        h.powerOn();
        System.out.println(h.power);
        h.volumeUp();
        h.volumeUp();
        System.out.println(h.volume);
    }
}
