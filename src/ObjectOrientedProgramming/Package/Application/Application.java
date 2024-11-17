package ObjectOrientedProgramming.Package.Application;

import ObjectOrientedProgramming.Package.Data.*;


public class Application {
    public static void main(String[] args) {
        Product product = new Product("Mac Book Pro", 300000);
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
