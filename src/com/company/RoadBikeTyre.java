package com.company;

public class RoadBikeTyre extends Tyre {

    private static final String width = "NARROW";

    @Override
    void getDescription() {
        System.out.println("Road Bite Tyre. Width: " + width);
    }
}
