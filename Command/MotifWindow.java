package designpattern.Command;

public class MotifWindow implements Window{
    @Override
    public void open() {
        System.out.println("opening PM window");
    }

    @Override
    public void close() {
        System.out.println("closing PM window");
    }
}
