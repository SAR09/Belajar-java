package ObjectOrientedProgramming.Package.Application;

import ObjectOrientedProgramming.Package.Error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Admin", "Rahasia");
        System.out.println("Sukses Connect Database");
    }
    public static void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("Tidak Bisa Connect Database");
        }
    }
}
