package ObjectOrientedProgramming;

public class Parent {
    String name;

    void doIt(){
        System.out.println("Do it parent");
    }
}

class Child extends Parent{
    String name;
    void doIt(){
        System.out.println("Do it child");
    }
}
