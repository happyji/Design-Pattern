package designpattern.Command;


public class PMScrollBar implements ScrollBar{
    @Override
    public void Scroll() {
        System.out.println("PM scrolling");
    }
}
