package com.overaitis.inclass_5_2;

public enum GenderTypes {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Unidentifiable");

    private final String readableName;
    GenderTypes(String readableName) {
        this.readableName = readableName;
    }

    public String getReadableName() {
        return readableName;
    }
}
