package ObjectOrientedProgramming.Package.Application;

import ObjectOrientedProgramming.Package.Data.Customer;
import ObjectOrientedProgramming.Package.Data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Saiful");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Print level");
        for (var value: Level.values()){
            System.out.println(value);
        }
    }
}
