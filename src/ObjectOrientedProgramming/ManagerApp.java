package ObjectOrientedProgramming;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Saiful");
        manager.sayHello("Agus");

        var vp = new VicePresiden("Amin");
        vp.sayHello("Agus");
    }
}
