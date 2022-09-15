interface bicycle{
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}

interface BlowHorn{
    public void lightHorn();
    public void baseHorn();
}

class atlas implements bicycle, BlowHorn{
    public void lightHorn(){
        System.out.println("Applying Light Horn Blows.");
    }
    public void baseHorn(){
        System.out.println("Applying Base Horn Blows.");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brakes to stop.");
    }
    public void speedUp(int increment){
        System.out.println("Applying Accelerator to speed-up." + increment);
    }
}

public class InterfacePractice5{
    public static void main(String[] args){
        atlas a = new atlas();
        a.applyBrake(1);
        // we can create properties n Interfaces.
        a.speedUp(2);
        // we cannot modify the properties in Interfaces because they are final.

        a.lightHorn();
        a.baseHorn();
    }
}