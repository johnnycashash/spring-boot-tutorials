package org.johnycash.di.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//using config class @Component
//using config class @Profile("CycleVehicle")
public class CycleVehicle implements VehicleService {
    @Override
    public String drive() {
        return "Paddle the wheel";
    }
}
