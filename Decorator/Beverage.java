package Decorator;

abstract public class Beverage {
   String description= "unknown drink";

    String getDescription(){
        return description;
    }

   abstract int getCost();


}

