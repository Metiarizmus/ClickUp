package everything_object;

/*
In the Initialization & Cleanup chapter, locate the Overloading.java example and add Javadoc documentation.
Extract this comment documentation into an HTML file using Javadoc and view it with your Web browser
*/

public class Overloading {
    public static void main(String[] args) {

            for(int i = 0; i < 5; i++) {
                Tree t = new Tree(i);
                t.info("overloaded method");
            }

// Overloaded constructor:
        System.out.println();
            Tree tree = new Tree();
            tree.info();

    }
}

class Tree {

    /**
     * height = 0
     */
    int height;

    /**
     * assigns height = 10
     */
    Tree() {
        System.out.println("Planting a seedling");
        height = 10;
    }

    /**
     * @param initialHeight
     * constructor taking "int height" and assigns a value that argument
     */
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new Tree that is " +
                height + " feet tall");

    }

    /**
     * method to print height of tree object
     */
    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }


    /**
     * @param s
     * overloaded method to print string argument
     * method to print height of tree object
     * if the string argument is null we call another method
     */
    void info(String s) {
        info();
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}

