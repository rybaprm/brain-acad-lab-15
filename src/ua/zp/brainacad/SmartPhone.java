package ua.zp.brainacad;

public class SmartPhone extends Mobile implements Caller,EmailSender {
    private String os;

    public void runApp() {
        System.out.println("Запускаем приложение");
    }

    @Override
    public String editMail(String text) {
        return text;
    }

    @Override
    public String createMail(String text) {
        return text;
    }

    @Override
    public void sendMail(String text) {
        System.out.println("Отправляем сообщение - \"" + text + "\"");
    }
}
