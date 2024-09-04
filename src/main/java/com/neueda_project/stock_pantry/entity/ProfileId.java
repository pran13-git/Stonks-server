package com.neueda_project.stock_pantry.entity;

import java.io.Serializable;
import java.util.Objects;

public class ProfileId implements Serializable {

    private String name;
    private String ifscCode;

    public ProfileId() {
        // Default constructor
    }

    public ProfileId(String name, String ifscCode) {
        this.name = name;
        this.ifscCode = ifscCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfileId profileId = (ProfileId) o;
        return Objects.equals(name, profileId.name) && Objects.equals(ifscCode, profileId.ifscCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ifscCode);
    }
}

