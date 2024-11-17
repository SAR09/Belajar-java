package Generic.Application;

import Generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("Saiful", 100);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
