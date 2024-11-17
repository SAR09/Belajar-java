package ObjectOrientedProgramming;

public class PersonApp {
    public static void main(String[] args) {

        var person = new Person("Saiful", "Pati");
        var person2 = new Person("Saiful");
        var person3 = new Person();
        person3.name = "Agus";

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        System.out.println(person2.name);

        System.out.println(person3.name);

        person.sayHello("Agus");
    }
}
