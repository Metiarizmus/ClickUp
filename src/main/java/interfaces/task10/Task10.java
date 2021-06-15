package interfaces.task10;

/*
Exercise 10: (3) Modify Musics.java by adding a Playable interface. Move the play( ) declaration from Instrument to Playable.
Add Playable to the derived classes by including it in the implement s list.
 Change tune( ) so that it takes a Playable instead of an Instrument.
 */
public class Task10 {

    static void tune(Playable i) {

        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune((Playable) i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(), new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}

interface Instrument {

    int VALUE = 5;

    void adjust();
}

interface Playable {
    void play(Note n);
}
class Wind implements Instrument, Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Percussion implements Instrument, Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Stringed implements Instrument, Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }
}


enum Note {
    MIDDLE_C
}