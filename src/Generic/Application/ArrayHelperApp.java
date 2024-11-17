package Generic.Application;

import Generic.Util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Saiful", "Amin", "Rizki"};
        Integer[] numbers = {1,2,3,4,5};

        System.out.println(
                ArrayHelper.count(numbers)
        );
    }
}
