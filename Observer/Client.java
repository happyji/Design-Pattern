package designpattern.Observer;

/*
       Requirement :

       track weather conditions (temparature,humidity,barometric presure)
       3 display element (current conditions,weather statistics,simple forcast)
       expandable weather station
       future plan to charge for display


        The Observer Pattern defines a one-to-many
        dependency between objects so that when one
        object changes state, all of its dependents are
        notified and updated automatically.
 */


public class Client {


    public static void main(String args[]){

        WeatherData weatherSubject = new WeatherData();
        Observer currentConditionsDisplayObserver = new CurrentConditionsDisplay();
        weatherSubject.registerObserver(currentConditionsDisplayObserver);

        Observer foreCastDisplay = new ForeCastDisplay();
        weatherSubject.registerObserver(foreCastDisplay);

        weatherSubject.measurementsChanged(35,10,23);


    }

}

