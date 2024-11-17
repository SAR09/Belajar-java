package ObjectOrientedProgramming.Package.Data;

import ObjectOrientedProgramming.Package.Annotation.Fancy;

@Fancy(name = "AnimalApp", tags = {"Application", "Java"})
public interface Car extends HasBrand, IsMaintenance {
    void drive();

    int getTire();

    default boolean isBig(){
        return false;
    }
}
