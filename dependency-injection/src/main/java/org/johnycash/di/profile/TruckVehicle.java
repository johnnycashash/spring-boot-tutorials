package org.johnycash.di.profile;

public class TruckVehicle implements VehicleService {
    @Override
    public String drive()  {
        return "Push accelerator hard";
    }
}
