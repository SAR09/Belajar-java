package ObjectOrientedProgramming.Package.Application;

import ObjectOrientedProgramming.Package.Data.LoginRequest;
import ObjectOrientedProgramming.Package.Error.ValidationException;
import ObjectOrientedProgramming.Util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, null);

        try{
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException exception){
            System.out.println("Terjadi Error Dengan Pesan: " + exception.getMessage());
        } finally {
            System.out.println("Selalu Dieksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");
    }
}
