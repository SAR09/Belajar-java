package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Saiful");
        map.put("last", "Rizki");
        map.put("middle", "Amin");

        Set<String> keys = map.keySet();

        for (var key : keys){
            System.out.println(key);
        }
    }
}
