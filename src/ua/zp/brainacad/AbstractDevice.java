package ua.zp.brainacad;
public abstract class AbstractDevice {
    private String name;
    private long serialNumber;

    public AbstractDevice() {
        powerOn();
    }

    public abstract void powerOn();

    public abstract void powerOff();


}
