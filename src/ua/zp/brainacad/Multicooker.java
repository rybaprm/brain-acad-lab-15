package ua.zp.brainacad;

public abstract class Multicooker extends AbstractDevice {
    @Override
    public void powerOn() {
        System.out.println("Втыкаем вилку в розетку, печь включается");
    }

    @Override
    public void powerOff() {
        System.out.println("Вынимаем вилку из розетки, печь выключается");
    }

    public abstract void cook();
}
