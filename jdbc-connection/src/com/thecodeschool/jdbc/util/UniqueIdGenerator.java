package com.thecodeschool.jdbc.util;

public class UniqueIdGenerator {
    private int uniqueId = 0;

    public int getUniqueId() {
        return uniqueId++;
    }
}
