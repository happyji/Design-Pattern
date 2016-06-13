package Decorator;

public class Client {


    public static void main(String args[]){

        Beverage houseBlend = new HouseBlend();
        Beverage mochaHouseBlend = new Mocha(houseBlend);
        Beverage doubleMochaHouseBlend = new Mocha(mochaHouseBlend);
        Beverage whipDoubleMochaHouseBlend = new Whip(doubleMochaHouseBlend);

        System.out.println(whipDoubleMochaHouseBlend.getDescription()+ " for only Rs "+whipDoubleMochaHouseBlend.getCost());


        Beverage darkRoast = new DarkRoast();
        Beverage mochaDarkRoast = new Mocha(darkRoast);
        Beverage whipMochaDarkRoast = new Whip(mochaDarkRoast);

        System.out.println(whipMochaDarkRoast.getDescription()+" for  only Rs "+ whipMochaDarkRoast.getCost());


    }
}
