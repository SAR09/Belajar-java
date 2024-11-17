package ObjectOrientedProgramming;

public class PolymorphismApp {

    public static void main(String[] args) {
        Employee employee = new Employee("Saiful");
        employee.sayHello("Agus");

        employee = new Manager("Saiful");
        employee.sayHello("Agus");

        employee = new VicePresiden("Saiful");
        employee.sayHello("Agus");

        sayHello(new Employee("Saiful"));
        sayHello(new Manager("Saiful"));
        sayHello(new VicePresiden("Saiful"));
    }

    static void sayHello(Employee employee){
        if(employee instanceof VicePresiden){
            VicePresiden vicePresiden = (VicePresiden) employee;
            System.out.println("Hello VP " + vicePresiden.name);
        } else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manaager " + manager.name);
        } else{
            System.out.println("Hello " + employee.name);
        }

    }
}
