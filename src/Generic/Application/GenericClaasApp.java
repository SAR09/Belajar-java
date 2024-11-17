package Generic.Application;

import Generic.MyData;

public class GenericClaasApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Saiful");
        MyData<Integer> integerMyData = new MyData<Integer>(22);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
