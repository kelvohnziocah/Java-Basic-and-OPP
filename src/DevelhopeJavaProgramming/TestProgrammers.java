package DevelhopeJavaProgramming;

public class TestProgrammers {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Alice", 30, true);
        Programmer programmer2 = new Programmer("Bob", 25, false);

        programmer1.drinkCoffee();
        programmer1.printDetails();

        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}
