package org.johnycash.di.config;

import org.johnycash.di.profile.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class VehicleConfig {
    //recommended when you have no control over the source code
    //example datasource config, hibernate config, third party lib, jms but not for below custom classes
    //as @component can be used there
   /* @Bean
    @Profile({"default", "CarVehicle"})
    public VehicleService getCarVehicleService(){
        return new CarVehicle();
    }
    @Bean
    @Profile("BikeVehicle")
    public VehicleService getBikeVehicleService(){
        return new BikeVehicle();
    }
    @Bean
    @Profile("CycleVehicle")
    public VehicleService getCycleVehicleService(){
        return new CycleVehicle();
    }*/

    @Bean
    public VehicleFactory vehicleFactory(){
        return new VehicleFactory();
    }

    @Bean
    @Profile({"default", "CarVehicle"})
    @Primary
    public VehicleService carVehicle(VehicleFactory vehicleFactory){
        return vehicleFactory.getVehicle("car");
    }
    @Bean
    @Profile("BikeVehicle")
    @Primary
    public VehicleService bikeVehicle(VehicleFactory vehicleFactory){
        return vehicleFactory.getVehicle("bike");
    }
    @Bean
    @Profile("CycleVehicle")
    @Primary
    public VehicleService cycleVehicle(VehicleFactory vehicleFactory){
        return vehicleFactory.getVehicle("cycle");
    }
    @Bean
    public VehicleService truckVehicle(VehicleFactory vehicleFactory){
        return vehicleFactory.getVehicle("truck");
    }
}
