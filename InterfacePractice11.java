// create a class monkey with jump() and bite() methods. 
// Create a class human which inherits the monkey class and implements basicAnimal interface with eat() and sleep() methods. 

interface basicAnimal{
    void eat();
    void sleep();
}
class monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
class Humans extends monkey implements basicAnimal{
    void talk(){
        System.out.println("Talking...");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
public class InterfacePractice11 {
    public static void main(String[] args){
        Humans hu = new Humans();
        hu.bite();
        hu.eat();
        hu.jump();
        hu.sleep();
        hu.talk();

        System.out.println("\n"+"This is the demonstration on polymorphism using monkey class :-");
        monkey m = new Humans();
        m.bite();
        m.jump();
        // m.talk();
    }
}
