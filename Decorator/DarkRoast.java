package Decorator;

public class DarkRoast extends Beverage {

    DarkRoast(){
        description= "Dark roast : Enjoy darkness with dark roast ";
    }

    @Override
    int getCost() {
        return 180;
    }
}
