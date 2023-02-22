package AdapterDesignPattern;

import lombok.Setter;

@Setter
public class CollegeStudent implements Student{
    private String firstName;
    private String surName;
    private String email;
    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getSurName() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }
}
