package com.overaitis.inclass_5_2;

public abstract class NatesWorldPerson {

    private final GenderTypes gender;
    public NatesWorldPerson(GenderTypes gender) {
        this.gender = gender;
    }

    public GenderTypes getGender() {
        return gender;
    }
}
