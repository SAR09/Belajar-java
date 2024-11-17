package Generic.Application;

import Generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Saiful");
        process(stringMyData);

    }

    public static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());
    }
}
