package org.johnycash.di.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//using config class @Component
//using config class @Profile({"default", "CarVehicle"})
public class CarVehicle implements VehicleService {
    @Override
    public String drive() {
        return "Push the accelerator";
    }
}
