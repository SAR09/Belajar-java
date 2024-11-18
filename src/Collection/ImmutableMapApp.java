package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String , String> singleton = Collections.singletonMap("name", "Saiful");

        Map<String,String> mutable = new HashMap<>();
        mutable.put("name", "Saiful");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first", "Saiful",
                "middle", "Amin",
                "last", "Rizki"
        );

        //map.put("a", "A"); ERROR
    }
}
