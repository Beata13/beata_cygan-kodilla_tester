package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamps {
    String name;
    String size;
    String ifStamped;

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getStamp() {
        return ifStamped;
    }

    public Stamps(String name, String size, String stamp) {
        this.name = name;
        this.size = size;
        this.ifStamped = stamp;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamps stamps = (Stamps) o;
        return Objects.equals(name, stamps.name) && Objects.equals(size, stamps.size) && Objects.equals(ifStamped, stamps.ifStamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, ifStamped);
    }
    @Override
    public String toString(){
        return "Stamp{" + "stampName='" + name + '\'' + ", stampSize='"
                + size + '\'' + ", ifStampes=" + ifStamped + '}';
    }
}
