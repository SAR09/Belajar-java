package Lambda.App;

import Lambda.Util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
//        Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("saiful"));
        System.out.println(predicateIsLowerCase.test("Saiful"));

        // Method Referencce di Paramater

//        Function<String, String> functionUpper = value -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("Saiful"));
    }

    public void run(){
        //Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("saiful"));
        System.out.println(predicateIsLowerCase.test("Saiful"));
    }

    public void run2(){

        MethodReferenceApp app = new MethodReferenceApp();

        //Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = app::isLowerCase;

        System.out.println(predicateIsLowerCase.test("saiful"));
        System.out.println(predicateIsLowerCase.test("Saiful"));
    }

    public boolean isLowerCase(String value){
        for (var c : value.toCharArray()){
            if (!Character.isLowerCase(c)){
                return  false;
            }
        }
        return true;
    }
}
