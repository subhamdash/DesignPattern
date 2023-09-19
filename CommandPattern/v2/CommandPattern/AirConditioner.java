public class AirConditioner {
    boolean isOn;
    int temperature;
    public void turnOnAc()
    {
        isOn=true;
        System.out.println("Ac Is ON");
    }
    public void turnOffAc()
    {
        isOn=false;
        System.out.println("Ac Is OFF");
    }

    public void setTemp(int temp)
    {
        this.temperature=temp;
        System.out.println(temperature);
    }
}


