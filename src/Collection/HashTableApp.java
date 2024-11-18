package Collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("Saiful","Saiful");
        map.put("Amin", "Amin");
        map.put("Rizki", "Rizki");

        for (var key : map.keySet() ){
            System.out.println(key);
        }
    }
}
