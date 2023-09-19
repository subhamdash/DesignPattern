public class Main_All {
    public static void main(String[] args) {

        //Now we have created an universal Remote which can help to control us in
        /*Turning off,TUring on both AC and Light
        We can SetTemperature in ac as well.And Increase the volume as well.
        But we can see that we Just need to add the What ever Command we want to add we just need to add in
        Concrete command Class and Reciever class so it doesn't affect other classes.

         */

        MyRemoteControlInvoker RCI=new MyRemoteControlInvoker();

        Light light=new Light();
        Command loc=new LightOnCommand(light);

        RCI.setCommand(loc);
        RCI.pressButton();
        RCI.undo();
        RCI.redo();



        AirConditioner ac=new AirConditioner();
        Command commandAc=new AccOnCommand(ac);

        RCI.setCommand(commandAc);
        RCI.pressButton();

        Command commandTemp=new AccTempCommand(ac,25);

        RCI.setCommand(commandTemp);
        RCI.pressButton();






    }
}
