package com.company;

public class MountainBikeHandlebar extends Handlebar {

    private static final String type = "FLAT";

    @Override
    void getDescription() {
        System.out.println("Mountain Bike Handlebar. Type: " + type);
    }
}
