package access_control.task4;
//Show that protected methods have package access but are not public

import access_control.task4.protect.Prot;

public class Task4 {
    void m(){
        //Prot.show(); not compiling
        Prot.show2(); //all good
    }
}
