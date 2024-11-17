package ObjectOrientedProgramming.Package.Application;

import static ObjectOrientedProgramming.Package.Data.Application.*;
import static ObjectOrientedProgramming.Package.Data.Constant.*;
import ObjectOrientedProgramming.Package.Data.Country;
import ObjectOrientedProgramming.Util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Pati");
        System.out.println(city.getName());

        System.out.println(PROCESSOR);
    }
}
