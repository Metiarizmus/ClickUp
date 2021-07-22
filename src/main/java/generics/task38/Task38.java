package generics.task38;

//Exercise 38: (4) Create a simple Decorator system by starting with basic coffee,
// then providing decorators of steamed milk, foam, chocolate, caramel and whipped cream.
public class Task38 {
    public static void main(String[] args) {

        Coffee coffee = new CookingWithFoam( new CookingWithCream( new CookingWithCaramel(
                        new CookingWithChocolate(new CookingWithMilk(new Capuchino())))));
        System.out.println(coffee.startCooking());

    }
}

interface Coffee {
    String startCooking();
}

class Capuchino implements Coffee {

    @Override
    public String startCooking() {
        return "capuchino";
    }
}

class CoffeeDecorator implements Coffee {
    Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String startCooking() {
        return coffee.startCooking();
    }
}

class CookingWithMilk extends CoffeeDecorator {

    public CookingWithMilk(Coffee coffee) {
        super(coffee);
    }

    public String makeWithMilk() {
        return " with milk";
    }

    @Override
    public String startCooking() {
        return super.startCooking() + makeWithMilk();
    }
}

class CookingWithChocolate extends CoffeeDecorator {

    public CookingWithChocolate(Coffee coffee) {
        super(coffee);
    }

    public String makeWithChocolate() {
        return " with chocolate";
    }

    @Override
    public String startCooking() {
        return super.startCooking() + makeWithChocolate();
    }
}

class CookingWithCaramel extends CoffeeDecorator {

    public CookingWithCaramel(Coffee coffee) {
        super(coffee);
    }

    public String makeWithCaramel() {
        return " with caramel";
    }

    @Override
    public String startCooking() {
        return super.startCooking() + makeWithCaramel();
    }
}

class CookingWithCream extends CoffeeDecorator {

    public CookingWithCream(Coffee coffee) {
        super(coffee);
    }

    public String makeWithCream() {
        return " with cream";
    }

    @Override
    public String startCooking() {
        return super.startCooking() + makeWithCream();
    }
}

class CookingWithFoam extends CoffeeDecorator {

    public CookingWithFoam(Coffee coffee) {
        super(coffee);
    }

    public String makeWithFoam() {
        return " with foam";
    }

    @Override
    public String startCooking() {
        return super.startCooking() + makeWithFoam();
    }
}