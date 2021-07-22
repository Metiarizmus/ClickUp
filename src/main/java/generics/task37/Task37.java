package generics.task37;

import java.util.Date;

//Exercise 37: (2) Add a new mixin class Colored to Mixins.java, mix it into Mixin, and show that it works.
public class Task37 {
    public static void main(String[] args) {

        Mixin mixin1 = new Mixin(), mixin2 = new Mixin();

        mixin1.set("test string 1");
        mixin2.set("test string 2");

        System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber());
        System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber());

        mixin1.setColor("green");
        System.out.println(mixin1.getColor());
    }
}

interface TimeStamped {
    long getStamp();
}

class TimeStampedImp implements TimeStamped {
    private final long timeStamp;

    public TimeStampedImp() {
        timeStamp = new Date().getTime();
    }

    public long getStamp() {
        return timeStamp;
    }
}

interface SerialNumbered {
    long getSerialNumber();
}

class SerialNumberedImp implements SerialNumbered {
    private static long counter = 1;
    private final long serialNumber = counter++;

    public long getSerialNumber() {
        return serialNumber;
    }
}

interface Basic {
     void set(String val);

     String get();
}

class BasicImp implements Basic {
    private String value;

    public void set(String val) {
        value = val;
    }

    public String get() {
        return value;
    }
}

interface Colored {
    void setColor(String s);
    String getColor();
}

class ColoredImp implements Colored {

    String color;
    @Override
    public void setColor(String s) {
        color = s;
    }

    @Override
    public String getColor() {
        return color;
    }
}

class Mixin extends BasicImp implements TimeStamped, SerialNumbered, Colored {
    private TimeStamped timeStamp = new TimeStampedImp();
    private SerialNumbered serialNumber = new SerialNumberedImp();
    private Colored colored = new ColoredImp();

    public long getStamp() {
        return timeStamp.getStamp();
    }

    public long getSerialNumber() {
        return serialNumber.getSerialNumber();
    }

    @Override
    public void setColor(String s) {
        colored.setColor(s);
    }

    @Override
    public String getColor() {
        return colored.getColor();
    }
}