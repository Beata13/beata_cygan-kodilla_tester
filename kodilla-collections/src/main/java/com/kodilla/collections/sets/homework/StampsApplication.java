package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
Set<Stamps> stamp = new HashSet<>();
stamp.add(new Stamps("Stamp1", "20x30cm", "No"));
stamp.add(new Stamps("Stamp2", "20x20cm", "Yes"));
stamp.add(new Stamps("Stamp3", "15x30cm", "No"));
stamp.add(new Stamps("Stamp1", "20x30cm", "No"));
        System.out.println(stamp.size());
for (Stamps stamps: stamp)
    System.out.println(stamps);

    }
}
