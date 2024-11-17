package ObjectOrientedProgramming.Package.Data;

public enum Level {
    STANDART("Standart Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
