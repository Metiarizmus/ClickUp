package operators.Task5;
/*
Create a class called Dog containing two Strings: name and says. In main( ), create two dog objects with names “spot”
(who says, “Ruff!”) and “scruffy” (who says, “Wurf!”). Then display their names and what they say
*/
public class Task5 {

    public static void main(String[] args) {
        Dog spot = new Dog("Spot","Ruff!");
        Dog scruffy = new Dog("Scruffy","Wurf!");

        System.out.println(spot.getName() + " - " + spot.getSays());
        System.out.println(scruffy.getName() + " - " + scruffy.getSays());

    }

}

