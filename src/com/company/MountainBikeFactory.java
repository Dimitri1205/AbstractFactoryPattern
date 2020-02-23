package com.company;

public class MountainBikeFactory extends BikeFactory {


    @Override
    BikePart create(String type) {
        switch (type.toLowerCase()) {
            case "tyre":
                return new MountainBikeTyre();
            case "handlebar":
                return new MountainBikeHandlebar();
            default:
                return null;
        }
    }
}
