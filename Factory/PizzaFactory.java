package designpattern.Factory;


public class PizzaFactory {

    Pizza createPizza(String type){

        Pizza pizza;
        if(type == "CheesePizza")
            pizza = new CheesePiza();
        else if(type == "PanerTikkaPiza")
            pizza = new PanerTikkaPiza();
        else
            pizza = new ChikenTikkaPiza();

        return pizza;
    }
}
