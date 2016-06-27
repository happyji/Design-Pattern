package designpattern.Command;


public abstract  class LightOnCommand implements Command {
    Light light;

    final int x=0;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
