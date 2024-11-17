package ObjectOrientedProgramming.Package.Application;

import ObjectOrientedProgramming.Package.Annotation.Fancy;
import ObjectOrientedProgramming.Package.Data.Animal;
import ObjectOrientedProgramming.Package.Data.Cat;

@Fancy(name = "AnimalApp", tags = {"Application Java"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
