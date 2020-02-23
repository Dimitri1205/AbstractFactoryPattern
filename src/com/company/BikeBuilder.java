package com.company;

public class BikeBuilder {

    public static void main(String[] args) {

        createBikeWithoutAbstractFactory();

        createBikeWithExtecibleAbstractFactory("mountain bike");
        createBikeWithExtecibleAbstractFactory("road bike");

    }

    public static void createBikeWithoutAbstractFactory () {

        MountainBikeTyre mountainBikeTyreFront = new MountainBikeTyre();
        MountainBikeTyre mountainBikeTyreBack = new MountainBikeTyre();
        MountainBikeHandlebar mountainBikeHandlebar = new MountainBikeHandlebar();
        mountainBikeTyreFront.getDescription();
        mountainBikeTyreBack.getDescription();
        mountainBikeHandlebar.getDescription();
        System.out.println("---------------------------");
    }

    public static void createBikeWithExtecibleAbstractFactory(String type) {

        BikeFactory bikeFactory = FactoryCreator.createFactory(type);
        Tyre tyreFront = (Tyre) bikeFactory.create("tyre"); //return type is BikePart so it needs to be cast
        Tyre tyreBack = (Tyre) bikeFactory.create("tyre");
        Handlebar handlebar = (Handlebar) bikeFactory.create("handlebar");

        tyreFront.getDescription();
        tyreBack.getDescription();
        handlebar.getDescription();
        System.out.println("---------------------------");

    }

}
