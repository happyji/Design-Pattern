package designpattern.AbstractFactory;

public class MotifScrollBar implements ScrollBar{
    @Override
    public void Scroll() {
        System.out.println("Motif scrolling");
    }
}
