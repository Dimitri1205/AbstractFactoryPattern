package com.company;

public class RoadBikeFactory extends BikeFactory {

    @Override
    BikePart create(String type) {
        switch (type.toLowerCase()) {
            case "tyre":
                return new RoadBikeTyre();
            case "handlebar":
                return new RoadBikeHandlebar();
            default:
                return null;
        }
    }
}
