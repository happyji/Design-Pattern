package designpattern.Factory;


public abstract class PizzaStore {

    abstract Pizza createPizza(String type);


    Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


}
