package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Saiful");

        Set<String> mutable = new HashSet<>();
        mutable.add("Saiful");
        mutable.add("Amin");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Saiful", "Amin", "Rizki");

        // set.remove("Saiful"); ERROR
    }
}
