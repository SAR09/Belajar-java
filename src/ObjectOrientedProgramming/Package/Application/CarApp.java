package ObjectOrientedProgramming.Package.Application;

import ObjectOrientedProgramming.Package.Data.Avanza;
import ObjectOrientedProgramming.Package.Data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
