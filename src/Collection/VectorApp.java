package Collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> list = new Vector<>();

        list.add("Saiful");
        list.add("Amin");
        list.add("Rizki");

        for(var value : list){
            System.out.println(value);
        }
    }
}
