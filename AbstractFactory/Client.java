package AbstractFactory;


public class Client {

    public static void main(String args[]){
        WidgetFactory pmwidgetFactory = new PMWidgetFactory();
        Window window = pmwidgetFactory.createWindow();
        window.open();
        window.close();

    }

}
