package org.johnycash.di.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//using config class @Component
//using config class @Profile("BikeVehicle")
public class BikeVehicle implements VehicleService {
    @Override
    public String drive() {
        return "Turn the accelerator";
    }
}
