package Lambda.App;

import Lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Saiful";
//            }
//        };
//
//        System.out.println(simpleAction1.action("Saiful"));
//
//        SimpleAction simpleAction2 = (String name) ->{
//            return "Hello " + name;
//        };
//
//        System.out.println(simpleAction2.action("Saiful"));

        SimpleAction simpleAction1 = (String name) ->{
            return "Hello " + name;
        };

        SimpleAction simpleAction2 = (name)->{
            return "Hello " + name;
        };

        System.out.println(simpleAction1.action("Saiful"));
        System.out.println(simpleAction2.action("amin"));

        SimpleAction simpleAction3 = (String name) -> "Hello " + name;

        SimpleAction simpleAction4 = (name) -> "Hello " + name;

        SimpleAction simpleAction5 = name -> "Hello " + name;
    }
}
