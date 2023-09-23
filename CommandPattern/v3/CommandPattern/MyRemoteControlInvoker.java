import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyRemoteControlInvoker
{
    Command command;
    private List<Command> history=new ArrayList<>();
    private Stack<Command> Undo_Stack=new Stack<>();
    private Stack<Command> Redo_Stack=new Stack<>();
    private int curr_command=-1;
    MyRemoteControlInvoker()
    { }

    public void setCommand(Command command)
    {
        this.command=command;
    }
    public void pressButton()
    {

        command.execute();
        history.add(command);
        Undo_Stack.add(command);
        curr_command++;

    }
    public void undo()
    {
        System.out.println("---------- We are Undoing some of the operations -------------");
        if(Undo_Stack.size()>0)
        {
            //We could have also used the array List but that would be difficult to maintain with the indexes
            Command command=Undo_Stack.pop();
            Redo_Stack.add(command);
            command.undo();
        }
    }

    public void redo()
    {
        System.out.println("---------- We are Redoing some of the operations -------------");
        Command command=Redo_Stack.pop();
        Undo_Stack.add(command);
        command.redo();
    }
}
