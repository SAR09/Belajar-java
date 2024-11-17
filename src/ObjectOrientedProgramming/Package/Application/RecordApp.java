package ObjectOrientedProgramming.Package.Application;

import ObjectOrientedProgramming.Package.Data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Saiful", "rahasia");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Saiful"));
        System.out.println(new LoginRequest("Saiful", "rahasia"));
    }
}
