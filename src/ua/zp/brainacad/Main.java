package ua.zp.brainacad;
//        1. Работа с абстрактными классами. Реализовать иерархию классов с полями и методами
//        1) В самом верхнем по иерархии классе (AbstractDevice) создать конструктор без
//        параметров и вызвать в нем метод powerOn() , для включения устройства при
//        создании экземпляра любого дочернего класса.
//        2) Реализовать все методы путем вывода на экран сообщений с нужными
//        действиями (для эмуляции реального поведения), например:
//        • Зажимаем кнопку включения. Мобильный телефон запускается.
//        • Подключаем стационарный телефон к сети.
//        • Втыкаем вилку в розетку, печь включается.
//        • Выбираем контакт из меню, звоним
//        • Поднимаем трубку, набираем номер, звоним.
//        • И т д
//        3) Создать Main класс в котором создать экземпляры данных классов и выполнить
//        их методы.
//        2. Работа с интерфейсами. Создать интерфейсы и реализовать их в классах.
//        1) Методы реализовать аналогично п.1.
//        2) Создать метод Main с main методом, создать и проверить работу объектов,
//        аналогично п.1
//        3. В классе Main для п.1 создать статический метод, который принимает varargs из
//        AbstractDevice, который выключает все переданные устройства. Проверить работу
//        метода, передав в него все созданные объекты в п.1
//        4. В классе Main для п.2 создать статический метод, который принимает varargs из
//        MailSender, который выполняет рассылку писем из всех источников. Проверить работу
//        метода, передав в него все созданные экземпляры классов типа SmartPhone и Post
public class Main {

    public static void main(String[] args) {
        AbstractDevice[] devices = {
                new SmartPhone(),
                new DialPhone(),
                new Cooker(),
                new Oven()
        };
        Caller[] callers = {(SmartPhone) devices[0], (DialPhone) devices[1]};

        for (Caller caller : callers) {
            caller.call();
        }
        MailSender[] senders = {
                (SmartPhone) devices[0],
                new Post(),
        };

        for (MailSender sender : senders) {
            if (sender instanceof SmartPhone) {
                sender.sendMail(((SmartPhone) sender).editMail("отредактированное сообщение"));
            } else {
                sender.sendMail(sender.createMail("новое сообщение"));
            }
        }

        powerOff(devices);
        sendMail(senders);
    }

    public static void powerOff(AbstractDevice[] devices) {
        for (AbstractDevice device : devices) {
            device.powerOff();
        }
    }

    public static void sendMail(MailSender[] senders) {
        for (MailSender sender : senders) {
            sender.sendMail("Сообщение отправленное при помощи статического метода");
        }
    }
}
