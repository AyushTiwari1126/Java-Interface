interface humans{
    public void walk();
    public void watch();
}
class ayush implements humans{
    public void study(){
        System.out.println("Go to School.");
    }
    public void walk(){
        System.out.println("Morning walk");
    }
    public void watch(){
        System.out.println("Watch Movies");
    }
}
public class InterfacePractice6 {
    public static void main(String[] args){
        ayush h = new ayush();
        h.study();
        h.walk();
        h.watch();
    }
}
