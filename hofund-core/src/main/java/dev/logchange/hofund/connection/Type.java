package dev.logchange.hofund.connection;

public enum Type {
    DATABASE("database"),
    RESTAPI("restapi");


    private final String name;

    Type(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
