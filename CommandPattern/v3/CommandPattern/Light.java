public class Light {

    private boolean isOn=false;
    public void turnOn()
    {
        isOn=true;
        System.out.println("Ligt is on");
    }

    public void turnOff()
    {
        isOn=false;
        System.out.println("Ligt is Off");
    }

    public boolean isON()
    {
        return  isOn;
    }
}
