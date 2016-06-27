package designpattern.Decorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    int getCost() {
        return beverage.getCost()+5;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
