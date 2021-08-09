package annotations.task11;

import annotations.task11.annotations.TestNote;

public class TestHandler {

    @TestNote(note = "one include TestNote")
    public void one() {
        System.out.println("oaaaaaaaaa");
    }

    public static void remove() {
        System.out.println("its remove method");
    }

    @TestNote(note = "test note include TestNote")
    public static void testNote() {
        System.out.println("dsfac");
    }

}
