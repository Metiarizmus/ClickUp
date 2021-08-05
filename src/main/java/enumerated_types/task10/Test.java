package enumerated_types.task10;

import enumerated_types.task2.Generator;

public class Test {
    public static void main(String[] args) {
        Generator<Input> gen = new RandomInputGenerator();
        VendingMachine v1 = new VendingMachine();
        v1.run(gen);

    }
}
