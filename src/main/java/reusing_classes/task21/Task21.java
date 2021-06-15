package reusing_classes.task21;
//(1) Create a class with a final method. Inherit from that class and attempt to overwrite that method

public class Task21 extends A{

   /* @Override
    void m() {
        super.m(); //will be wrong because m is finale
    }*/

}

class A {
     final void m(){
        System.out.println("it's m from A");
    }
}
