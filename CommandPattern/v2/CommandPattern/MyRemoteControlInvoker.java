public class MyRemoteControlInvoker
{
    Command command;
    MyRemoteControlInvoker()
    {

    }

    public void setCommand(Command command)
    {
        this.command=command;
    }
    public void pressButton()
    {
        command.execute();
    }
    public void undo()
    {
        command.undo();
    }

    public void redo()
    {
        command.redo();
    }
}
