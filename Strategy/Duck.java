package designpattern.Strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public static void swim(){
        System.out.println("swimming");
    }

}
