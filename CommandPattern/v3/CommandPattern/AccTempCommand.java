public class AccTempCommand implements Command {
    public AirConditioner ac;
    int temp;
    AccTempCommand(AirConditioner ac,int temp)
    {
        this.ac=ac;
        this.temp=temp;
    }
    @Override
    public void execute() {
        ac.setTemp(temp);

    }

    @Override
    public void undo() {
        ac.setTemp(16);

    }

    @Override
    public void redo() {
        execute();

    }
}
