package designpattern.Observer;

public class ForeCastDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        System.out.println();
        System.out.println("Current Conditions Display ");
        System.out.println("Temparature : "+ temperature);
        System.out.println("Humidity : "+ humidity);
        System.out.println("Presure : "+ pressure);
    }

    @Override
    public void update(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
