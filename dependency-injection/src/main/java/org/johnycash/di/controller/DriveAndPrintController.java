package org.johnycash.di.controller;

import org.johnycash.di.profile.VehicleService;
import org.johnycash.di.qualifier.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//@Controller
public class DriveAndPrintController {
//    @Autowired
    private VehicleService vehicleService;
//    @Autowired
//    @Qualifier("truckVehicle")
    private VehicleService truckVehicleService;
    //will see @Component of type above or if any @Bean in @Configuration of type above
//    @Autowired
//    @Qualifier("laserPrint")
    private PrintService printService;

    public void setVehicleService(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public void setTruckVehicleService(VehicleService truckVehicleService) {
        this.truckVehicleService = truckVehicleService;
    }

    public void setPrintService(PrintService printService) {
        this.printService = printService;
    }

    public String driveTheVehicle() {
        System.out.println(truckVehicleService.drive());
        return vehicleService.drive();
    }

    public String printMessage() {
        return printService.print();
    }
}
