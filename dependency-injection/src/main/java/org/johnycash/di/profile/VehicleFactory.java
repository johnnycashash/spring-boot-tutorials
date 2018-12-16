package org.johnycash.di.profile;

public class VehicleFactory {
    public VehicleService getVehicle(String type) {
        VehicleService vehicleService;
        switch (type) {
            case "car":
                vehicleService = new CarVehicle();
                break;
            case "bike":
                vehicleService = new BikeVehicle();
                break;
            case "cycle":
                vehicleService = new CycleVehicle();
                break;
            case "truck":
                vehicleService = new TruckVehicle();
                break;
            default:
                vehicleService = new CarVehicle();

        }
        return vehicleService;
    }
}
