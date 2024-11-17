package ObjectOrientedProgramming;

public class VicePresiden extends Manager {
    VicePresiden(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("Hello " + name + " My Name is Vp " + this.name);
    }
}
