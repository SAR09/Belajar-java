package ObjectOrientedProgramming.Package.Data;

public record LoginRequest(String username, String password) {
    public LoginRequest{
        System.out.println("Constructor Utama");
    }

    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest(){
        this("", "");
    }


}
