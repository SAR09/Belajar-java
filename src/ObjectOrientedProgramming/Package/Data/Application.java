package ObjectOrientedProgramming.Package.Data;

public class Application {
    public static final int PROCESSOR;
    static {
        System.out.println("Mengakses class Apllication");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
