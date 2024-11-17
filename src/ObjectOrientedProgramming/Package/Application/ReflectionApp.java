package ObjectOrientedProgramming.Package.Application;

import ObjectOrientedProgramming.Package.Data.CreateUserRequest;
import ObjectOrientedProgramming.Util.ValidationUtil;

public class ReflectionApp {

    public static void main(String[] args) {

        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setPassword("Rahasia");
        createUserRequest.setUsername("Saiful");

        ValidationUtil.validationReflection(createUserRequest);
    }
}
