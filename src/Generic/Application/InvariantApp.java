package Generic.Application;

import Generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Saiful");
//        doIt(stringMyData); //ERROR

    }

    public static void doIt(MyData<Object> objectMyData){

    }
}
