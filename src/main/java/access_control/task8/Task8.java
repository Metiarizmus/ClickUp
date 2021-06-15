package access_control.task8;

/*
Following the form of the example Lunch.java, create a class called ConnectionManager that manages a fixed array of Connection objects.
The client programmer must not be able to explicitly create Connection objects,
but can only get them via a static method in ConnectionManager.
When the ConnectionManager runs out of objects, it returns a null reference. Test the classes in main( ).
*/
public class Task8 {
    public static void main(String[] args) {
        System.out.println(Connection.ConnectionManager.builtConnection());
        System.out.println(Connection.ConnectionManager.builtConnection());
        System.out.println(Connection.ConnectionManager.builtConnection());
    }
}


class Connection {

    private Connection() {

    }

    static class ConnectionManager {
        private static int n;

        private ConnectionManager() {

        }

        public static Connection builtConnection() {
            Connection con = null;


            if (n < 2) {
                con = new Connection();
            }
            n++;
            return con;
        }

    }

}

