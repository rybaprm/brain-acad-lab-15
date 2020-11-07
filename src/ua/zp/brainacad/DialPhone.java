package ua.zp.brainacad;

public class DialPhone extends Phone implements Caller {
    private boolean hasAnswerphone;

    @Override
    public void powerOn() {
        System.out.println("Подключаем стационарный телефон к сети");
    }

    @Override
    public void powerOff() {
        System.out.println("Отключаем стационарный телефон от сети");
    }

    @Override
    public void call() {
        System.out.println("Поднимаем трубку, набираем номер, звоним");

    }

    public void autoAnswer() {
        System.out.println("Срабатывает автоответчик");
    }
}
