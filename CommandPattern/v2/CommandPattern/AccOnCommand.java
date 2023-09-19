public class AccOnCommand implements Command{
    AirConditioner ac;
    public AccOnCommand(AirConditioner ac)
    {
        this.ac=ac;
    }
    @Override
    public void execute() {
        ac.turnOnAc();


    }

    @Override
    public void undo() {
        ac.turnOffAc();

    }

    @Override
    public void redo() {
        execute();
    }
}
