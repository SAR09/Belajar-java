package ObjectOrientedProgramming.Package.Data;

public class Bus implements Car {

    @Override
    public void drive() {
        System.out.println("Bus Drive");
    }


    public int getTire() {
        return 8;
    }

    @Override
    public String getBrand() {
        return "HINO";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }


    public boolean isBig() {
        return true;
    }
}
