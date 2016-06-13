package Decorator;


public class HouseBlend extends Beverage {

    HouseBlend(){
        this.description = "homeblend : this is home made coffee";
    }

    @Override
    int getCost() {
        return 150;
    }

}
