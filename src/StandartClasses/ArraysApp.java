package StandartClasses;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                1,232,24,342,12,435,2,31,43,32
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 12));
        System.out.println(Arrays.binarySearch(numbers, 435));

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));
    }
}
