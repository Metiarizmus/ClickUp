package inner_classes.task1_1;


public class Other {

     public class Inner {
        public Inner(){
            System.out.println("its inner");
        }

        public void fo() {
            System.out.println("fo in inner");
        }
    }

    public Inner to(){
        return new Inner();
    }
}
