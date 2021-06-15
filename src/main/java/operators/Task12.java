package operators;
/*
Start with a number that is all binary ones. Left shift it, then use the unsigned right-shift operator to right shift through
all of its binary positions, each time displaying the result using Integer.toBinaryString( )
*/
public class Task12 {
    public static void main(String[] args) {

        int a = 0x11111;
        int z = a << 3;
        for (int i = 0; i < 4; i++) {
            System.out.println(Integer.toBinaryString(z>>>i));
        }

    }
}
