package com.company;

public class FactoryCreator {

    public static BikeFactory createFactory(String type) {

        switch (type.toLowerCase()) {
            case "mountain bike":
                return new MountainBikeFactory();
            case "road bike":
                return new RoadBikeFactory();
            default:
                System.out.println("Invalid bike type");
                return null;

        }

    }

}
