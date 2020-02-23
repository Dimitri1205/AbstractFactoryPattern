package com.company;

public class MountainBikeTyre extends Tyre {

    private static final String width = "WIDE";
    private static final String presure = "MEDIUM";

    @Override
    void getDescription() {
        System.out.println("Mountain Bike Tyre. Width: " + width + " presure: " + presure);
    }
}
