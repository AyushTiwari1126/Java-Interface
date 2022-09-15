// create an abstract class Pen with methods write() & refill() as abstract methods.
// use the Pen class, create a concrete class fountain Pen with additional method changeNib().
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill Ink");
    }
    void changeNib(){
        System.out.println("Change Nib");
    }
}
public class InterfacePractice10 {
    public static void main(String[] args){
        fountainPen f = new fountainPen();
        f.changeNib();
        f.refill();
        f.write();
    }
}
