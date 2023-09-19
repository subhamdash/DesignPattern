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


class all
{
    public static void main(String[] args) {
        AirConditioner ac=new AirConditioner();
        ac.turnOnAc();
        //It was simple turn on AC but now for turning on ac we have different methos
        //Start the compressor, on the fan and start the ac so for starting the ac we might have to call all these
        //methods, SO Client should call all the methods

        ac.setTemp(24);
        ac.turnOffAc();

        //It's Ac today there can be bulb tommorow and there can be hundred devices.
        //It becomes difficult for the client to know the implementations of all the 100 devices.
        

    }
}
