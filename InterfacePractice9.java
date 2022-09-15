// Polymorphism in Interface

interface whatsapp{
    public void typemessage();
    public void setstatus();
}
interface call{
    public void makecall();
    public void attendcall();
}
class infinixphone implements whatsapp, call{
    public void typemessage(){
        System.out.println("Type messages");
    }
    public void setstatus(){
        System.out.println("Set your status");
    }
    public void makecall(){
        System.out.println("Make a call");
    }
    public void attendcall(){
        System.out.println("Attending call");
    }
} 
public class InterfacePractice9 {
    public static void main(String[] args){
        call c = new infinixphone();
        // c.typemessage(); ---> Not allowed to declare
        // we can't calls here the typemessage method.
        // Because it is already defined that infinixphone can only be used to make and attend the call not for typing messages.

        c.attendcall();
        c.makecall();

        infinixphone ip = new infinixphone();
        ip.attendcall();
        ip.makecall();
        ip.typemessage();
        ip.setstatus();
    }
}
