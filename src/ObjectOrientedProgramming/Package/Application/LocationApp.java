package ObjectOrientedProgramming.Package.Application;

import ObjectOrientedProgramming.Package.Data.City;
import ObjectOrientedProgramming.Package.Data.Location;

public class LocationApp {
    public static void main(String[] args) {
        //var location = new Location(); // ERROR

        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
