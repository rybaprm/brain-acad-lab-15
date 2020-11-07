package ua.zp.brainacad;

public class Mobile extends Phone {
    private long simCount;
    private String display;

    @Override
    public void powerOn() {
        System.out.println("Зажимаем кнопку включения. Мобильный телефон запускается");
    }

    @Override
    public void powerOff() {
        System.out.println("Зажимаем кнопку включения. Мобильный телефон выключается");
    }

    @Override
    public void call() {
        System.out.println("Выбираем контакт из меню, звоним");

    }
}
