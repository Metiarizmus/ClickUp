package strings.task4;

import java.util.Formatter;

/*
Exercise 4: (3) Modify Receipt.java so that the widths are all controlled by a single set of constant values.
The goal is to allow you to easily change a width by changing a single value in one place.
 */
public class Task4 {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    private int[] wight ={15,5,10};
    public Task4(){}
    public Task4(int[] width){
        wight =width;}

    public void printTitle() {
        f.format("%-"+ wight[0]+"s %"+ wight[1]+"s %"+ wight[2]+"s\n", "Item", "Qty", "Price");
        f.format("%-"+ wight[0]+"s %"+ wight[1]+"s %"+ wight[2]+"s\n", "----", "---", "-----");
    }
    public void print(String name, int qty, double price) {
        f.format("%-"+ wight[0]+".15s %"+ wight[1]+"d %"+ wight[2]+".2f\n", name, qty, price);
        total += price;
    }
    public void printTotal() {
        f.format("%-"+ wight[0]+"s %"+ wight[1]+"s %"+ wight[2]+".2f\n", "Tax", "", total*0.06);
        f.format("%-"+ wight[0]+"s %"+ wight[1]+"s %"+ wight[2]+"s\n", "", "", "-----");
        f.format("%-"+ wight[0]+"s %"+ wight[1]+"s %"+ wight[2]+".2f\n", "Total", "", total * 1.06);
    }
    public static void main(String[] args) {
        int[] width={30,10,20};
        Task4 receipt = new Task4(width);
        receipt.printTitle();
        receipt.print("Jack’s Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}