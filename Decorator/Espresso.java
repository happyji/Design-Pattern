package Decorator;

public class Espresso extends Beverage {

    Espresso()
    {
        description = "This is fine espresso cofeee";
    }

    @Override
    int getCost() {
        return 120;
    }
}
