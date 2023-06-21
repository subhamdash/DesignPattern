
class Phone
{
    Phone(){ }
    Phone p=null;
    private String os;
    private String proceesor;
    private int battery;
    Phone(String os,String proceesor,int battery)
    {
        p=new Phone();
        this.os=os;
        this.proceesor=proceesor;
        this.battery=battery;
        p.display();
    }

    public void display()
    {
        System.out.println("We hav everything we need as os= "+os+" proceesor = "+proceesor+" battery= "+battery);

    }
}

public class buildr {
    public static void main(String[] args) {
        Phone p=new Phone("Macos"," M1 ",4000);
        p.display();

    }


}
