package controlling_execution.Task4;
/*
Write a program that uses two nested for loops and the modulus operator (%) to detect and print prime numbers
(integral numbers that are not evenly divisible by any other numbers except for themselves and 1)
 */
public class Task4 {
    public static void main(String[] args) {

        printSimpleNumb(100);

    }
    
    static void printSimpleNumb(int maxNum) {
        for (int i = 2; i <= maxNum; i++) {
            int count = 0;
            for (int j = 2; j <=i ; j++) {
                if((i%j)==0) {
                   count++;
                }
            }
            if(count<2){
                System.out.println(i);
            }
        }

    }

}
