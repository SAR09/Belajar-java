package Collection;

import ObjectOrientedProgramming.Package.Data.Level;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class EnumHashMapApp {

    public static enum Level{
        FREE, STANDART, PREMIUM, VIP
    }

    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<Level, String>(Level.class);
        map.put(Level.FREE, "Saiful");
        map.put(Level.VIP, "Rizki");

        for (var key : map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
