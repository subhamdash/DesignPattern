public class LightOnCommand implements Command
{
    public Light light;
    public LightOnCommand(Light light)
    {
        this.light=light;
    }

    @Override
    public void execute() {
        light.turnOn();

    }

    @Override
    public void undo() {
        light.turnOff();

    }

    @Override
    public void redo() {
        execute();

    }
}
