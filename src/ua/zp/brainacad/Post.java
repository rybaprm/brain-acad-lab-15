package ua.zp.brainacad;

public class Post implements MailSender {
    @Override
    public String createMail(String text) {
        return text;
    }

    @Override
    public void sendMail(String text) {
        System.out.println("Отправляем почтовое сообщение - \"" + text + "\"");
    }
}
