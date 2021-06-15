package polymorphism.task15;

/*
Exercise 15: (2) Add a RectangularGlyph to PolyConstructors.java and demonstrate the problem described in this section.
 */

public class PolyConstructors {
    public static void main(String[] args) {


        new RectangularGlyph();
    }
}

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RectangularGlyph extends Glyph {
    @Override
    void draw() {
        System.out.println("draw rectangular");
    }
    RectangularGlyph(){
        new RoundGlyph(4);
        draw();
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

