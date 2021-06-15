package reusing_classes.task10;

//Modify the previous exercise so that each class only has non-default constructors
/*
Create a class called Root that contains an instance of each of the classes (that you also create) named Component1, Component2, and Component3.
Derive a class Stem from Root that also contains an instance of each “component.”
All classes should have default constructors that print a message about that class
*/
public class Task10 {
    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}

class Component1 {

    Component1() {
        System.out.println("default comp1");
    }

    Component1(String s) {
        System.out.println("it's component1");
    }
}

class Component2 {

    Component2() {
        System.out.println("default comp2");
    }

    Component2(String s) {
        System.out.println("it's component2");
    }
}

class Component3 {

    Component3() {
        System.out.println("default comp1");
    }

    Component3(String s) {
        System.out.println("it's component3");
    }
}

class Root {

    Root(){
        System.out.println("default root");
    }

    Root(String s) {
        System.out.println("It's root");
        Component1 c1 = new Component1("1");
        Component2 c2 = new Component2("2");
        Component3 c3 = new Component3("3");
    }
}

class Stem extends Root {

    Stem() {
        super("Hello root");
        System.out.println("It's stem");
        Component1 c1 = new Component1("1");
        Component2 c2 = new Component2("2");
        Component3 c3 = new Component3("3");
    }

}
