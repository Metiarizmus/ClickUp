package initialization_cleanup.Task22;
/*
Write a switch statement for the enum in the previous example. For each case, output a description of that particular currency
*/
/*
Create an enum of the least-valuable six types of paper currency. Loop through the values( ) and print each value and its ordinal( ).
*/
public class Task22 {
    Currency currency;

    public Task22(Currency currency) {
        this.currency = currency;
    }

    public void describe(){
        switch (currency){
            case AUD -> {
                System.out.println("Australian Dollar");
                break;
            }
            case EUR -> {
                System.out.println("Euro");
                break;
            }
            case AZN -> {
                System.out.println("Azerbaijanian Manat");
                break;
            }
            case DZD -> {
                System.out.println("Algerian Dinar");

                break;
            }
            case USD -> {
                System.out.println("Dollar");
                break;
            }
            case BSD -> {
                System.out.println("Bahamian Dollar");
                break;
            }
        }
    }

    public static void main(String[] args) {

        Task22 task22 = new Task22(Currency.AZN);
        task22.describe();
    }
}

enum Currency {
    EUR,AUD,AZN,DZD,USD,BSD
}
