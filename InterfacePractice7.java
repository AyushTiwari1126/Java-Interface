// Default Methods

interface camera{
    public void capture();
    public void record();
// This method will not work because it is private 
// But it can work if we can call into our default method(if not overrided).

    // private void greet(){
    //     System.out.println("Good morning");
    // }
    
// Default method enable us to add new funtionality to existing interfaces.
// Else we make new functionality occurs an Error : we have to override in class also.
// If we override it in the class, so the overrided method can work(not default method).
    default void record4kvideo(){
        // greet();
        System.out.println("Record in 4k");
    }

}
interface wifi{
    String[] getNetwork();
    void connectNetwork(String network);
}
class cellphone{
    public void makecall(int phonenumber){
        System.out.println("Calling... " + phonenumber);
    }
    public void pickcall(){
        System.out.println("Connecting... ");
    }
    
}
class smartphone extends cellphone implements camera, wifi{
    public void capture(){
        System.out.println("Taking pictures");
    }
    public void record(){
        System.out.println("Record videos");
    }
    public String[] getNetwork(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Ayush", "Tiwari", "MyHome"};
        return networkList;
    }
    public void connectNetwork(String network){
        System.out.println("Connect to " + network);
    }
}
public class InterfacePractice7 {
    public static void main(String[] args){
        smartphone sp = new smartphone();
        String[] arr = sp.getNetwork();
        for (String i: arr) {
            System.out.println(i);
        }
    }
}