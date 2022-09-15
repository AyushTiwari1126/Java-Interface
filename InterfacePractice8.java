// Inheritance v/s Interface

interface parentinterface{
    public void method1();
    public void method2();
}

// Here, If we want to add method1 & method2 in childinterface, so we can use "extends" for maintaining DRY Principle.
// Class does not extend interfaces but an interface can extends another interface.
// And, a class can extends another class.

interface childinterface extends parentinterface{
    public void method3();
    public void method4();
}
class myClass implements childinterface{
    public void method3(){
        System.out.println("Method3 of myClass");
    }
    public void method4(){
        System.out.println("Method4 of myClass");
    }
    public void method1(){
        System.out.println("Method1 of myClass");
    }
    public void method2(){
        System.out.println("Method2 of myClass");
    }
}
public class InterfacePractice8 {
    public static void main(String[] args){
        myClass mc = new myClass();
        mc.method1();
        mc.method2();
        mc.method3();
        mc.method4();
    }
}
