package model;

/**
 * Created by Vladyslava_Hubenko on 8/15/2018.
 */
public enum UserRole {
    DRIVER("DRIVER"), PASS("PASS"), MECHANIC("MECHANIC");

    private String name;

    UserRole(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
