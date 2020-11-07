package ua.zp.brainacad;

public interface MailSender {
    public String createMail(String text);
    public void sendMail(String text);
}
