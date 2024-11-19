package Lambda.App;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> newSupplier = () -> "Saiful Amin Rizki";

        System.out.println(newSupplier.get());
    }
}
