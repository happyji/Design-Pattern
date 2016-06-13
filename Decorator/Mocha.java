package Decorator;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    int getCost() {
        return beverage.getCost()+10;
    }
}
