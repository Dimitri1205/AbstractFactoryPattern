package com.company;

public class RoadBikeHandlebar extends Handlebar {

    private static final String type = "DROP";

    @Override
    void getDescription() {
        System.out.println("Road Bike Handlebar. Type: " + type);
    }
}
